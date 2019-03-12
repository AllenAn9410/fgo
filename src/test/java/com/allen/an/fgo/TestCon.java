package com.allen.an.fgo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestCon {

    Constructr c = new Constructr();

    @Test
    public void test(){
        HashMap<String,Servent> map = Constructr.map;
        for(Map.Entry entry : map.entrySet()){
            System.out.println();
        }




    }

}
