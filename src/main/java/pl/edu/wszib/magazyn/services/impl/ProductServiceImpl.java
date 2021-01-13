package pl.edu.wszib.magazyn.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.magazyn.model.Product;
import pl.edu.wszib.magazyn.services.IProductService;
import pl.edu.wszib.magazyn.dao.IProductDAO;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductDAO productDAO;

    @Override
    public Product getProductById(int id) {
        return this.productDAO.getProductById(id);
    }

    @Override
    public void updateProduct(Product product) {
        Product productFromDB = this.productDAO.getProductById(product.getId());
        productFromDB.setName(product.getName());
        productFromDB.setCode(product.getCode());
        productFromDB.setQuantity(product.getQuantity());

        this.productDAO.updateProduct(productFromDB);


    }

    @Override
    public List<Product> getAllProducts() {
        return this.productDAO.getAllProducts();
    }
}
