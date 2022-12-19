package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.LevelEntity;
import pers.haoyang.monsoon.service.member.service.LevelService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 用户等级表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/level")
public class LevelController {
    private final LevelService levelService;

    public LevelController(LevelService levelService) {
        this.levelService = levelService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:level:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = levelService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:level:info")
    public ReturnData info(@PathVariable("id") Long id){
		LevelEntity level = levelService.getById(id);

        return ReturnData.success().put("level", level);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:level:save")
    public ReturnData save(@RequestBody LevelEntity level){
		levelService.save(level);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:level:update")
    public ReturnData update(@RequestBody LevelEntity level){
		levelService.updateById(level);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:level:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		levelService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
