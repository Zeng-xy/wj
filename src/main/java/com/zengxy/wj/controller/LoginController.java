package com.zengxy.wj.controller;



import com.fasterxml.jackson.annotation.JsonView;
import com.zengxy.wj.pojo.User;
import com.zengxy.wj.result.Result;
import com.zengxy.wj.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
@Api("登录接口")

public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody

    @ApiOperation(value="登录", notes="根据用户名密码登录")
    @ApiImplicitParam(name = "login", value = "")

    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
    //    public Result login(@RequestBody User requestUser, HttpSession session) {
//        String username = requestUser.getUsername();
//        username = HtmlUtils.htmlEscape(username);
//
//        User user = userService.get(username, requestUser.getPassword());
//        if (null == user) {
//            return new Result(400);
//        } else {
//            session.setAttribute("user", user);
//            return new Result(200);
//        }
//    }
}

