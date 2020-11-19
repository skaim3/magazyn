package pl.edu.wszib.magazyn.database;

import pl.edu.wszib.magazyn.model.Product;
import java.util.List;

public interface IDataBase {

    boolean addProducts(String code, int quantity);
    boolean removeProducts(String code, int quantity);
    List<Product> getAllProducts();
}
