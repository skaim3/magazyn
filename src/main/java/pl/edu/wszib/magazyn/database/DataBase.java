package pl.edu.wszib.magazyn.database;

import pl.edu.wszib.magazyn.model.Product;
import java.util.ArrayList;
import java.util.List;

public class DataBase implements IDataBase {
    private final List<Product> products = new ArrayList<>();

    public DataBase() {
        this.products.add(new Product("CPU","cpu404", 15));
        this.products.add(new Product("Graphics Card", "gpu101",20));
        this.products.add(new Product("RAM","ram000",30));
    }

    @Override
    public boolean addProducts(String code, int quantity) {
        for (Product currentProduct : this.products) {
            if (currentProduct.getCode().equals(code)) {
                currentProduct.setQuantity(currentProduct.getQuantity() + quantity);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeProducts(String code, int quantity) {
        for (Product currentProduct : this.products) {
            if (currentProduct.getCode().equals(code) && currentProduct.getQuantity() >= quantity) {
                currentProduct.setQuantity(currentProduct.getQuantity() - quantity);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return this.products;
    }
}
