package com.example.tictactoe;

public class PointAndScore {
    int score;
    int depth;
    String[] matrix;

    public PointAndScore(String[] matrix,int score, int depth) {
        this.score = score;
        this.depth = depth;
        this.matrix = matrix;
    }

    public int getScore() {
        return score;
    }

    public void setMatrix(String[] matrix) {
        this.matrix = matrix;
    }
}
