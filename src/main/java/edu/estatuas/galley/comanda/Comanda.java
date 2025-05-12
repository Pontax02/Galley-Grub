package edu.estatuas.galley.comanda;

import edu.estatuas.galley.products.Item;

import java.util.List;

public interface Comanda {

    void addItem(String product,double price);

    void addItem(String product,double price,String extra);

    int size();

    List<Item> itemList();

    Double getTotal();

    void updateTotal(Double total);

    void display();


}
