public class Skip_Negetive_values {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 7, 0, 9};
        for (int num : numbers) {
            if (num < 0) {
                continue; // skip negative numbers
            }
            if (num == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(num);
        }
    }
}