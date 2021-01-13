package pl.edu.wszib.magazyn.database;

import pl.edu.wszib.magazyn.model.Product;

import java.util.List;

public interface IProductsRepository {
    List<Product> getAllProducts();
    Product getProductByCode(String code);
    void updateProduct(Product product);
    Product getProductById(int id);
}
