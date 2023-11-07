package tradearea.model;

import java.util.Random;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    private String productID;
    private String productName;
    private String productCategory;
    private int productQuantity;
    private String productUnit;

    private static final String[] UNIQUE_NAMES = {"Coconut", "Cheese", "Apple", "Banana", "Schnitzel", "Burger", "Limomade", "Beer", "Cocktail", "Wine"};
    private static final String[] UNIQUE_CATEGORIES = {"Drink", "Food"};

    public Product() {
        Random random = new Random();
        this.productID = generateRandomProductID();
        this.productName = UNIQUE_NAMES[random.nextInt(UNIQUE_NAMES.length)];
        this.productCategory = UNIQUE_CATEGORIES[random.nextInt(UNIQUE_CATEGORIES.length)];
        this.productQuantity = random.nextInt(4001 - 100) + 100;
        this.productUnit = (productCategory.equals("Drink")) ? "1 L" : "1 KG";
    }

    private String generateRandomProductID() {
        Random random = new Random();
        int firstPart = 100 + random.nextInt(900);
        int secondPart = 10000000 + random.nextInt(90000000);
        return String.format("%d-%d", firstPart, secondPart);
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductUnit() {
        return productUnit;
    }
}
