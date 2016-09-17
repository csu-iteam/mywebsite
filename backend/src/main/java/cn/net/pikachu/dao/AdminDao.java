package cn.net.pikachu.dao;

import cn.net.pikachu.model.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pikachu on 2016/9/13 20:45 in
 * AdminDao
 */
public interface AdminDao extends CrudRepository<Admin,Long> {
}
