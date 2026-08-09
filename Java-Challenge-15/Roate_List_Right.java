import java.util.ArrayList;
import java.util.Arrays;

public class Roate_List_Right {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );

        int x = numbers.get(numbers.size() - 1);
        numbers.remove(numbers.size() - 1);

        ArrayList<Integer> numbers1 = new ArrayList<>(numbers);

        numbers.clear();
        numbers.add(x);
        numbers.addAll(numbers1);

        System.out.println(numbers);
    }
}