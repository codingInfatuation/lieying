package org.lieying.dao;

import cn.pomit.jpamapper.core.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.lieying.bean.Position;
import org.lieying.bean.PositionCategory;

import java.util.List;

@Mapper
public interface PositionCategoryMapper extends CrudMapper<PositionCategory,Integer> {

    public List<PositionCategory> selectAllPositionCategories();
    public PositionCategory selectPositionCategoryById(int id);

}
