package com.cafe.order;
import java.util.*;

public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public int cost() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).quantity * items.get(i).beverage.getPrice();
        }
        return sum;
    }

    public boolean setSize(String name, String size) {

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).beverage.getName().equals(name)) {
                if(items.get(i).beverage.supportTest(name, size)) {
                    items.get(i).beverage.setPrice(size);
                    return true;
                }
            }
        }
        return false;

    }

    public void print() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[ name="+items.get(i).beverage.getName()+", Price="
            + items.get(i).beverage.getPrice()+", size="+items.get(i).beverage.getSize()
            + ", quantity="+items.get(i).quantity+" ]");
        }
        System.out.printf("Total: %,d%n", cost());
    }
}
