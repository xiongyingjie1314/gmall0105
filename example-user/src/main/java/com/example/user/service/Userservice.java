package com.example.user.service;

import com.example.user.bean.UmsMember;
import com.example.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @作者：XYJ
 * @创建时间：2019/8/26 8:26
 * @描述：
 **/
public interface Userservice {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
