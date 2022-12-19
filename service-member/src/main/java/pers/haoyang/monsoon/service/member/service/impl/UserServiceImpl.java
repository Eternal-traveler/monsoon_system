package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.UserDao;
import pers.haoyang.monsoon.service.member.entity.UserEntity;
import pers.haoyang.monsoon.service.member.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {



}
