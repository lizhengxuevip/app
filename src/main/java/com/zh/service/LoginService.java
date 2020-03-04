package com.zh.service;

import com.zh.dao.LoginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {
    @Resource
    private LoginDao loginDao;
}

