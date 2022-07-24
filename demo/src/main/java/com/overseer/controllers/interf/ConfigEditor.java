package com.overseer.controllers.interf;

public interface ConfigEditor {
    void addConfig(String key, String value, int botID);
    void updateConfig(String key, String value, int botID);
    void deleteConfig(String key);
    String printAllConfig(int botID);
}