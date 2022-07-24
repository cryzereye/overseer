package com.overseer.controllers.interf;

import com.overseer.models.interf.BotModel;
import com.overseer.models.interf.ConfigModel;

public interface Generator {
    String generateBotConfigJSON();

    void addConfig(ConfigModel config);
    void updateConfig(ConfigModel config);
    void deleteConfig(String botname, String key);
    void deleteAllBotConfig(String botname);
    String printAllConfig(int botID);

    void addBot(BotModel bot);
    void updateBot(BotModel bot);
    void deleteBot(String botname);
    String printAllBotDetails();
}