package ua.com.alevel;

import ua.com.alevel.tasks.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Boolean condition = true;
        do {
       
            System.out.println("1. Input string and get sum of all numbers.");
            System.out.println("2. Input string and get list of counted symbols.");
            System.out.println("3. Get time of the end of the lessons.");
            System.out.println("4. Exit from program.");
            System.out.print("Your chose: ");
            String choose = bufferedReader.readLine();

            switch (choose){
                case "1":
                    One.main();
                    break;
                case "2":
                    Two.main();
                    break;
                case "3":
                    Three.main();
                    break;
                case "4":
                    System.out.println("End of the program!");
                    condition = false;
                    break;
                default:
                    System.out.println("Bad chose, repeat pls!");
            }
        } while (condition);
    }
}