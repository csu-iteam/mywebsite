package cn.net.pikachu.dao;

import cn.net.pikachu.model.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pikachu on 2016/9/13 20:47 in
 * CommentDao
 */
public interface CommentDao extends CrudRepository<Comment,Long> {
}
