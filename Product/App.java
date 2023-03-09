package Question2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Product { // product class used for blueprint
    public int productID;
    public String productName;
    public double price;
    public int quantity;

    Product(int productID, String productName, double price, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}

public class My_Pos{ // main pos class that will handle all the logic
    static Scanner scanner_n = new Scanner(System.in);
    static ArrayList<Product> product_list = new ArrayList<>();

    static int[][] cart = new int[3][2];
    /* stores the cart in format [[quantity, price], [quantity, price], [quantity, price]]
    named based on index where 0 = Shampoo, 1 = Toothpaste, 2 = Soap */

    /*------------------------- BUILDER METHODS -------------------------------- */
    static void mainRunner()        {
        while (true){ // main loop
            int choice = askUser(); // asks user what he/she intends to do

            if (choice == 1){
                showProducts();
            }
            else if (choice == 2){
                addToCartByID();
            }
            else if (choice == 3){
                if (showCart())
                    System.out.println("Cart Is Currently Empty. Please Order First.");
            }
            else if (choice == 4){
                checkOut();
            }
            else{
                break;
            }
        }
        System.out.println("================= EXITING =================\n");
        System.out.println("Thank You For Shopping!");
    }

    static void initializeProductList(){
        product_list.add(new Product(1, "Shampoo", 120.50, 5));
        product_list.add(new Product(2, "Toothpaste", 75.25, 10));
        product_list.add(new Product(3, "Soap", 45.00, 2));
    }

    /* ------------------------- POS METHODS -------------------------------- */
    static int askUser() {
        System.out.println("================= POS MENU ================= ");
        System.out.println();
        System.out.println("[1] Show Products");
        System.out.println("[2] Add To Cart By ID");
        System.out.println("[3] Show Cart");
        System.out.println("[4] Check Out");
        System.out.println("[5] Exit \n");

        System.out.print("ENTER A NUMBER: ");
        try {
            int choice = scanner_n.nextInt();
            if (choice < 1 || choice > 5) { // User will be flagged if user enters an integer that is not on the given choice
                System.out.println("That Is Not On The Choices!");
                return askUser(); // recursion
            }
            return choice;
        } catch (InputMismatchException e) { // flags user if he inputs a data type other than an integer
            scanner_n.nextLine(); // refreshes the scanner
            System.out.println("\nPlease Input An Integer");
            return askUser();
        } //
    }
    static void showProducts(){
        System.out.println();
        for (Product p: product_list){
            System.out.println("Product ID: "+p.productID);
            System.out.println("Product Name: "+p.productName);
            System.out.println("Product Price: "+p.price);
            if (p.quantity == 0) // changes the display if product is already out of stock
                System.out.println("Product Stock: Out Of Stock");
            else
                System.out.println("Product Stock: "+p.quantity+"\n");
        }
    }

    static void addToCartByID(){
        System.out.println(); // for spacing
        System.out.print("Please Enter Product ID: "); // asks user for product ID to order
        try {
            int id = scanner_n.nextInt();
            int stock = product_list.get(id - 1).quantity; // stores the current stock of the product.
            System.out.print("Please Enter Quantity (Product: " + product_list.get(id - 1).productName + "| Stock: " + stock + "): "); // asks user for the quantity of product chosen
            int quantity = scanner_n.nextInt();
            if (quantity > stock) // if quantity inputted by user exceeds the stock of the specified product, use will be flagged.
                System.out.println("Not Enough Stock!");
            else { // adds the product to the cart
                product_list.get(id - 1).quantity -= quantity;
                cart[id - 1][0] += quantity;
                cart[id - 1][1] += (product_list.get(id - 1).price) * quantity;
                System.out.println(quantity + " " + product_list.get(id - 1).productName + "(s) Was added to cart");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Please Enter An Existing ID");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter A Valid Integer");
            scanner_n.nextLine(); // refreshes the scanner
        }
    }

    static boolean showCart(){
        System.out.println();
        String[] names = {"Shampoo", "ToothPaste", "Soap"};

        if (cart[0][0] == 0 && cart[1][0] == 0 && cart[2][0] == 0) { // handles the instance where cart is empty
            return true; // returns true to be handles by the functions that will use this to let them know that the cart is empty
        }
        System.out.println("Your Cart: ");
        for (int i = 0; i < 3; i++){ // prints the contents of the cart
            if (cart[i][0] == 0){
                continue;
            }
            System.out.println(cart[i][0]+" "+names[i]+"(s) | cost: "+cart[i][1]);
        }
        return false; // returns true to be handles by the functions that will use this to let them know that the cart is not empty
    }

    static void checkOut(){
        if (showCart()) // handles the instance where user checked out without ordering
            System.out.println("Why Open This POS If You're Not Going To Order?!. Kidding");
        System.out.println("\nTotal Price: "+(cart[0][1]+cart[1][1]+cart[2][1]));
    }

    /*------------------------- DRIVER METHOD -------------------------------- */

    public static void main(String[] args) {
        initializeProductList();
        mainRunner();
    }
