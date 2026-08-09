import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Second_Largest_Unique {
    public static void main(String[] args) {
        int y =0;
        List<Integer> numbers = List.of(10,9,10,7,8);
        List<Integer> numberscopy = new ArrayList<>(numbers);
        int x = Collections.max(numberscopy);
        numberscopy.removeIf(n -> n.equals(x));
        if (numberscopy.isEmpty()){
            System.out.println("No Second Largest unique number");
        }
        else{
            y = numberscopy.get(0);
            for (int i : numberscopy) {
            if (i > y) {
            y = i;
    }
}
        }
System.out.println(y);
        }

    }

 