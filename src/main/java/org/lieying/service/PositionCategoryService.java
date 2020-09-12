package org.lieying.service;

import org.lieying.bean.PositionCategory;

import java.util.List;

public interface PositionCategoryService {
    public List<PositionCategory> queryAllPositionCategories();
    public PositionCategory queryPositionCategoryById(int id);
}
