package org.example;

import org.example.Generate.GeneratorID;
import org.example.dao.daoImpl.MenultemDaoImpl;
import org.example.db.Database;
import org.example.model.Menultem;
import org.example.service.MenultemService;
import org.example.service.serviceImpl.MenultemServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Database db = new Database();
        MenultemDaoImpl menuItemDao = new MenultemDaoImpl(db);
        MenultemService menuItemService = new MenultemServiceImpl(menuItemDao);

        Menultem plov  =new Menultem("Plov", "plov.jpg", BigDecimal.valueOf(450), "Traditional Uzbek rice dish with lamb, carrots, and spices.", false);
        Menultem lagman = new Menultem("Lagman", "lagman.jpg", BigDecimal.valueOf(480), "Hand-pulled noodles in a rich meat and vegetable broth.", false);
        Menultem samsa = new Menultem("Samsa", "samsa.jpg", BigDecimal.valueOf(150), "Flaky pastry filled with spiced meat or pumpkin.", false);
        Menultem dolma = new Menultem("Dolma", "dolma.jpg", BigDecimal.valueOf(600), "Grape leaves stuffed with rice, herbs, and sometimes meat.", true);
        Menultem baklava = new Menultem("Baklava", "baklava.jpg", BigDecimal.valueOf(750), "Sweet pastry with layers of filo dough, honey, and nuts.", true);

        List<Menultem> menuItems = new ArrayList<>(Arrays.asList(plov, lagman, samsa, dolma, baklava));
//        System.out.println(menuItems);

        menuItemService.save(plov);
        menuItemService.save(lagman);
        menuItemService.save(samsa);
        menuItemService.save(dolma);
        menuItemService.save(baklava);

        System.out.println(menuItemService.searchByName("dolma"));
        System.out.println(" ");
        System.out.println(menuItemService.deleteById(3L));


    }
}