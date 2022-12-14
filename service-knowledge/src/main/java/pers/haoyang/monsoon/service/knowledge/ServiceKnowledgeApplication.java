package pers.haoyang.monsoon.service.knowledge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hoayang
 * 1、定义一个远程调用客户端,扫描接口方法注解
 * 2、开启服务注册与发现功能
 */

@EnableFeignClients(basePackages = "pers.haoyang.monsoon.service.knowledge.feign")
@EnableDiscoveryClient
@MapperScan("pers.haoyang.monsoon.service.knowledge.dao")
@SpringBootApplication
public class ServiceKnowledgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceKnowledgeApplication.class, args);
    }

}
