package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.IntegralChangeHistoryDao;
import pers.haoyang.monsoon.service.member.entity.IntegralChangeHistoryEntity;
import pers.haoyang.monsoon.service.member.service.IntegralChangeHistoryService;


@Service("integralChangeHistoryService")
public class IntegralChangeHistoryServiceImpl extends ServiceImpl<IntegralChangeHistoryDao, IntegralChangeHistoryEntity> implements IntegralChangeHistoryService {


}
