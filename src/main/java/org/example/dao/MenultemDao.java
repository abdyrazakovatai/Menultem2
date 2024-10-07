package org.example.dao;

import org.example.model.Menultem;
import org.example.model.Restaurant;

import java.util.List;

public interface MenultemDao {

    String save(Menultem menultem);

    String deleteById(Long id);

    List<Menultem> getAll();

    String updateById(Long id, Menultem menultem);

    String findById(Long id);

    String searchByName(String name);

}
