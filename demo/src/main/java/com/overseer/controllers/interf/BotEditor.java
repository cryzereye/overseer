package com.overseer.controllers.interf;

public interface BotEditor {
    void addBot(String botname, String location);
    void updateBot(String botname, String location);
    void deleteBot(String botname);
    String printAllBotDetails();
}