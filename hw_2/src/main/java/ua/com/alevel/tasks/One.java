package ua.com.alevel.tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value: ");

        try {
            String theline = bufferedReader.readLine();
            char[] charArray = theline.toCharArray();
            byte sum = 0;

            for (int i = 0; i < charArray.length; i++) {
                byte b = (byte) charArray[i];

                if (b >= 48 && b <= 57) {
                    int digit = Character.getNumericValue(charArray[i]);
                    sum += digit;
                }
            }
            System.out.println("Sum: " + sum);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}