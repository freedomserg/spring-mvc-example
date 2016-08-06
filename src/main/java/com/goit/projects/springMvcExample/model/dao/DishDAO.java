package com.goit.projects.springMvcExample.model.dao;

import com.goit.projects.springMvcExample.model.entity.Dish;
import com.goit.projects.springMvcExample.model.entity.Ingredient;

import java.util.List;

public interface DishDAO {

    void saveDish(Dish newDish);

    void removeDishById(int id);

    void removeDishByName(String name);

    Dish loadByName(String dishName);

    Dish loadById(int id);

    List<Ingredient> loadIngredientsByDishName(String dishName);

    List<Dish> findAll();
}
