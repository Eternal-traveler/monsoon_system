package pers.haoyang.monsoon.service.knowledge.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.knowledge.dao.ResourceCommentDao;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceCommentEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceCommentService;


@Service("resourceCommentService")
public class ResourceCommentServiceImpl extends ServiceImpl<ResourceCommentDao, ResourceCommentEntity> implements ResourceCommentService {


}
