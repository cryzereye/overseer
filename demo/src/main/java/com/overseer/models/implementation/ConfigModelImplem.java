package com.overseer.models.implementation;

import com.overseer.models.interf.ConfigModel;

public class ConfigModelImplem implements ConfigModel{

    private int uniqueID;
    private String key;
    private String value;
    private int botID;

    public ConfigModelImplem(String key, String value, int botID){
        this.key = key;
        this.value = value;
        this.botID = botID;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value){
        this.value = value;
    }

    public void setBotID(int botID){
        this.botID = botID;
    }

    public String getKey(){
        return this.key;
    }

    public String getValue(){
        return this.value;
    }

    public int getBotID(){
        return this.botID;
    }

    public int getUniqueID(){
        return this.uniqueID;
    }
}