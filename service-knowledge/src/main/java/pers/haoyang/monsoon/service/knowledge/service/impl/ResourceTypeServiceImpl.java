package pers.haoyang.monsoon.service.knowledge.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.knowledge.dao.ResourceTypeDao;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceTypeEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceTypeService;


@Service("resourceTypeService")
public class ResourceTypeServiceImpl extends ServiceImpl<ResourceTypeDao, ResourceTypeEntity> implements ResourceTypeService {


}
