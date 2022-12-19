package pers.haoyang.monsoon.service.knowledge.dao;

import pers.haoyang.monsoon.service.knowledge.entity.ResourceCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资源-评论表
 * 
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@Mapper
public interface ResourceCommentDao extends BaseMapper<ResourceCommentEntity> {
	
}
