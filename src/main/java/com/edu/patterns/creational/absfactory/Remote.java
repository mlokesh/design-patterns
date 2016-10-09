package com.edu.patterns.creational.absfactory;

public interface Remote {

    void connect2WWW(String url);
    DataInfo[] loadDB(String fileName);

}
