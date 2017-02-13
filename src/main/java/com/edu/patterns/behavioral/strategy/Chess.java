package com.edu.patterns.behavioral.strategy;

class Chess {

    private ChessAlgorithm algorithm = new EasyChessAlgorithm();

    int calculateNextStep() {
        return algorithm.calculateNextStep();
    }

    void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

}
