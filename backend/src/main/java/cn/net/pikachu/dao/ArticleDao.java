package cn.net.pikachu.dao;

import cn.net.pikachu.model.Article;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pikachu on 2016/9/13 20:47 in
 * ArticleDao
 */
public interface ArticleDao extends CrudRepository<Article,Long> {
}
