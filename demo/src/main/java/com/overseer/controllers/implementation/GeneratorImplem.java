package com.overseer.controllers.implementation;

import org.springframework.stereotype.Component;
import com.overseer.controllers.interf.Generator;
import com.overseer.models.interf.BotModel;
import com.overseer.models.interf.ConfigModel;

@Component("generatorimplem")
public class GeneratorImplem implements Generator{
    public String generateBotConfigJSON() {
        return "";
    }

    public void addConfig(ConfigModel config) {

    }

    public void updateConfig(ConfigModel config){

    }

    public void deleteConfig(String botname, String key){

    }

    public void deleteAllBotConfig(String botname){

    }

    public String printAllConfig(int botID){
        return "";
    }

    public void addBot(BotModel bot){

    }

    public void updateBot(BotModel bot){

    }

    public void deleteBot(String botname){

    }

    public String printAllBotDetails(){
        return "";
    }
}