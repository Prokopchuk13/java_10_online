package ua.com.alevel;


import ua.com.alevel.entitys.Dictionary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dictionary<String,Integer> dictionary = new Dictionary <String,Integer>();
        System.out.println("size: " + dictionary.size());
        System.out.println("valueEmpty: " + dictionary.isEmpty());
        System.out.println("containsKey: " + dictionary.containsKey("0"));
        System.out.println("containsValue: " + dictionary.containsValue(0));
        System.out.println("valueGet: " + dictionary.get("1"));
        System.out.println("put: " + dictionary.put("1",1));
        System.out.println("putAll: " + dictionary.putAll(dictionary));
        System.out.println("remove: " + dictionary.remove("1"));
        System.out.println("clear: " + dictionary.clear());
        System.out.println("key: " + Arrays.toString(dictionary.keys()));
        System.out.println("value: " + Arrays.toString(dictionary.values()));
    }
}