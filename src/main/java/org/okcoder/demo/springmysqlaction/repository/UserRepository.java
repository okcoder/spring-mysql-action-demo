package org.okcoder.demo.springmysqlaction.repository;

import org.okcoder.demo.springmysqlaction.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository  {

    private final JdbcTemplate template;

    public UserRepository(JdbcTemplate template) {
        this.template = template;
    }

    public List<User> list(){
        return template.query("select * from m_user",new BeanPropertyRowMapper<>(User.class));
    }

}
