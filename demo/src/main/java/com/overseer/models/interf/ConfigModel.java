package com.overseer.models.interf;

public interface ConfigModel {
    void setKey(String key);
    void setValue(String value);
    void setBotID(int botID);
    String getKey();
    String getValue();
    int getBotID();
    int getUniqueID();

}