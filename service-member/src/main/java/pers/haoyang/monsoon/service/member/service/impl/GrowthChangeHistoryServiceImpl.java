package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.GrowthChangeHistoryDao;
import pers.haoyang.monsoon.service.member.entity.GrowthChangeHistoryEntity;
import pers.haoyang.monsoon.service.member.service.GrowthChangeHistoryService;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity> implements GrowthChangeHistoryService {


}
