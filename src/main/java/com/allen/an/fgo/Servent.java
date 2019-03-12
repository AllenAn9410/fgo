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
        b.append("name").append(":").append("\"").append(name).append("\"").append(",").append("\n");
        b.append("photo").append(":").append("\"").append(photo).append("\"").append(",").append("\n");
        b.append("className").append(":").append("\"").append(className).append("\"").append(",").append("\n");
        if(limitBreak.size() != 0){
            b.append("limitBreak").append(":").append("[").append("\n");
            for(int i=0;i<limitBreak.size();i++){
                //b.append("{");
                b.append(limitBreak.get(i));
                //b.append("}");
                if(i != limitBreak.size()-1){
                    b.append(",");
                }
                b.append("\n");
            }
            b.append("]");
            b.append(",").append("\n");
        } else {
            b.append("limitBreak").append(":").append("null").append("\n");
        }
        b.append("skillsName").append(":").append("[");
        if(skillsName == null || skillsName.size()==0){
            b.append("\"技能1\"").append(",").append("\"技能2\"").append(",").append("\"技能3\"");
        } else {
            for(int i=0;i<skillsName.size();i++){
                b.append(skillsName.get(i));
                if(i != skillsName.size()-1){
                    b.append(",");
                }
            }
        }
        b.append("]").append(",").append("\n");
        b.append("skillsMaterials").append(":").append("[").append("\n");
        for(int i=0;i<skillsMaterials.size();i++){
            b.append(skillsMaterials.get(i));
            if(i != skillsMaterials.size()-1){
                b.append(",");
            }
            b.append("\n");
        }
        b.append("]").append("\n");
        b.append("}").append("\n");
        return b.toString();

    }

    private String id;
    private String name="";
    private String photo="";
    private String className="";
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
