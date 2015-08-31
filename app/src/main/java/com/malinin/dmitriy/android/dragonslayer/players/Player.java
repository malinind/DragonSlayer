package com.malinin.dmitriy.android.dragonslayer.players;

/**
 * Created by dmitriy on 29.03.2015.
 */
public class Player {

    private int strength;
    private int dexterity;
    private int defense;
    private int health;
    private int lucky;

    private BlockPart blockPart;

    public Player() {
        this.dexterity=5;
        this.health=100;
        this.strength=5;
        this.defense=3;
        this.lucky=1;
    }

    public Player(int strength, int dexterity, int health, int lucky,int defense) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.defense=defense;
        this.health = health;
        this.lucky = lucky;
    }

    public int getStrength() {return strength;  }

    public int getDexterity() { return dexterity; }

    public int getHealth() {
        return health;
    }


    public int getDefense() { return defense; }

    public int getLucky() { return lucky;  }

    public BlockPart getBlockPart() {
        return blockPart;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setLucky(int lucky) {
        this.lucky = lucky;
    }

    public void setBlockPart(BlockPart blockPart) {
        this.blockPart = blockPart;
    }
}
