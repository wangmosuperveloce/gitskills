package http;

import javax.net.ssl.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.google.common.collect.Maps;
//import com.weibangong.utils.JsonUtil;
//
//import javax.net.ssl.*;
//import java.io.*;
//import java.net.URL;
//import java.net.URLConnection;
//import java.net.URLEncoder;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;

public class HttpUtil {

    private static SSLSocketFactory init() throws Exception {

        class MyX509TrustManager implements X509TrustManager {

            private MyX509TrustManager() throws Exception {
            }

            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[]{};
            }
        }
        TrustManager[] tm = {new MyX509TrustManager()};
        System.setProperty("https.protocols", "TLSv1");
        SSLContext sslContext = SSLContext.getInstance("TLSv1", "SunJSSE");
        sslContext.init(null, tm, new java.security.SecureRandom());
        return sslContext.getSocketFactory();
    }

    private static String generateContent(Map<String, String> param) {
        if (param == null || param.size() == 0) {
            return "";
        }
        List<String> kvPairs = new ArrayList<>(param.size());
        for (Map.Entry<String, String> entry : param.entrySet()) {
            try {
                kvPairs.add(entry.getKey() + '=' + URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (Exception ignored) {
            }
        }
        String content = "";
        if (kvPairs.size() == 1) {
            content = kvPairs.get(0);
        } else {
            for (String pair : kvPairs) {
                content = content + pair + '&';
            }
            content = content.substring(0, content.length() - 1);
        }
        return content;
    }

    private static String sendHttpsPost(String POST_URL, String content) throws IOException {
        String re = "";
        try {
            URL myURL = new URL(POST_URL);
            HttpsURLConnection con = (HttpsURLConnection) myURL.openConnection();
            HostnameVerifier hostNameVerify = new HostnameVerifier() {
                public boolean verify(String urlHostName, SSLSession session) {
                    System.out.println(urlHostName);
                    return true;
                }
            };
            con.setHostnameVerifier(hostNameVerify);
            try {
                con.setSSLSocketFactory(init());
            } catch (Exception e1) {
                throw new IOException(e1);
            }

            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("POST");
            con.setUseCaches(false);
            con.setInstanceFollowRedirects(true);
            con.setRequestProperty("Content-Type ", " application/x-www-form-urlencoded ");
            con.connect();
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(content);
            out.flush();
            out.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                re += line;
            }
            reader.close();
            con.disconnect();
        } catch (Exception ignored) {
        }
        return re;
    }


    public static void main(String[] args) throws Exception {
        Map<String, String> param = new HashMap<>();
        param.put("access_token", "28d17658500aca8c4762726ee2f25179");
        String s = sendHttpsPost("https://api.shebaotong.com/v1/base/getcities", generateContent(param));
        System.out.println(s);

        param.put("city", "shanghai");
        s = sendHttpsPost("https://api.shebaotong.com/v1/base/getbasic", generateContent(param));
        System.out.println(s);
    }
}
