package pers.haoyang.monsoon.service.knowledge.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceService;
import pers.haoyang.monsoon.utils.ReturnData;

import java.util.Arrays;
import java.util.Map;

/**
 * @author haoyang
 * @create 2022-12-16 16:16
 * @Description
 */

@RestController
@RequestMapping("service/resource")
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("test:resource:list")
    public ReturnData list(@RequestParam Map<String, Object> params){
        PageUtils page = resourceService.queryPage(params);

        return ReturnData.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("service:resource:info")
    public ReturnData info(@PathVariable("id") Long id){
        ResourceEntity resource = resourceService.getById(id);

        return ReturnData.ok().put("resource", resource);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("service:resource:save")
    public ReturnData save(@RequestBody ResourceEntity resource){
        resourceService.save(resource);

        return ReturnData.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("service:resource:update")
    public ReturnData update(@RequestBody ResourceEntity resource){
        resourceService.updateById(resource);

        return ReturnData.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("service:resource:delete")
    public ReturnData delete(@RequestBody Long[] ids){
        resourceService.removeByIds(Arrays.asList(ids));

        return ReturnData.ok();
    }
}
