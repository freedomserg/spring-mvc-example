package com.goit.projects.springMvcExample.model.dao;

import com.goit.projects.springMvcExample.model.entity.CookedDish;

import java.util.Date;
import java.util.List;

public interface CookedDishHistoryDAO {

    void saveCookedDish(CookedDish newCookedDish);

    List<CookedDish> findByDate(Date preparationDate);

    List<CookedDish> findAll();
}
