package org.example.service.serviceImpl;

import org.example.dao.MenultemDao;
import org.example.dao.daoImpl.MenultemDaoImpl;
import org.example.db.Database;
import org.example.model.Menultem;
import org.example.model.Restaurant;
import org.example.service.MenultemService;

import java.util.List;

public class MenultemServiceImpl implements MenultemService {
    private final  MenultemDao menultemDao ;

    public MenultemServiceImpl(MenultemDao menultemDao) {
        this.menultemDao = menultemDao;
    }

    @Override
    public String save(Menultem menultem) {
        menultemDao.save(menultem);
        return "Successfully saved";
    }

    @Override
    public String deleteById(Long id) {
        menultemDao.deleteById(id);
        return "Successfully deleted";
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
        menultemDao.searchByName(name);
        return "Success Searched by name";
    }
}
