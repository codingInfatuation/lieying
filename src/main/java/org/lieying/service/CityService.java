package org.lieying.service;

import org.lieying.bean.City;

import java.util.List;
import java.util.Set;

public interface CityService {
    public List<City> queryAllCities();

    public List<City> queryCitiesByMultipleCharacter(String characters);

    public List<City> queryHotCities();
}
