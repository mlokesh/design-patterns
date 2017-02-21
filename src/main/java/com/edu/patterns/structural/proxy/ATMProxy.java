package com.edu.patterns.structural.proxy;

public class ATMProxy implements GetATMData {

    public ATMState getATMData() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMData();
    }

    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }

}
