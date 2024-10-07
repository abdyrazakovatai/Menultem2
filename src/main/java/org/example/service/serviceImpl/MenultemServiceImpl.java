package org.example.service.serviceImpl;

import org.example.dao.MenultemDao;
import org.example.dao.daoImpl.MenultemDaoImpl;
import org.example.db.Database;
import org.example.model.Menultem;
import org.example.model.Restaurant;
import org.example.service.MenultemService;

import java.util.List;

public class MenultemServiceImpl implements MenultemService {

    Database database;

    MenultemDao menultemDao = new MenultemDaoImpl(database);
    @Override
    public String save(List<Restaurant> restaurants) {
        return "";
    }

    @Override
    public String deleteById(Long id) {
        return "";
    }

    @Override
    public List<Menultem> getAll() {
        return List.of();
    }

    @Override
    public String updateById(Long id, Menultem menultem) {
        return "";
    }

    @Override
    public String findById(Long id) {
        return "";
    }

    @Override
    public String searchByName(String name) {
        return "";
    }
}
