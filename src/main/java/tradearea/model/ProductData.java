package tradearea.model;

import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductData{
    private List<Product> productList;

    public ProductData(int itemCount) {
        this.productList = new ArrayList<>();
        for (int i = 0; i < itemCount; i++) {
            this.productList.add(new Product());
        }
    }
    public List<Product> getProducts() {
        return productList;
    }
}