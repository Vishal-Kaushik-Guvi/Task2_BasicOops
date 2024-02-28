package Task2_BasicOops;

import java.util.Scanner;

public class ProductMain {

    // Method to calculate total amount spend on Single Product.
    public static double Amount(Product[] productsArray, int pid){
        double totalSpent = 0.0;
        // A single product will be get from array of products.
        for (Product product : productsArray) {
        // If product id matched then total amount will calculated according to it.    
            if (product.pid == pid) {
                totalSpent += product.price * product.quantity;
            }
        }
        return totalSpent;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of Products are 5 "Given in Question"
        int products = 5;
        // Array of our product class
        Product[] productsArray = new Product[products];
        // ProductId in Input
        int[] pid = new int[products];
        // Product Price in Input
        int[] price = new int[products];
        // Product Quantity in Input
        int[] quantity = new int[products];

        for (int i = 0; i < products; i++) {
            System.out.print("Enter the ProductId: ");
            pid[i] = sc.nextInt();
            System.out.print("Enter the Product Price: ");
            price[i] = sc.nextInt();
            System.out.print("Enter the Product Quantity: ");
            quantity[i] = sc.nextInt();

            productsArray[i] = new Product(pid[i], price[i], quantity[i]);
        }

         // Calculating total amount spent on a single product
         System.out.print("Enter ProductId to calculate total amount spent: ");
         int pidToCalculate = sc.nextInt();
         double totalSpent = ProductMain.Amount(productsArray, pidToCalculate);
         System.out.println("Total amount spent on product with pid " + pidToCalculate + ": Rs." + totalSpent);
           
        sc.close();
        
    }
}
