package com.company;

public class Boss extends Players {
    private int speed;
    private String names;
    public Boss (int speed , String names){
        super(speed , names);
        this.speed = speed;
        this.names = names;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}