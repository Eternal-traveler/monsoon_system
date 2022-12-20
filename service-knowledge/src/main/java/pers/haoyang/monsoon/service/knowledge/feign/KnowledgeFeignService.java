package pers.haoyang.monsoon.service.knowledge.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.haoyang.monsoon.utils.ReturnData;

/**
 * @author haoyang
 * @email a18944930139@gmail.com
 * @create 2022-12-20 10:09
 * @Description
 * 1、告诉spring cloud这个接口是一个远程客户端，要调用knowledge服务（nacos中找到）
 */
@FeignClient("service-knowledge")
public interface KnowledgeFeignService {
//
//    /**
//     * test:远程服务的url
//     * @return returnData
//     */
//    @RequestMapping("/member/user/list") //注意写全，会员类上还有映射
//    public ReturnData memeberKnowledge();// 得到一个ReturnData对象

}
