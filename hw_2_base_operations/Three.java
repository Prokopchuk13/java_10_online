import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Three {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter lesson: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int lesson = Integer.valueOf(bufferedReader.readLine());
        final int lessonDuration = 45;
        int breaksAmount = lesson - 1;

        LocalTime startLesson = LocalTime.of(9, 0);
        startLesson = startLesson.plusMinutes(lessonDuration * lesson);

        int evenBreaksAmount = (int) Math.floor(breaksAmount/ 2);
        int oddBreaksAmount = breaksAmount - evenBreaksAmount;

        startLesson = startLesson.plusMinutes(evenBreaksAmount * 15L + oddBreaksAmount * 5L);

        System.out.println("End of the lesson: ".concat(startLesson.toString()));

    }
}