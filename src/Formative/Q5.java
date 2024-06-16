package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input;
        int evenCnt = 0;
        int oddCnt = 0;

        for (int i = 0; i < 10; i++) {
            input = Integer.parseInt(st.nextToken());
            if (input % 2 == 0) {
                evenCnt++;
            } else if (input % 2 == 1) {
                oddCnt++;
            }
        }

        System.out.println("even : " + evenCnt);
        System.out.println("odd : " + oddCnt);
    }
}
