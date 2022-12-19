package pers.haoyang.monsoon.service.knowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.knowledge.dao.ResourceDao;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceService;


/**
 * @author haoyang
 */
@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceDao, ResourceEntity> implements ResourceService {

    private final ResourceDao resourceDao;

    public ResourceServiceImpl(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }


    @Override
    public int saveCreateResource(ResourceEntity resourceEntity) {
        return resourceDao.insertResource(resourceEntity);
    }

    @Override
    public void deleteResource(Long[] ids) {
        resourceDao.deleteResourceByIds(ids);
    }

    @Override
    public ResourceEntity queryResourceById(Long id) {
        return resourceDao.selectResourceById(id);
    }

}
