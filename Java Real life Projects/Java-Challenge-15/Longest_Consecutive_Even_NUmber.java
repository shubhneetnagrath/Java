public class Longest_Consecutive_Even_NUmber
 {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 1, 8, 10};

        int y = 0;
        int x = 0;

        for (int i : numbers) {
            if (i % 2 == 0) {
                x++;

                if (x > y) {
                    y = x;
                }
            } else if (i % 2 != 0) {
                x = 0;
            }
        }

        System.out.println(y);
    }
}