package com.example.Demoproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapinterace {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("MyName", "Nivas");
        map.put("ID", "Six");
        map.put("Location", "Minneapolis");
        map.put("State", "Minnesota");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
