package pers.haoyang.monsoon.service.member.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.member.dao.LevelDao;
import pers.haoyang.monsoon.service.member.entity.LevelEntity;
import pers.haoyang.monsoon.service.member.service.LevelService;


@Service("levelService")
public class LevelServiceImpl extends ServiceImpl<LevelDao, LevelEntity> implements LevelService {


}
