package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.IntegralChangeHistoryEntity;
import pers.haoyang.monsoon.service.member.service.IntegralChangeHistoryService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 积分变化历史记录
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/integralChangeHistory")
public class IntegralChangeHistoryController {
    private final IntegralChangeHistoryService integralChangeHistoryService;

    public IntegralChangeHistoryController(IntegralChangeHistoryService integralChangeHistoryService) {
        this.integralChangeHistoryService = integralChangeHistoryService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:integralchangehistory:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = integralChangeHistoryService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:integralChangeHistory:info")
    public ReturnData info(@PathVariable("id") Long id){
		IntegralChangeHistoryEntity integralChangeHistory = integralChangeHistoryService.getById(id);

        return ReturnData.success().put("integralChangeHistory", integralChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:integralChangeHistory:save")
    public ReturnData save(@RequestBody IntegralChangeHistoryEntity integralChangeHistory){
		integralChangeHistoryService.save(integralChangeHistory);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:integralChangeHistory:update")
    public ReturnData update(@RequestBody IntegralChangeHistoryEntity integralChangeHistory){
		integralChangeHistoryService.updateById(integralChangeHistory);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:integralChangeHistory:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		integralChangeHistoryService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
