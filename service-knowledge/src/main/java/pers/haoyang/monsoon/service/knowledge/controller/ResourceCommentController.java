package pers.haoyang.monsoon.service.knowledge.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.knowledge.entity.ResourceCommentEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceCommentService;
import pers.haoyang.monsoon.utils.PageUtils;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 资源-评论表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@RestController
@RequestMapping("knowledge/resourceComment")
public class ResourceCommentController {
    private final ResourceCommentService resourceCommentService;

    public ResourceCommentController(ResourceCommentService resourceCommentService) {
        this.resourceCommentService = resourceCommentService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("knowledge:resourceComment:list")
//    public ReturnData list(@RequestParam Map<String, Object> params){
//        PageUtils page = resourceCommentService.queryPage(params);
//
//        return ReturnData.success().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("knowledge:resourceComment:info")
    public ReturnData info(@PathVariable("id") Long id){
		ResourceCommentEntity resourceComment = resourceCommentService.getById(id);

        return ReturnData.success().put("resourceComment", resourceComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("knowledge:resourceComment:save")
    public ReturnData save(@RequestBody ResourceCommentEntity resourceComment){
		resourceCommentService.save(resourceComment);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("knowledge:resourceComment:update")
    public ReturnData update(@RequestBody ResourceCommentEntity resourceComment){
		resourceCommentService.updateById(resourceComment);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("knowledge:resourceComment:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		resourceCommentService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
