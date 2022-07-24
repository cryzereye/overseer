package com.overseer.controllers.implementation;

import org.springframework.stereotype.Component;
import com.overseer.controllers.interf.ConfigEditor;

@Component
public class ConfigEditorImplem implements ConfigEditor{
    public void addConfig(String key, String value, int botID){

    }
    public void updateConfig(String key, String value, int botID) {

    }
    public void deleteConfig(String key) {

    }
    public String printAllConfig(int botID){
        return "";
    }
}