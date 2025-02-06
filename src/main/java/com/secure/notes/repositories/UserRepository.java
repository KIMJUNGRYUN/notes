package com.secure.notes.repositories;

import com.secure.notes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //유저를 찾을때 유저 네임으로 찾음
    Optional<User> findByUserName(String username);
    //<User> findByUserName(String username);

    Boolean existsByUserName(String username); //user 존재 여부 
}
