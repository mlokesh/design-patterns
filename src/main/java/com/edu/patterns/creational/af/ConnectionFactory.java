package com.edu.patterns.creational.af;

public interface ConnectionFactory {

    Local getLocalConnection();
    Remote getRemoteConnection();

}
