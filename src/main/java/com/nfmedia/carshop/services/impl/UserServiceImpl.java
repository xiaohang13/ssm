package com.nfmedia.carshop.services.impl;

import com.nfmedia.carshop.entries.User;
import com.nfmedia.carshop.mapper.UserMapper;
import com.nfmedia.carshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    @Override
    public User getUserById(int id) throws Exception {
        return userMapper.findUserById(id);
    }
}
