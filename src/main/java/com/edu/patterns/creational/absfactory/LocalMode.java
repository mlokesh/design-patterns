package com.edu.patterns.creational.absfactory;

public class LocalMode implements Local {

    public DataInfo[] loadDB(String fileName) {
        System.out.println("Load from a local database");
        return null;
    }
}
