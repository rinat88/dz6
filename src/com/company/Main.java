package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Physical physical = new Physical(200 , "Assassin");
        physical.setNames("Assassin");
        physical.setHealth(200);

        System.out.println(physical.getHealth() + " " + physical.getNames() + " " + physical.hit());

        Magical magical = new Magical(150,"Rubik");
        magical.setHealth(150);
        magical.setNames("Rubik");

        System.out.println(magical.getHealth() + " " + magical.getNames() + " " + magical.hit());

        Mental mental = new Mental(120 , "Silencer");
        System.out.println(mental.getHealth() + " " + mental.getNames());


        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setNames("Axe");
        System.out.println(boss.getHealth() + " " +  boss.getNames());












    }

}

