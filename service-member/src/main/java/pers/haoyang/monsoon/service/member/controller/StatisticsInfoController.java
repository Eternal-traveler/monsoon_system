package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.StatisticsInfoEntity;
import pers.haoyang.monsoon.service.member.service.StatisticsInfoService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 用户统计信息表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/statisticsInfo")
public class StatisticsInfoController {
    private final StatisticsInfoService statisticsInfoService;

    public StatisticsInfoController(StatisticsInfoService statisticsInfoService) {
        this.statisticsInfoService = statisticsInfoService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:statisticsinfo:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = statisticsInfoService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:statisticsInfo:info")
    public ReturnData info(@PathVariable("id") Long id){
		StatisticsInfoEntity statisticsInfo = statisticsInfoService.getById(id);

        return ReturnData.success().put("statisticsInfo", statisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:statisticsInfo:save")
    public ReturnData save(@RequestBody StatisticsInfoEntity statisticsInfo){
		statisticsInfoService.save(statisticsInfo);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:statisticsInfo:update")
    public ReturnData update(@RequestBody StatisticsInfoEntity statisticsInfo){
		statisticsInfoService.updateById(statisticsInfo);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:statisticsInfo:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		statisticsInfoService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
