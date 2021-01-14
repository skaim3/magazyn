package pl.edu.wszib.magazyn.database.impl;

import pl.edu.wszib.magazyn.database.IProductsRepository;
import pl.edu.wszib.magazyn.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepositoryImpl implements IProductsRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductsRepositoryImpl() {
    }
    @Override
    public List<Product> getAllProducts() { return this.products; }

    @Override
    public Product getProductByCode(String code) {
        for(Product product : this.products) {
            if(product.getCode().equals(code)) {
                return product;
            }
        }

        return null;
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

}
