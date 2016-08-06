package com.goit.projects.springMvcExample.model.dao;

import com.goit.projects.springMvcExample.model.entity.Dish;
import com.goit.projects.springMvcExample.model.entity.Menu;

import java.util.List;

public interface MenuDAO {

    void saveMenu(Menu newMenu);

    void removeById(int id);

    void removeByName(String name);

    void addDishTo(String menuName, String dishName);

    void removeDishFrom(String menuName, String dishName);

    Menu loadByName(String name);

    Menu loadById(int id);

    List<Dish> loadDishesByMenuName(String menuName);

    List<Menu> findAll();
}
