package com.nfmedia.carshop.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/26.
 */

@Repository
public interface AccountMapper {
    /**
     * 账户转出金额
     *
     * @param out
     * @param money
     */
    public void transferOutMoney(@Param(value = "out") String out, @Param(value = "money") double money);

    /**
     * 账户转入金额
     *
     * @param in
     * @param money
     */
    public void transferInMoney(@Param(value = "in") String in, @Param(value = "money") double money);
}
