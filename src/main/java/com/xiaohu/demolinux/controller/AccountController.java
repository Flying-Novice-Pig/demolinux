package com.xiaohu.demolinux.controller;

import com.xiaohu.demolinux.dto.Response;
import com.xiaohu.demolinux.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account",produces = "application/json; charset=utf-8")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/getCount")
    public Response getAccountCount(){
        Response response = new Response();
        Integer count = accountService.findAccountCount();
        response.returnSuccess(count);
        return response;
    }
}
