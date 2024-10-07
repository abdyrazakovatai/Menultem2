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
    public String update(Long id, Menultem menultem) {
        if (menultem != null) {
            for (Menultem menultem1 : database.menultems) {
                if (menultem1.getId().equals(id)) {
                    menultem1.setName(menultem.getName());
                    menultem1.setDescription(menultem.getDescription());
                    menultem1.setImage(menultem.getImage());
                    menultem1.setPrice(menultem.getPrice());
                    return "Successfully updated Menultem";
                }
            }
        }
        return "Not found";
    }

    @Override
    public List<Menultem> getAll() {
        return database.menultems;
    }
}
