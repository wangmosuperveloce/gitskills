package json.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtil {

    public static String post(String url, String uri) {
        PrintWriter out = null;
        BufferedReader in = null;
        String responseStr = "";
        try {
            URL realUrl = new URL(url);
            //URI uriObj = new URI(uri);
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            out.print(uri);
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                responseStr += line;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseStr;
    }

}