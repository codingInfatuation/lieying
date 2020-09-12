package org.lieying.web.controller;

import org.lieying.bean.Information;
import org.lieying.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/information")
public class InformationController {
    @Autowired
    private InformationService informationService;
    @RequestMapping("/all")
    public List<Information> allInformations(){
        return informationService.queryAllInformations();
    }
}
