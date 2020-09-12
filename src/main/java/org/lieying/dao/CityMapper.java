package org.lieying.dao;

import cn.pomit.jpamapper.core.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.lieying.bean.City;

import java.util.List;

@Mapper
public interface CityMapper extends CrudMapper<City,Integer> {

    public List<City> selectCitiesByCharacter(@Param("c") String c);
    public List<City> selectHotCities();
}
