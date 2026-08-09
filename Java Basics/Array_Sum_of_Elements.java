public class Array_Sum_of_Elements {
   public static void main(String[] args) {
   int[] number = {1,5,10,25};
   int sum = 0;
   // Loop through the array and add each element to sum
   for(int i =0; i < number.length; i++){
   sum+= number[i];
   
   }

System.out.println("The Sum is = " + sum);

   }
}

