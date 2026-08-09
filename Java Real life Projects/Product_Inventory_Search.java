/*
Scenario

>Find a product in inventory.
*/
public class Product_Inventory_Search {
    public static void main(String[] args) {
        String[] products = {
            "Laptop",
            "Monitor",
            "Keyboard",
            "Mouse",
            "Headphone",
            "Printer"
        };

        String search = "Monitor";

        boolean found = false;

        for(int i = 0; i< products.length;i++){

            if (products[i].equals(search)) {
                
                System.out.println("Found at index " + (i+1));
                found = true;
                break;
            }
        }
    if(found == false){
        System.out.println("Product not found");
    }   
    }
}

/*
>Interview Topic

This is called Linear Search.
*/
