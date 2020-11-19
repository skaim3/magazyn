package pl.edu.wszib.magazyn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.magazyn.database.DataBase;
import pl.edu.wszib.magazyn.database.IDataBase;
import pl.edu.wszib.magazyn.gui.GUI;
import pl.edu.wszib.magazyn.gui.IGUI;

@Configuration
public class AppConfiguration {

    @Bean
    public IDataBase dataBase() {
        return new DataBase();
    }

    @Bean
    public IGUI gui(IDataBase dataBase) {
        GUI gui = new GUI();
        gui.dataBase = dataBase;
        return gui;
    }
}