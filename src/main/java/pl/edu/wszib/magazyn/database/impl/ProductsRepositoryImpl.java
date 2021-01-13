package pl.edu.wszib.magazyn.database.impl;

import pl.edu.wszib.magazyn.database.IProductsRepository;
import pl.edu.wszib.magazyn.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepositoryImpl implements IProductsRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductsRepositoryImpl() {
        /*this.books.add(new Book("Czysty kod. Podręcznik dobrego programisty",
                "Robert C. Martin",
                "978-83-283-0234-1",
                34.5,
                10));

        this.books.add(new Book("Python w zadaniach. Programowanie dla młodzieży. Poziom podstawowy",
                "Urszula Wiejak, Adrian Wojciechowski",
                "978-83-283-7131-6",
                23.94,
                15));

        this.books.add(new Book("Blockchain. Kurs video. Cyfrowa ewolucja w świecie finansów",
                "Tomasz Waszczyk",
                "978-83-283-7573-4",
                119.00,
                20));

        this.books.add(new Book("Amazon Web Services (AWS). Kurs video. Zostań administratorem systemów IT",
                "Piotr Kośka",
                "978-83-283-7629-8",
                199.00,
                5));*/
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
