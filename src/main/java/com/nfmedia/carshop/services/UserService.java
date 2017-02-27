package com.nfmedia.carshop.services;

import com.nfmedia.carshop.entries.User;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/27.
 */
public interface UserService {
    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    public User getUserById(int id) throws Exception;
}
