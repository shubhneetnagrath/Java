```java
public class Main {
    public static void main(String[] args) {

        String text = "swiss";

        if (text.isEmpty()) {
            System.out.println("No elements");
        } else {

            int H = 1;
            int Y = 1;
            char Lowest = text.charAt(0);

            for (int i = 0; i < text.length(); i++) {

                char current = text.charAt(i);
                Y = 0;

                for (int x = 0; x < text.length(); x++) {

                    if (current == text.charAt(x)) {
                        Y++;
                    }
                }

                if (Y <= H) {
                    Lowest = current;
                    H = Y;

                    if (H == 1) {
                        break;
                    }
                }

                Y = 0;
            }

            System.out.println(H);
            System.out.println(Lowest);
        }
    }
}
```
