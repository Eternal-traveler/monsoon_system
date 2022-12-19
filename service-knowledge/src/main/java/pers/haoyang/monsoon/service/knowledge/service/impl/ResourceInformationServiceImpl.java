package pers.haoyang.monsoon.service.knowledge.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.knowledge.dao.ResourceInformationDao;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceInformationEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceInformationService;


@Service("resourceInformationService")
public class ResourceInformationServiceImpl extends ServiceImpl<ResourceInformationDao, ResourceInformationEntity> implements ResourceInformationService {


}
