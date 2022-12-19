package pers.haoyang.monsoon.service.knowledge.dao;

import pers.haoyang.monsoon.service.knowledge.entity.ResourceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资源信息表
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@Mapper
public interface ResourceDao extends BaseMapper<ResourceEntity> {
    /**
     * 新增添加的资源
     * @param resourceEntity 创建的资源信息
     * @return 插入数据的条数
     */
	int insertResource(ResourceEntity resourceEntity);

    /**
     * 通过id批量删除资源
     * @param ids 需要删除的资源id
     * @return 删除的条数
     */
    int deleteResourceByIds(Long[] ids);

    /**
     * 根据id查找资源信息
     * @param id 需要查找的资源信息id
     * @return 资源信息
     */
    ResourceEntity selectResourceById(Long id);
}
