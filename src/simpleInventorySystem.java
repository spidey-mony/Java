import java.util.Scanner;
import java.util.Arrays;

public class simpleInventorySystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int inventorySize = 3;

        String[] products = new String[inventorySize];
        int[] quantities = new int[inventorySize];
        int productCount = 0;

        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. View available products and their quantities");
            System.out.println("2. Add a new product to the inventory with a specified quantity");
            System.out.println("3. Update the quantity of an existing product in the inventory");
            System.out.println("4. Remove a product from the inventory");
            System.out.println("5. Exit");
            System.out.print("Enter the choice(1-5): ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    if(productCount == 0){
                        System.out.println("The inventory is empty!");
                    }else {
                        System.out.println("Available products");
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(products[i] + ": " + quantities[i]);
                        }
                    }
                    break;
                case 2:
                    if (productCount < products.length) {
                        System.out.print("Enter the product name: ");
                        String productName = input.nextLine();

                        System.out.print("Enter the quantity: ");
                        int quantity = input.nextInt();

                        products[productCount] = productName;
                        quantities[productCount] = quantity;
                        productCount++;
                    }else{
                        System.out.println("Inventory is full, cannot add more product! ");
                    }
                    break;
                case 3:
                    System.out.print("Enter the product name to update quantity: ");
                    String updateProduct = input.nextLine();

                    int index = Arrays.binarySearch(products, updateProduct);
                    if(index >= 0){
                        System.out.println("Enter the new quantity: ");
                        int newQuantity = input.nextInt();
                        quantities[index] = newQuantity;
                        System.out.println("Quantity updated sucessfully!");
                    }else {
                        System.out.println("Product is not existing in inventory.");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Exiting the inventory system.....!");
                    break;
                default:
                    System.out.println("Please enter valid number!");
                    break;
            }
        }while(choice !=5 );

        input.close();
    }
}
