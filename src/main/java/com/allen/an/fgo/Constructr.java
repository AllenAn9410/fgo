package com.allen.an.fgo;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public class Constructr {
    private static final String SOURCE = "./m.json";
    private static final String CLASSSOURCE = "./class.txt";
    static HashMap<String ,Servent> map = new LinkedHashMap<>();
    static HashMap<String,String> mapC = new LinkedHashMap<>();

    Constructr(){
        loadClass(CLASSSOURCE);
        read(SOURCE);
    }

    public static String read(String path) {
        File file = new File(path);
        JSONObject json = null;
        Servent s = null;
        StringBuffer buffer = new StringBuffer();
        InputStream is;
        try {
            String line;
            is = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            int index = 1;
            while ((line = reader.readLine()) != null) {
                List sumList = new ArrayList();
                List skmList = new ArrayList();
                s = new Servent();
                json = new JSONObject(line);
                s.setId(index+"");
                s.setName((String)json.get("name"));
                s.setClassName(mapC.get(s.getName()));
                System.out.println();

                if(json.has("sum")){
                    JSONArray skmArr = json.getJSONArray("sum");
                    circJsonArr(skmArr,sumList);
                    s.setLimitBreak(sumList);

                }
                JSONArray skmArr = json.getJSONArray("skm");
                circJsonArr(skmArr,skmList);
                s.setSkillsMaterials(skmList);
                index++;
               //System.out.println(s.toString());
                map.put(s.getName(),s);
            }
            reader.close();
            is.close();
        } catch (JSONException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    private static void circJsonArr(JSONArray arr, List list){
        for(int i=0;i<arr.length();i++){
            list.add(arr.get(i));
        }

    }


    public static void loadClass(String path) {
        File file = new File(path);
        InputStream is;
        try {
            String line;
            is = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(":");
                if(temp.length<2){
                    continue;
                }
                mapC.put(temp[0].trim(),temp[1].trim());
            }
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEmpty(String str){
        if(str == null || str.length()==0){
            return true;
        }
        return false;
    }
}



