package com.codedifferently.lab.partB;

public class Coin {
    private String name;
    private double value;

    public Coin(String name, double value) {
        this.name= name;
        this.value= value;
    }

    public Coin (){
        this.name = "Penny";
        this.value = 0.01;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " ($" + value + ")";
    }
}
