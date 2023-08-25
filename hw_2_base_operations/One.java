import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter");
        try {
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finish");
        }
    }
}

