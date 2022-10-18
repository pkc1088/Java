package com.cafe.menu;

public class Coffee extends Beverage {
    private int defaultShot;

    public Coffee(String name) {
        super(name);
        basePrice = 4100;
        size = 0;
    }


}
