/*
Scenario

An online shopping cart stores prices of products.
> To calculate the final amount in Cart after taxation
 */
public class ECommerce_Cart_Total {
    public static void main(String[] args) {
        double[] prices = {499.00,399.50,679.00,345.00,987.30};
        
        double total = 0;

        for(double price:prices){
            total += price;
        }
    double gst = total*0.18;

    System.out.println("Subtotal: " + total);
    System.out.println("GST: " + gst);
    System.out.println("Final Amount: " + (total + gst));
    }
}
/*
Every e-commerce website does similar calculations.
*/