package com.xiaohu.demolinux.service;

import com.xiaohu.demolinux.dao.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Integer findAccountCount() {
        return accountMapper.findAccountCount();
    }
}
