package cn.net.pikachu.controller;

import cn.net.pikachu.cto.AjaxResult;
import cn.net.pikachu.dao.ArticleDao;
import cn.net.pikachu.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pikachu on 2016/9/13 21:24 in
 * ArticleController
 */
@RestController
public class ArticleController {
    @Autowired
    ArticleDao articleDao;
    @RequestMapping(value = "/article",method = RequestMethod.POST)
    public AjaxResult save(@RequestBody Article article){
        System.out.println("save "+ article);
        articleDao.save(article);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/article/{id}",method = RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable Long id){
        System.out.println("delete "+id);
        articleDao.delete(id);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/article",method = RequestMethod.PUT)
    public AjaxResult update(@RequestBody Article article){
        System.out.println("update "+article);
        articleDao.save(article);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/article/{id}",method = RequestMethod.GET)
    public Article get(@PathVariable Long id){
        System.out.println("get "+id);
        return articleDao.findOne(id);
    }
}
