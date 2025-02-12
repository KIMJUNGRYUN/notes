package com.secure.notes.services;

import com.secure.notes.dtos.UserDTO;
import com.secure.notes.models.User;

import java.util.List;

public interface UserService {
    //유저의 권한을 업데이트
    void updateUserRole(Long userId, String roleName);
    //모든 유저를 가져옴
    List<User> getAllUsers();
    //한명의 유저를 가져옴(UserDTO 객체)
    UserDTO getUserById(Long id);
}
