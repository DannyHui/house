package com.mooc.house.mapper;

import com.mooc.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Package: com.mooc.house.mapper
 * @Class: UserMapper
 * @Description: TODO
 * @Author: zhangyahui
 * @Date: 2018/4/8 19:13
 */
@Mapper
public interface UserMapper
{
    public List<User> selectUsers();
}
