package pers.haoyang.monsoon.service.knowledge.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.knowledge.entity.ResourceInformationEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceInformationService;
import pers.haoyang.monsoon.utils.PageUtils;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 资源消息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@RestController
@RequestMapping("knowledge/resourceInformation")
public class ResourceInformationController {
    private final ResourceInformationService resourceInformationService;

    public ResourceInformationController(ResourceInformationService resourceInformationService) {
        this.resourceInformationService = resourceInformationService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("knowledge:resourceInformation:list")
//    public ReturnData list(@RequestParam Map<String, Object> params){
//        PageUtils page = resourceInformationService.queryPage(params);
//
//        return ReturnData.success().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("knowledge:resourceInformation:info")
    public ReturnData info(@PathVariable("id") Long id){
		ResourceInformationEntity resourceInformation = resourceInformationService.getById(id);

        return ReturnData.success().put("resourceInformation", resourceInformation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("knowledge:resourceInformation:save")
    public ReturnData save(@RequestBody ResourceInformationEntity resourceInformation){
		resourceInformationService.save(resourceInformation);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("knowledge:resourceInformation:update")
    public ReturnData update(@RequestBody ResourceInformationEntity resourceInformation){
		resourceInformationService.updateById(resourceInformation);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("knowledge:resourceInformation:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		resourceInformationService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
