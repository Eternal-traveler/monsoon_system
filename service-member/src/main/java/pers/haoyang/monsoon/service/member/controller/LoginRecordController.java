package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.LoginRecordEntity;
import pers.haoyang.monsoon.service.member.service.LoginRecordService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 登陆记录表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/loginRecord")
public class LoginRecordController {
    private final LoginRecordService loginRecordService;

    public LoginRecordController(LoginRecordService loginRecordService) {
        this.loginRecordService = loginRecordService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:loginrecord:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = loginRecordService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:loginRecord:info")
    public ReturnData info(@PathVariable("id") Long id){
		LoginRecordEntity loginRecord = loginRecordService.getById(id);

        return ReturnData.success().put("loginRecord", loginRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:loginRecord:save")
    public ReturnData save(@RequestBody LoginRecordEntity loginRecord){
		loginRecordService.save(loginRecord);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:loginRecord:update")
    public ReturnData update(@RequestBody LoginRecordEntity loginRecord){
		loginRecordService.updateById(loginRecord);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:loginRecord:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		loginRecordService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
