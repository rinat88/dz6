package com.company;

public abstract class Players {
    private int health;
    private String names;
    public Players(int health , String names){
        this.health = health;
        this.names = names;
    }

    public Players() {
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract String hit();


}
