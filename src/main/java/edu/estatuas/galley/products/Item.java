package edu.estatuas.galley.products;

import java.util.Objects;

public class Item implements Product{

    String name;
    double price;
    String extra;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Item(String name, double price, String extra) {}

    @Override
    public String getName() {
        return this.name; }
    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public String getExtra() {
        return extra;
    }

    @Override
    public boolean isRegular(){
        return true;
    }

    public String toString(){
        return getName() + "...." + getPrice() +"$";
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(price, item.price) == 0 && Objects.equals(name, item.name) && Objects.equals(extra, item.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, extra);
    }
}
