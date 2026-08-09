public class Nested_if {
public static void main(String[] args) {

    var balance = 10000;
    var amount = 5000;
    var pinCorrect = true;

    if(pinCorrect) {

        if (balance>=amount){
           System.out.println("Cash Widthdrawn");

        }
    }

    else{
        System.out.println("Transaction Unsuccesful");
    }





}

}
/*
if(condition 1){
  if(condition 2){
  
Executes (prints) both Condition 1 and Condition 2 are true 
  
  
  }

}
*/

