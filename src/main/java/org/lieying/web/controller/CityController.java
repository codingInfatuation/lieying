package org.lieying.web.controller;

import org.lieying.bean.City;
import org.lieying.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    /**
     *     查询所有城市
     */
    @RequestMapping("/all")
    public List<City> getAllCities() {
        return cityService.queryAllCities();
    }
    /*
     *   根据多个拼首字母查询城市
     *   @param charStrs  多个字母拼接的字符串,如 characters="ABCD",则会查询出分别以A、B、C、D开头的城市信息
     */
    @RequestMapping("/characters/{characters}")
    public List<City> getCitiesByFirstCharacter(@PathVariable String characters) {
        return cityService.queryCitiesByMultipleCharacter(characters);
    }
    /*
    *  查询热门城市
    */
    @RequestMapping("/hot")
    public List<City> getHotCities() {
        return cityService.queryHotCities();
    }
}
