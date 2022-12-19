package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.CollectKnowledgeEntity;
import pers.haoyang.monsoon.service.member.service.CollectKnowledgeService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 用户收藏的知识(先就这样写)
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/collectKnowledge")
public class CollectKnowledgeController {
    private final CollectKnowledgeService collectKnowledgeService;

    public CollectKnowledgeController(CollectKnowledgeService collectKnowledgeService) {
        this.collectKnowledgeService = collectKnowledgeService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:collectknowledge:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = collectKnowledgeService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:collectKnowledge:info")
    public ReturnData info(@PathVariable("id") Long id){
		CollectKnowledgeEntity collectKnowledge = collectKnowledgeService.getById(id);

        return ReturnData.success().put("collectKnowledge", collectKnowledge);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:collectKnowledge:save")
    public ReturnData save(@RequestBody CollectKnowledgeEntity collectKnowledge){
		collectKnowledgeService.save(collectKnowledge);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:collectKnowledge:update")
    public ReturnData update(@RequestBody CollectKnowledgeEntity collectKnowledge){
		collectKnowledgeService.updateById(collectKnowledge);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:collectKnowledge:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		collectKnowledgeService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
