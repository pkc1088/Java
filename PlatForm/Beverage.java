package com.cafe.menu;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name; int basePrice; int size;

    public Beverage(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getPrice() {
        return basePrice;
    }
    public void setPrice(String str) {
        if(str.equals("GRANDE")) {
            basePrice += GRANDE*500;
            setSize(1);
        }
        else if(str.equals("VENTI")) {
            setSize(2);
            basePrice += VENTI*500;
        }
    }
    public String getName() {
        return this.name;
    }
    public String getSize() {
        if(this.size==0) return "TALL";
        else if(this.size==1) return "GRANDE";
        else return "VENTI";
    }
    public boolean supportTest(String name, String size) {
        if(this.getClass().isInstance(new Blended(null))
          && size.equals("TALL"))
            return false;
        return true;
    }
}
