package ua.com.alevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the text! ");
            String text = reader.readLine();
            System.out.printf("%-1s %-10s %-10s %-1s \n", "", "Rating ", "Count ", "Percentage ");
            streamText(text);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    private static void streamText(String text) {
        List<String> rowList = Arrays.stream(text.split(" "))
                .map(r -> r.replaceAll("[^À-ÿà-ÿa-zA-Z0-9]", ""))
                .filter(row -> !row.isEmpty())
                .toList();
    }
}