package com.overseer.models.implementation;

import com.overseer.models.interf.BotModel;

public class BotModelImplem implements BotModel{

    private int uniqueID;
    private String botname;
    private String location;

    public BotModelImplem(String botname, String location){
        this.botname = botname;
        this.location = location;
    }

    public void setBotname(String botname){
        this.botname = botname;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getBotname(){
        return this.botname;
    }

    public String getLocation(){
        return this.location;
    }

    public int getUniqueID(){
        return this.uniqueID;
    }

}