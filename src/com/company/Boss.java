package com.company;

public class Boss extends Players {
    public String hit(){
        return "Boss super Hit";
    }

    public Boss(int health , String names) {
        super(health, names);

    }

    public Boss() {
        super();
    }
}
