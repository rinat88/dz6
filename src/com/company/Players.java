package com.company;

public class Players {
    private int speed;
    private String names;
    public Players(int speed , String names){
        this.speed = speed;
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
