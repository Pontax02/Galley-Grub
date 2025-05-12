package edu.estatuas.galley.comanda;

import edu.estatuas.galley.products.Item;

import java.util.List;

public class Order implements Comanda {

    private Double total;

    public Order() {}


    @Override
    public void addItem(String product, double price) {

    }

    @Override
    public void addItem(String product, double price, String extra) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return List.of();
    }

    @Override
    public Double getTotal() {
        return 0.0;
    }

    @Override
    public void updateTotal(Double total) {

    }

    @Override
    public void display() {

    }
}
