package com.nfmedia.carshop.mapper;

import com.nfmedia.carshop.entries.User;
import org.springframework.stereotype.Repository;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/25.
 */
@Repository
public interface UserMapper {
    User findUserById(int id) throws Exception;
}
