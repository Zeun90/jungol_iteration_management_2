package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int sum = 0;
        double avg;

        if (1 <= cnt && cnt <= 100) {
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < cnt; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            avg = (double) sum / cnt;

            System.out.printf("%.2f", avg);
        }
    }
}
