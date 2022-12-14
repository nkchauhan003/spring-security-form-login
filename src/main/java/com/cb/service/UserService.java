package com.cb.service;

import com.cb.dto.UserDto;
import com.cb.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
