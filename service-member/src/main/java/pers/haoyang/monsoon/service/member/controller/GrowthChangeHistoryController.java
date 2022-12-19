package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.GrowthChangeHistoryEntity;
import pers.haoyang.monsoon.service.member.service.GrowthChangeHistoryService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 成长值变化历史记录
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/growthChangeHistory")
public class GrowthChangeHistoryController {
    private final GrowthChangeHistoryService growthChangeHistoryService;

    public GrowthChangeHistoryController(GrowthChangeHistoryService growthChangeHistoryService) {
        this.growthChangeHistoryService = growthChangeHistoryService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:growthchangehistory:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = growthChangeHistoryService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:growthChangeHistory:info")
    public ReturnData info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return ReturnData.success().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:growthChangeHistory:save")
    public ReturnData save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.save(growthChangeHistory);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:growthChangeHistory:update")
    public ReturnData update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.updateById(growthChangeHistory);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:growthChangeHistory:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
