package pl.edu.wszib.magazyn.model;

public class Product {
    private String name;
    private String code;
    private int amount;

    public Product(String name, int amount, String code) {
        this.name = name;
        this.amount = amount;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
