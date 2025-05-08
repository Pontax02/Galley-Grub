package edu.estatuas.galley;


import java.util.HashMap;
import java.util.Map;

public class Prices {

    static Map<String, Double> prices = new HashMap<String,Double>();

    Prices(){}

    static void init_prices() {
        prices.put("KRABBY PATTY",1.25);
        prices.put("CORAL BITS",1.00);
        prices.put("GOLDEN LOAF",2.00);
        prices.put("KELP RINGS",1.50);
        prices.put("SEAFOM SODA",1.00);
    }
    static void display(){
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
