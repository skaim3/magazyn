package pl.edu.wszib.magazyn.dao;

import pl.edu.wszib.magazyn.model.Product;
import java.util.List;

public interface IProductDAO {
    Product getProductById(int id);
    void updateProduct(Product product);
    List<Product> getAllProducts();
    //boolean addProduct(Product product);
    //TODO dorobić dodawanie produktu
}
