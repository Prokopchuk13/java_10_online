package ua.com.alevel.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Two {
    public static void main() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value: ");

        HashMap<String,Integer> letters = new HashMap<String, Integer>();

        try {
            String theline = bufferedReader.readLine();
            char[] charArray = theline.toCharArray();
            for (char c : charArray) {
                if (String.valueOf(c).matches ("[a-zA-ZА-ЩЬЮЯҐЄІЇа-щьюяґєії]+\\.?")){
                    if (!letters.containsKey(String.valueOf(c))){
                        letters.put(String.valueOf(c),1);
                    } else {
                        letters.put(String.valueOf(c),letters.get(String.valueOf(c))+1);
                    }
                }
            }
            letters.forEach((key, value) -> System.out.println(key + " = " + value));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

