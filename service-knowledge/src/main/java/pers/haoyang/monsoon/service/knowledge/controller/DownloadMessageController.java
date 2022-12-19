package pers.haoyang.monsoon.service.knowledge.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.haoyang.monsoon.service.knowledge.entity.DownloadMessageEntity;
import pers.haoyang.monsoon.service.knowledge.service.DownloadMessageService;
import pers.haoyang.monsoon.utils.PageUtils;
import pers.haoyang.monsoon.utils.ReturnData;


/**
 * 资源下载表
 *
 * @author haoyang
 * @email a18944930139@gmail.com
 * @date 2022-12-17 18:54:26
 */
@RestController
@RequestMapping("knowledge/downloadMessage")
public class DownloadMessageController {
    private final DownloadMessageService downloadMessageService;

    public DownloadMessageController(DownloadMessageService downloadMessageService) {
        this.downloadMessageService = downloadMessageService;
    }

    /**
     * 列表
     */
//    @RequestMapping("/list")
//    @RequiresPermissions("knowledge:downloadMessage:list")
//    public ReturnData list(@RequestParam Map<String, Object> params){
//        PageUtils page = downloadMessageService.queryPage(params);
//
//        return ReturnData.success().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("knowledge:downloadMessage:info")
    public ReturnData info(@PathVariable("id") Long id){
		DownloadMessageEntity downloadMessage = downloadMessageService.getById(id);

        return ReturnData.success().put("downloadMessage", downloadMessage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("knowledge:downloadMessage:save")
    public ReturnData save(@RequestBody DownloadMessageEntity downloadMessage){
		downloadMessageService.save(downloadMessage);

        return ReturnData.success();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("knowledge:downloadMessage:update")
    public ReturnData update(@RequestBody DownloadMessageEntity downloadMessage){
		downloadMessageService.updateById(downloadMessage);

        return ReturnData.success();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("knowledge:downloadMessage:delete")
    public ReturnData delete(@RequestBody Long[] ids){
		downloadMessageService.removeByIds(Arrays.asList(ids));

        return ReturnData.success();
    }

}
