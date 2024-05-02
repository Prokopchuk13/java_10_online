package ua.com.alevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the text! ");
            String text = reader.readLine();
            System.out.println("Rating " + "Count " + "Percentage ");
            streamText(text);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    private static void streamText(String text) {
        List<Row> wordsAsObjects = Arrays.stream(text.split(" "))
                .map(w -> w.replaceAll("[^À-ÿà-ÿa-zA-Z0-9]", " "))
                .filter(word -> !word.isEmpty())
                .map(w -> w.toLowerCase())
                .collect(groupingBy(w -> w, counting()))
                .entrySet().stream()
                .map(entry -> new Row(entry.getKey(), entry.getValue(), (entry.getValue() * 100 / text.split(" ").length)))
                .sorted(Comparator.comparingDouble(Row::getPercentage).reversed())
                .toList();
        IntStream.range(0, wordsAsObjects.size())
                .forEach(i -> wordsAsObjects.get(i).setRating(i + 1));

        wordsAsObjects.forEach(word -> System.out.printf("%-1s %-1s %-1s %-1s \n", word.getWord(), word.getRating(), word.getCount(), word.getPercentage()));
    }
}