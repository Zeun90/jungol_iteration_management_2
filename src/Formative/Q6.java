package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());
        int min = (input1 < input2) ? input1 : input2;
        int max = (input1 > input2) ? input1 : input2;
        int count = 0;
        int sum = 0;
        double avg;

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
                sum += i;
            }
        }

        avg = (double) sum / count;

        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f\n", avg);

    }
}
