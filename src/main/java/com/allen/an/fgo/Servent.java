package com.allen.an.fgo;

import java.util.*;

public class Servent {
    /*
        {
            id:0,
            name:"",
            photo:"",
            className:"",
            limitBreak:[
               { {name:"",num:""}, {name:"",num:""} },
               { {name:"",num:""}, {name:"",num:""} },
               { {name:"",num:""}, {name:"",num:""} },
               { {name:"",num:""}, {name:"",num:""} }
            ],
            skillsName:[ ... , ... , ...],
            skillsMaterials:[
                2:[{},{}],
                3:[{},{}],
                4:[{},{}],
                5:[{},{}],
                6:[{},{}],
                7:[{},{}],
                8:[{},{}],
                9:[{},{}],
                10:[]
            ]
        }
     */

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("{").append("\n");
        b.append("id").append(":").append("\"").append(id).append("\"").append(",").append("\n");
        b.append("photo").append(":").append("\"").append(photo).append("\"").append(",").append("\n");
        b.append("className").append(":").append("\"").append(className).append("\"").append(",").append("\n");
        b.append("limitBreak").append(":").append("[").append("\"");
        // This is the most complex string I've ever encountered in my life
        if(limitBreak.size() != 0){
            for(int i=0;i<limitBreak.size();i++){
                b.append("{");
                b.append(limitBreak.get(i));
                b.append("}");
                if(i != limitBreak.size()-1){
                    b.append(",");
                }
            }
            b.append(",");
        }
        b.append("skillsName").append(":").append("[").append("\"");
        for(int i=0;i<skillsName.size();i++){

        }



        return "";

    }

    private String id;
    private String name;
    private String photo;
    private String className;
    private List limitBreak  = new ArrayList();
    private List skillsName = new ArrayList<>();
    private List skillsMaterials = new ArrayList<>();

}
