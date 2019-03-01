package com.allen.an.fgo;


import org.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Constructr {
    private static final String SOURCE = "./m.json";
    private static final String CLASSSOURCE = "./class.txt";
    static HashMap<String ,Servent> map = new LinkedHashMap<>();
    static HashMap<String,String> mapC = new LinkedHashMap<>();
    public void load(){
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
                s = new Servent();
                json = new JSONObject(line);
                s.setId(index+"");
                s.setName((String)json.get("name"));

                System.out.println();
                index++;
            }
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
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
                mapC.put(temp[0],temp[1]);
            }
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



