package com.allen.an.fgo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @RequestMapping("/go")
    public String fgoStart(){
        Constructr c = new Constructr();
        HashMap<String,Servent> map = Constructr.map;
        StringBuilder sb = new StringBuilder();
        for(Map.Entry entry : map.entrySet()){
            sb.append(entry.getValue()).append(",").append("\n");
        }
        System.out.println(sb.toString());
        return sb.toString();

    }


}
