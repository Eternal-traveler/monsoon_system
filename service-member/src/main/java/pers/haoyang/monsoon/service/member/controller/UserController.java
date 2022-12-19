package pers.haoyang.monsoon.service.member.controller;

import java.util.Arrays;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.member.entity.UserEntity;
import pers.haoyang.monsoon.service.member.service.UserService;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 用户表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-19 11:55:42
 */
@RestController
@RequestMapping("member/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("member:user:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:user:info")
    public ReturnData info(@PathVariable("id") Long id){
		UserEntity user = userService.getById(id);

        return ReturnData.success().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:user:save")
    public ReturnData save(@RequestBody UserEntity user){
		userService.save(user);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:user:update")
    public ReturnData update(@RequestBody UserEntity user){
		userService.updateById(user);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:user:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		userService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
