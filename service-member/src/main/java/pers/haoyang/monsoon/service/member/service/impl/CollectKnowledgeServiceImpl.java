package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.CollectKnowledgeDao;
import pers.haoyang.monsoon.service.member.entity.CollectKnowledgeEntity;
import pers.haoyang.monsoon.service.member.service.CollectKnowledgeService;


@Service("collectKnowledgeService")
public class CollectKnowledgeServiceImpl extends ServiceImpl<CollectKnowledgeDao, CollectKnowledgeEntity> implements CollectKnowledgeService {

}
