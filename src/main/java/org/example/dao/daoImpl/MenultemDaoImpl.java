package org.example.dao.daoImpl;

import org.example.dao.MenultemDao;
import org.example.db.Database;
import org.example.model.Menultem;
import org.example.model.Restaurant;

import java.util.List;

public class MenultemDaoImpl implements MenultemDao {

    private final Database database;

    public MenultemDaoImpl(Database database) {
        this.database = database;
    }

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
