package com.smailox.dream.app.repo;

import com.smailox.dream.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>      {


    User findByUsername(String username);
}
