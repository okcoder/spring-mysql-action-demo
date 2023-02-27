package org.okcoder.demo.springmysqlaction.repository;


import static org.assertj.core.api.Assertions.*;

import org.okcoder.demo.springmysqlaction.entity.User;
import org.okcoder.demo.springmysqlaction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class UserRepositoryTests {

    @Autowired
    private  UserRepository userRepository;


    @Test
    void testList() {
        List<User> list = userRepository.list();
        assertThat(list.size()).isEqualTo(1);
    }
}
