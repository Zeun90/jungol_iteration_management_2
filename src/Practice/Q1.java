package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (0 < input && input <= 10) {
            while (cnt < input) {
                System.out.println("C언어 프로그래밍");
                cnt++;
            }
        }
    }
}
