package pers.haoyang.monsoon.service.knowledge;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import pers.haoyang.monsoon.service.knowledge.entity.ResourceEntity;
import pers.haoyang.monsoon.service.knowledge.service.ResourceService;

import java.sql.Connection;
import java.sql.DriverManager;

@RunWith(SpringRunner.class)
@SpringBootTest
class ServiceKnowledgeApplicationTests {

    @Autowired
    ResourceService resourceService;

    @Test
    void contextLoads() {
        ResourceEntity resourceEntity = new ResourceEntity();
        resourceEntity.setId(2L);
        resourceEntity.setResourceName("你好1");
        System.out.println(resourceEntity);
        resourceService.save(resourceEntity);
    }


}
