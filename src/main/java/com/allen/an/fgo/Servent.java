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
                {{},{}},
                {{},{}},
                {{},{}},
                {{},{}},
                {{},{}},
                {{},{}},
                {{},{}},
                {{},{}},
                {{}}
            ]
        }
     */

    // This is the most complex 'to string' function I've ever encountered in my life
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("{").append("\n");
        b.append("id").append(":").append("\"").append(id).append("\"").append(",").append("\n");
        b.append("photo").append(":").append("\"").append(photo).append("\"").append(",").append("\n");
        b.append("className").append(":").append("\"").append(className).append("\"").append(",").append("\n");
        b.append("limitBreak").append(":").append("[").append("\"");
        if(limitBreak.size() != 0){
            for(int i=0;i<limitBreak.size();i++){
                b.append("{");
                b.append(limitBreak.get(i));
                b.append("}");
                if(i != limitBreak.size()-1){
                    b.append(",");
                }
                b.append("\n");
            }
            b.append(",");
        }
        b.append("]");
        b.append("skillsName").append(":").append("[").append("\"");
        for(int i=0;i<skillsName.size();i++){
            b.append(skillsName.get(i)).append("\n");
        }
        b.append("]");
        b.append("skillsMaterials").append(":").append("[").append("\"");
        for(int i=0;i<skillsMaterials.size();i++){
            b.append("{").append(skillsMaterials.get(i)).append("}");
            if(i != limitBreak.size()-1){
                b.append(",");
            }
            b.append("\n");
        }
        b.append("]").append("\n");
        b.append("}").append("\n");
        return "";

    }

    private String id;
    private String name;
    private String photo;
    private String className;
    private List limitBreak  = new ArrayList();
    private List skillsName = new ArrayList<>();
    private List skillsMaterials = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List getLimitBreak() {
        return limitBreak;
    }

    public void setLimitBreak(List limitBreak) {
        this.limitBreak = limitBreak;
    }

    public List getSkillsName() {
        return skillsName;
    }

    public void setSkillsName(List skillsName) {
        this.skillsName = skillsName;
    }

    public List getSkillsMaterials() {
        return skillsMaterials;
    }

    public void setSkillsMaterials(List skillsMaterials) {
        this.skillsMaterials = skillsMaterials;
    }
}
