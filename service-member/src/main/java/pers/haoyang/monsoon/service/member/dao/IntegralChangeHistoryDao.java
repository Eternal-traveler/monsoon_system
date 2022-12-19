package pers.haoyang.monsoon.service.member.dao;

import pers.haoyang.monsoon.service.member.entity.IntegralChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@Mapper
public interface IntegralChangeHistoryDao extends BaseMapper<IntegralChangeHistoryEntity> {
	
}
