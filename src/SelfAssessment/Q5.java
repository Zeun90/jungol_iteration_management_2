package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input;
        int multipleOfThreeCount = 0;
        int multipleOfFiveCount = 0;

        for (int i = 0; i < 10; i++) {
            input = Integer.parseInt(st.nextToken());
            if (input % 3 == 0) {
                multipleOfThreeCount++;
            }
            if (input % 5 == 0) {
                multipleOfFiveCount++;
            }
        }

        System.out.printf("Multiples of 3 : %d\n", multipleOfThreeCount);
        System.out.printf("Multiples of 5 : %d\n", multipleOfFiveCount);

    }
}
