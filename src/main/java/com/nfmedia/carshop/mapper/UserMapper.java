package com.nfmedia.carshop.mapper;

import com.nfmedia.carshop.entries.User;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/25.
 */
public interface UserMapper {
    User findUserById(int id) throws Exception;
}
