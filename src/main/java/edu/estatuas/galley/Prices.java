package edu.estatuas.galley;


import java.util.HashMap;
import java.util.Map;

public class Prices {

    static Map<String, Double> prices = new HashMap<String,Double>();

    Prices(){}

    static void init_prices() {
        prices.put("large",0.5);
        prices.put("sauce",0.5);
        prices.put("medium",0.25);
        prices.put("cheese",0.25);
    }
    static void display(){
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println("\s\s\s\s" + entry.getKey() + "=" + entry.getValue());
        }
    }
}
