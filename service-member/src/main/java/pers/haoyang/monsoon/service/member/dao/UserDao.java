package pers.haoyang.monsoon.service.member.dao;

import pers.haoyang.monsoon.service.member.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
