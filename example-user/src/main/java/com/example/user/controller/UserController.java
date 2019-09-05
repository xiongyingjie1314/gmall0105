package com.example.user.controller;

import com.example.user.bean.UmsMember;
import com.example.user.bean.UmsMemberReceiveAddress;
import com.example.user.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @作者：XYJ
 * @创建时间：2019/8/26 8:22
 * @描述：
 **/
@Controller
public class UserController {

    @Autowired
    private Userservice userService;
    @Autowired

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
       return "hello spring boot index";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
//        List<UmsMember> umsMembers = userService.
        return umsMembers;
    }
    //查询用户收货地址
    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
}
