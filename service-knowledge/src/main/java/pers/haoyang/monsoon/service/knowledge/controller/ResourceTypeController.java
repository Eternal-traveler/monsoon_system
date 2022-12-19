package pers.haoyang.monsoon.service.knowledge.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.knowledge.entity.ResourceTypeEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceTypeService;
import pers.haoyang.monsoon.utils.PageUtils;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 资源类型表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@RestController
@RequestMapping("knowledge/resourceType")
public class ResourceTypeController {
    private final ResourceTypeService resourceTypeService;

    public ResourceTypeController(ResourceTypeService resourceTypeService) {
        this.resourceTypeService = resourceTypeService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("knowledge:resourceType:list")
//    public ReturnData list(@RequestParam Map<String, Object> params){
//        PageUtils page = resourceTypeService.queryPage(params);
//
//        return ReturnData.success().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("knowledge:resourceType:info")
    public ReturnData info(@PathVariable("id") Long id){
		ResourceTypeEntity resourceType = resourceTypeService.getById(id);

        return ReturnData.success().put("resourceType", resourceType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("knowledge:resourceType:save")
    public ReturnData save(@RequestBody ResourceTypeEntity resourceType){
		resourceTypeService.save(resourceType);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("knowledge:resourceType:update")
    public ReturnData update(@RequestBody ResourceTypeEntity resourceType){
		resourceTypeService.updateById(resourceType);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("knowledge:resourceType:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		resourceTypeService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
