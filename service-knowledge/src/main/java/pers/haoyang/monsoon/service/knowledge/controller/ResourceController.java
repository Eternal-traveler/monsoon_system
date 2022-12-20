package pers.haoyang.monsoon.service.knowledge.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import pers.haoyang.monsoon.service.knowledge.entity.ResourceEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceService;
import pers.haoyang.monsoon.utils.PageUtils;
import pers.haoyang.monsoon.utils.ReturnData;

/**
 * 资源信息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@RestController
@RequestMapping("knowledge/resource")
public class ResourceController {
    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("knowledge:resource:list")
//    public ReturnData list(@RequestParam Map<String, Object> params){
//        PageUtils page = resourceService.queryPage(params);
//
//        return ReturnData.success().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("knowledge:resource:info")
    public ReturnData info(@PathVariable("id") Long id){
		ResourceEntity resource = resourceService.getById(id);

        return ReturnData.success().put("resource", resource);
    }

    /**
     * 保存创建的资源信息
     * @param resource 资源信息
     * @return 数据
     */
    @RequestMapping("/saveCreateResource")
    @RequiresPermissions("knowledge:resource:saveCreateResource")
    public ReturnData save(@RequestBody ResourceEntity resource){
//		resourceService.save(resource);
        resourceService.saveCreateResource(resource);
        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("knowledge:resource:update")
    public ReturnData update(@RequestBody ResourceEntity resource){
		resourceService.updateById(resource);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @RequiresPermissions("knowledge:resource:delete")
    public ReturnData delete(@RequestBody Long[] ids){
//		resourceService.removeByIds(Arrays.asList(ids));
        //暂时这样子写
        resourceService.deleteResource(ids);
        return ReturnData.success();
    }

}
