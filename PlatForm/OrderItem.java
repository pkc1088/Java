package com.cafe.order;

import com.cafe.menu.*;

public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    public String toString() {
        return ("[ name="+this.beverage.getName()+", Price="
                + this.beverage.getPrice()+", size="+this.beverage.getSize()
                + ", quantity="+this.quantity+" ]");
    }
}
