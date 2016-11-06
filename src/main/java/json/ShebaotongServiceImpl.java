package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import json.model.CitiesVO;
import json.model.City;
import json.util.HttpUtil;

import java.io.IOException;
import java.util.List;

/**
 * Created by wangmo on 16/10/12.
 */
public class ShebaotongServiceImpl {



    @Inject
    private ObjectMapper objectMapper = new ObjectMapper();

    public CitiesVO getCities() {
        String url = "http://test.shebaotong.com/base/getcities";
        String uri = "access_token=" + "30067340e0cd3b8f46fe4627fd5a328f";
        String responseStr = HttpUtil.post(url, uri);
        List<City> cities = null;
        try {
            cities = objectMapper.readValue(responseStr, new TypeReference<List<City>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        CitiesVO citiesVO = new CitiesVO();
        citiesVO.setCities(cities);
        return citiesVO;
        //        List<City> cities = new ArrayList<>();
//        try {
//            JSONArray jsonArray = new JSONArray(responseStr);
////            System.out.println(jsonArray.length());
//            for (int i=0; i < jsonArray.length(); i++) {
//                City city = new City();
//                city.setRegion(jsonArray.getJSONObject(i).get("region").toString());
//                city.setProv(jsonArray.getJSONObject(i).get("prov").toString());
//                city.setPname(jsonArray.getJSONObject(i).get("pname").toString());
//                city.setCity(jsonArray.getJSONObject(i).get("city").toString());
//                city.setCname(jsonArray.getJSONObject(i).get("cname").toString());
//                city.setMonth(jsonArray.getJSONObject(i).get("month").toString());
//                city.setRule(Integer.parseInt(jsonArray.getJSONObject(i).get("rule").toString()));
//                city.setSubdl(Integer.parseInt(jsonArray.getJSONObject(i).get("subdl").toString()));
//                city.setTimestamp(jsonArray.getJSONObject(i).get("region").toString());
//                cities.add(city);
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        citiesVO.setCities(cities);
    }

    public void getBaseData(CitiesVO cities) {
        String url = "http://test.shebaotong.com/base/getbasic";
        String accessToken = "access_token=" + "30067340e0cd3b8f46fe4627fd5a328f" + "&city=";
        String responseStr = "";
        int i=0;
        for (City city : cities.getCities()) {
            String uri = accessToken + city.getCity();
            responseStr = HttpUtil.post(url, uri);
            System.out.println(responseStr);
            responseStr = responseStr.replace("empfee", "empprop").replace("orgfee", "orgprop");
//            BaseDataVO baseDataVO = JsonUtil.deserialize(responseStr, BaseDataVO.class);
//            System.out.println(baseDataVO);
            System.out.println();
            i++;
        }
        System.out.println(i);
    }
}
