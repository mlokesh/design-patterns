package com.edu.patterns.creational.absfactory;

public class Test {

    public static void main(String[] args) {

        DataManager dm = new DataManager();
        DataInfo[] di = null;

        String dbFileName = "db.db";

        if (args.length == 1) {
            dm.setConnection(true);
            LocalMode lm = (LocalMode) dm.getLocalConnection();
            di = lm.loadDB(dbFileName);
        } else {
            RemoteMode rm = (RemoteMode) dm.getRemoteConnection();
            rm.connect2WWW("www.javacamp.org./db");
            di = rm.loadDB(dbFileName);
        }
    }

}
