package org.lieying.web.controller;
import org.lieying.bean.PositionCategory;
import org.lieying.service.PositionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/positionCategory")
public class PositionCategoryController {
    @Autowired
    private PositionCategoryService positionCategoryService;
    //所有职位类型
    @RequestMapping("/all")
    public List<PositionCategory> findAllPositionCategories(){
        return positionCategoryService.queryAllPositionCategories();
    }

    @RequestMapping("/{id}")
    public PositionCategory findPositionCategories(@PathVariable int id){
        return positionCategoryService.queryPositionCategoryById(id);

    }
}
