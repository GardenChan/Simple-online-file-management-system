package com.myharbour.dao;

import com.myharbour.entity.UserFile;

import java.util.List;

public interface UserFileDAO {
    //根据登陆用户id 获取用户的文件列表信息
    List<UserFile> findByUserId(Integer id);

    //保存用户的文件信息
    void save(UserFile userFile);

    UserFile findById(Integer id);

    void update(UserFile userFile);

    void delete(Integer id);
}
