package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            input = Integer.parseInt(st.nextToken());
            if (input % 2 == 0) {
                cnt++;
            }
        }

        System.out.printf("입력받은 짝수는 %d개입니다.", cnt);

    }
}
