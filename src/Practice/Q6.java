package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input;
        int cnt = 5;
        int sum = 0;
        double avg;

        for (int i = 0; i < cnt; i++) {
            input = Integer.parseInt(st.nextToken());
            sum += input;
        }

        avg = (double) sum / cnt;

        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평균 : %.1f\n", avg);

    }
}
