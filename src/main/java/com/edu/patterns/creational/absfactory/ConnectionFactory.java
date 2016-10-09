package com.edu.patterns.creational.absfactory;

public interface ConnectionFactory {

    Local getLocalConnection();
    Remote getRemoteConnection();

}
