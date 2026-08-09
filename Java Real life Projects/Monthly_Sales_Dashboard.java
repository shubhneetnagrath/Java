/*
Scenario
   >Store monthly sales and find the best month.
*/
public class Monthly_Sales_Dashboard {
    public static void main(String[] args) {
        int[] sales = {
            12000, 15000, 18000, 22000,
            25000, 30000, 27000, 29000,
            31000, 33000, 35000, 40000
        };
        int maxSale = sales[0];
        int month = 0;
        for(int i = 1; i < sales.length ;i++){
           
            if (sales[i]> maxSale){
                maxSale=sales[i];
                month =  i;

            }
        }       
    System.out.println("Best Month: " + (month+1) + "th");
    System.out.println("Highest Sale: " + maxSale);
    
    }
}

/*
Interview Concepts
>Maximum element
>Index tracking
*/