package pers.haoyang.monsoon.service.knowledge.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.haoyang.monsoon.utils.ReturnData;

/**
 * @author haoyang
 * @email a18944930139@gmail.com
 * @create 2022-12-20 10:19
 * @Description 测试Controller
 */

@RestController
@RequestMapping("test")
// 动态获取配置
@RefreshScope
public class TestController {

    @Value("${test.user.name}")
    private String name;
    @Value("${test.user.age}")
    private int age;

    @RequestMapping("/nacos")
    public ReturnData nacos() {
        return ReturnData.success().put("name", name).put("age", age);
    }
}
