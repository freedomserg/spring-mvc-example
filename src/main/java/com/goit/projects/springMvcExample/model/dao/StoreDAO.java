package com.goit.projects.springMvcExample.model.dao;

import com.goit.projects.springMvcExample.model.entity.Store;

import java.util.List;

public interface StoreDAO {

    void saveIngredient(int ingredientId, int minRequiredQuantity, int quantity);

    void removeIngredient(int ingredientId);

    void updateIngredientQuantity(int ingredientId, int newQuantity);

    Store loadByIngredientName(String ingredientName);

    List<Store> findAllIngredients();

    List<Store> findIngredientsAreBeingDecreased();
}
