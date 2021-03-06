package org.lieying.web.controller;

import org.lieying.bean.Administrator;
import org.lieying.service.AdministratorService;
import org.lieying.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
//    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    @ResponseBody
//    public Administrator login(@RequestParam("username") String  username, @RequestParam("password") String password) throws Exception {
//       return administratorService.queryAdministratorByUsernameAndPassword(username,password);
//    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Administrator login(Administrator administrator) throws Exception {
        return administratorService.queryAdministratorByUsernameAndPassword(administrator.getUsername(),administrator.getPassword());
    }


    /*
    *   管理员详情
    *   @param administratorId 管理员id
    */
    @RequestMapping("/{administratorId}")
    //@ResponseBody
    public Administrator getAdministratorById(@PathVariable  int administratorId){
        return administratorService.queryDetailAdministratorById(administratorId);
    }



}
