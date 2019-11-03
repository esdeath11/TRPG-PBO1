package com.pbo1;

import java.util.Scanner;

public class Player{
    String Name;
    int health = 100;
    int mana = 100;
    int attack = 10;
    int stamina = 50;

    public Player(){
        this.Name = "";
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String newName){
        this.Name = newName;
    }
}
