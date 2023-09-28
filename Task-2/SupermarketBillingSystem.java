import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}

class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        CartItem newItem = new CartItem(product, quantity);
        items.add(newItem);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Your Shopping Cart:");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " - Quantity: " + item.getQuantity() + " - Price: $" + item.getTotalPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

class SupermarketBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Add some sample products
        Product apple = new Product("Apple", 1.0);
        Product banana = new Product("Banana", 0.5);
        Product milk = new Product("Milk", 2.0);

        while (true) {
            System.out.println("Supermarket Billing System");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Product selectedProduct = null;

                    // Sample product selection (you can expand this with more products)
                    if (productName.equalsIgnoreCase("Apple")) {
                        selectedProduct = apple;
                    } else if (productName.equalsIgnoreCase("Banana")) {
                        selectedProduct = banana;
                    } else if (productName.equalsIgnoreCase("Milk")) {
                        selectedProduct = milk;
                    } else {
                        System.out.println("Product not found.");
                        continue;
                    }

                    cart.addItem(selectedProduct, quantity);
                    break;
                case 2:
                    cart.displayCart();
                    break;
                case 3:
                    System.out.println("Thank you for shopping with us!");
                    cart.displayCart();
                    scanner.close();
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("Exiting the Supermarket Billing System.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
