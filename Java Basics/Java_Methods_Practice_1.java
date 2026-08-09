public class Java_Methods_Practice_1{
 /*
>myMethod() is the name of the method

>static means that the method belongs to the Main class 
and not an object of the Main class.

>void means that this method does not have a return value. You will learn more about return values later in this chapter
*/
    static void myMethod(String fname, int age) {
   System.out.println(fname + " Nagrath is " + age + " years old");     
    }
    public static void main(String[] args) {
        myMethod("Shubhneet",17);
        myMethod("Vihaan",4);
        myMethod("Gaurav",42);
    }

}