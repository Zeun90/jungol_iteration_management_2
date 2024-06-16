package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (1 <= input && input <= 50) {
            for (int i = 2; i <= input; i+=2) {
                System.out.printf("%d ", i);
            }
        }
    }
}
