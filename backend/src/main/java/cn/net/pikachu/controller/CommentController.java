package cn.net.pikachu.controller;

import cn.net.pikachu.cto.AjaxResult;
import cn.net.pikachu.dao.CommentDao;
import cn.net.pikachu.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pikachu on 2016/9/13 21:27 in
 * CommentController
 */
@RestController
public class CommentController {@Autowired
CommentDao commentDao;
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public AjaxResult save(@RequestBody Comment comment){
        System.out.println("save "+ comment);
        commentDao.save(comment);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/comment/{id}",method = RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable Long id){
        System.out.println("delete "+id);
        commentDao.delete(id);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/comment",method = RequestMethod.PUT)
    public AjaxResult update(@RequestBody Comment comment){
        System.out.println("update "+comment);
        commentDao.save(comment);
        return new AjaxResult(true);
    }
    @RequestMapping(value = "/comment/{id}",method = RequestMethod.GET)
    public Comment get(@PathVariable Long id){
        System.out.println("get "+id);
        return commentDao.findOne(id);
    }
}
