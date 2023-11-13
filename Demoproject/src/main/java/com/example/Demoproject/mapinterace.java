package com.example.Demoproject;

//In map interface we can repeat the values but we can't repeat the key.

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
        map.put("Location","Dallas");
        map.put("State","Texas");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
