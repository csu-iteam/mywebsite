package cn.net.pikachu.controller;

import cn.net.pikachu.cto.*;
import cn.net.pikachu.model.*;
import cn.net.pikachu.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pikachu on 2016/9/13 21:03 in
 * AdminController
 */
@RestController
public class AdminController {
    @Autowired
    AdminDao adminDao;
    @RequestMapping(value = "/admin",method = RequestMethod.POST)
    public AjaxResult save(@RequestBody Admin admin){
        System.out.println("save "+ admin);
        adminDao.save(admin);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/admin/{id}",method = RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable Long id){
        System.out.println("delete "+id);
        adminDao.delete(id);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/admin",method = RequestMethod.PUT)
    public AjaxResult update(@RequestBody Admin admin){
        System.out.println("update "+admin);
        adminDao.save(admin);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/admin/{id}",method = RequestMethod.GET)
    public Admin get(@PathVariable Long id){
        System.out.println("get "+id);
        return adminDao.findOne(id);
    }
}
