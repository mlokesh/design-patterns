package com.edu.patterns.creational.af;

public interface Remote {

    void connect2WWW(String url);
    DataInfo[] loadDB(String fileName);
}
