package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.LoginRecordDao;
import pers.haoyang.monsoon.service.member.entity.LoginRecordEntity;
import pers.haoyang.monsoon.service.member.service.LoginRecordService;


@Service("loginRecordService")
public class LoginRecordServiceImpl extends ServiceImpl<LoginRecordDao, LoginRecordEntity> implements LoginRecordService {

}
