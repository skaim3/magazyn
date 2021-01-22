package pl.edu.wszib.magazyn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tproduct")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private int quantity;

    public Product(int id, String name, String code, int quantity) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
    }

    public Product(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Product clone() {
        return new Product(this.id, this.name, this.code, this.quantity);
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", code='" + code + '\'' + ", quantity=" + quantity + '}';
    }
}

