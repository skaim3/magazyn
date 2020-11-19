package pl.edu.wszib.magazyn.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.magazyn.database.IDataBase;
import pl.edu.wszib.magazyn.model.Product;
import java.util.Scanner;

@Component
public class GUI implements IGUI {

    private Scanner scanner = new Scanner(System.in);

    @Autowired
    public IDataBase dataBase;

    public GUI() {
    }

    @Override
    public void showMainMenu() {
        System.out.println("1. Show all products");
        System.out.println("2. Add existing products");
        System.out.println("3. Remove existing products");
        System.out.println("4. Exit");

        switch (scanner.next()) {
            case "1":
                showAllProducts();
                showMainMenu();
                break;
            case "2":
                addProducts();
                showMainMenu();
                break;
            case "3":
                removeProducts();
                showMainMenu();
                break;
            case "4":
                System.exit(0);
            default:
                System.out.println("Wrong choice!");
                showMainMenu();
                break;
        }
    }

    private void addProducts() {
        System.out.println("Product code:");
        String code = scanner.next();

        System.out.println("How many items are you adding? : ");
        int quantity = scanner.nextInt();

        if (!this.dataBase.addProducts(code, quantity)) {
            System.out.println("Wrong product code!");
        }
    }

    private void removeProducts() {
        System.out.println("Product code:");
        String code = scanner.next();

        System.out.println("How many items are you deleting? :");
        int quantity = scanner.nextInt();

        if (!this.dataBase.removeProducts(code, quantity)) {
            System.out.println("Wrong product code or not enough products in stock!");
        }
    }

    private void showAllProducts() {
        for (Product currentProduct : this.dataBase.getAllProducts()) {
            System.out.println(currentProduct);
        }
    }
}

