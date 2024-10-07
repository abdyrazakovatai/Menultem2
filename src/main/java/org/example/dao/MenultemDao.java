package org.example.dao;

import org.example.model.Menultem;

import java.util.List;

public interface MenultemDao {
    String update(Long id, Menultem menultem);
    List<Menultem> getAll();
}
