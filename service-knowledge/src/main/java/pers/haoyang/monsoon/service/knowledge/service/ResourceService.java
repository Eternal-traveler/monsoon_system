package pers.haoyang.monsoon.service.knowledge.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceEntity;

/**
 * 资源信息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
public interface ResourceService extends IService<ResourceEntity> {

    /**
     * 新增添加的资源信息
     * @param resourceEntity 创建资源信息
     * @return 插入数据的条数
     */
    int saveCreateResource(ResourceEntity resourceEntity);

    /**
     * 通过id批量删除资源
     * @param ids 需要删除的资源id
     */
    void deleteResource(Long[] ids);

    /**
     * 根据id查询资源信息
     * @param id 资源信息id
     * @return 资源信息
     */
    ResourceEntity queryResourceById(Long id);
}

