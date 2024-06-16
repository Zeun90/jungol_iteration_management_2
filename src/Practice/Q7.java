package Practice;

public class Q7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.printf("%d ", nums[i]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.printf("%d ", nums[j]);
            }
            System.out.println();
        }

    }
}
