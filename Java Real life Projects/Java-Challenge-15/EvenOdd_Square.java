import java.util.ArrayList;
import java.util.List;

public class EvenOdd_Square {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 8, 3, 10);
        List<Integer> newNumbers = new ArrayList<>();

        for (int i : numbers) {
            if ((i % 2) != 0) {
                newNumbers.add(i * i * i);
            } else {
                newNumbers.add(i * i);
            }
        }

        System.out.println(newNumbers); 
    }
}