package org.example.dao.daoImpl;

import org.example.dao.MenultemDao;
import org.example.db.Database;
import org.example.model.Menultem;

import java.util.List;

public class MenultemDaoImpl implements MenultemDao {

    private final Database database;

    public MenultemDaoImpl(Database database) {
        this.database = database;
    }
    @Override
    public String save(Menultem menultem) {
        database.menultems.add(menultem);
        return "Successfully saved";
    }

    @Override
    public String deleteById(Long id) {
        for (Menultem menultem : database.menultems) {
            if (menultem.getId().equals(id)) {
                database.menultems.remove(menultem);
                return "Successfully deleted";
            }
        }
        return "MenuItem not found this id" +id;
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
        for (Menultem menultem : database.menultems) {
            if (menultem.getName().equalsIgnoreCase(name)) {
                System.out.println(menultem);
                return menultem.toString();
            }
        }
        return "not found " + name;
    }
}
