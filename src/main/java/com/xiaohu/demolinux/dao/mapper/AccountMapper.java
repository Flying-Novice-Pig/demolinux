package com.xiaohu.demolinux.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    public int findAccountCount();
}
