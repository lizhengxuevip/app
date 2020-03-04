package com.zh.dao;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface LoginDao {
    //登录判断操作
    List<Map> login(Map map);

    //注册
    int addSysuser(Map map);

    //修改
    int updateSysuser(Map map);

    void deleteSysuser(Map map);
}
