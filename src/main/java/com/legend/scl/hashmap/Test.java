package com.legend.scl.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("robin", "lalalalla");
        //testCapacity();
    }

    public static void testCapacity() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aadsf");
        map.put("b", "aadsf");
        map.put("c", "aadsf");
        map.put("d", "aadsf");
        map.put("e", "aadsf");
        map.put("f", "aadsf");
        map.put("g", "aadsf");
        map.put("h", "aadsf");
        System.out.println("size: " + map.size());
    }
}
