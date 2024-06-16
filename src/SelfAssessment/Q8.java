package SelfAssessment;

public class Q8 {
    public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.printf("%d * %d = %2d   ", i, j, j*i);
            }
            System.out.println();
        }
    }
}
