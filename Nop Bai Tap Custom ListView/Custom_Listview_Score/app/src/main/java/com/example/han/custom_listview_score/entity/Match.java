package com.example.han.custom_listview_score.entity;

/**
 * Created by Han on 3/6/2018.
 */

public class Match {
    String Score;
    int FlagLeft;
    int FlagRight;

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public int getFlagLeft() {
        return FlagLeft;
    }

    public void setFlagLeft(int flagLeft) {
        FlagLeft = flagLeft;
    }

    public int getFlagRight() {
        return FlagRight;
    }

    public void setFlagRight(int flagRight) {
        FlagRight = flagRight;
    }
}
