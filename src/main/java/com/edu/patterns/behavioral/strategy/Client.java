package com.edu.patterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {

        Chess chess = new Chess();
        System.out.println(chess.calculateNextStep());

        chess.setAlgorithm(new HardChessAlgorithm());
        System.out.println(chess.calculateNextStep());

    }

}
