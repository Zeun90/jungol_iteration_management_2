package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());
        int min;
        int max;

        if (input1 <= 100 && input2 <= 100) {
            min = (input1 < input2) ? input1 : input2;
            max = (input1 > input2) ? input1 : input2;

            for (int i = min; i <= max; i++) {
                System.out.printf("%d ", i);
            }
        }
    }
}
