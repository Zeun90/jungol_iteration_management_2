package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());

        if (2 <= input1 && input1 <= 9 && 2 <= input2 && input2 <= 9) {
            if (input1 < input2) {
                for (int i = 1; i < 10; i++) {
                    for (int j = input1; j <= input2; j++) {
                        System.out.printf("%d * %d = %2d   ", j, i, j*i);
                    }
                    System.out.println();
                }
            } else {
                for (int i = 1; i < 10; i++) {
                    for (int j = input1; j >= input2; j--) {
                        System.out.printf("%d * %d = %2d   ", j, i, j*i);
                    }
                System.out.println();
                }
            }
        }
    }
}
