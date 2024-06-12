package com.dmdev.spring.service;

import com.dmdev.spring.database.repository.CompanyRepository;
import com.dmdev.spring.database.repository.UserRepository;

public class CompanyService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
