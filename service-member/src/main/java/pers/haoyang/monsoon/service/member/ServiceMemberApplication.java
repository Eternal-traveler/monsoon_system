package pers.haoyang.monsoon.service.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author haoyang
 */

@EnableFeignClients(basePackages = "pers.haoyang.monsoon.service.member.feign")
@EnableDiscoveryClient
@MapperScan("pers.haoyang.monsoon.service.member.dao")
@SpringBootApplication
public class ServiceMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMemberApplication.class, args);
    }

}
