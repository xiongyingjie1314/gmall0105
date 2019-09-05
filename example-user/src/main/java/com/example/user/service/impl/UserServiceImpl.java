package com.example.user.service.impl;


import com.example.user.bean.UmsMember;
import com.example.user.bean.UmsMemberReceiveAddress;
import com.example.user.mapper.UmsMemberReceiveAddressMapper;
import com.example.user.mapper.UserMapper;
import com.example.user.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者：XYJ
 * @创建时间：2019/8/26 8:26
 * @描述：
 **/

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
