package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.StatisticsInfoDao;
import pers.haoyang.monsoon.service.member.entity.StatisticsInfoEntity;
import pers.haoyang.monsoon.service.member.service.StatisticsInfoService;


@Service("statisticsInfoService")
public class StatisticsInfoServiceImpl extends ServiceImpl<StatisticsInfoDao, StatisticsInfoEntity> implements StatisticsInfoService {


}
