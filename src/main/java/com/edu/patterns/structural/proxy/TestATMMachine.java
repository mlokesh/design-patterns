package com.edu.patterns.structural.proxy;

public class TestATMMachine {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);

        GetATMData proxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + proxy.getATMData());
        System.out.println("\nCash In ATM Machine " + proxy.getCashInMachine());

    }

}
