package pl.edu.wszib.magazyn.model;

public class Product {
    private String name;
    private String code;
    private int quantity;

    public Product(String name, String code, int quantity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", code='" + code + '\'' + ", quantity=" + quantity + '}';
    }
}
