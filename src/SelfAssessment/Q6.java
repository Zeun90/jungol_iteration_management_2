package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int subjectCnt = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int input;
        int sum = 0;
        double avg;

        for (int i = 0; i < subjectCnt; i++) {
            input = Integer.parseInt(st.nextToken());
            sum += input;
        }

        avg = (double) sum / subjectCnt;

        System.out.printf("avg : %.1f\n", avg);

        if (avg >= 80) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    }
}
