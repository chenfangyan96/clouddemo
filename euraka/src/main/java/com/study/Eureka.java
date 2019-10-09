package com.study;/**
 * @ProjectName: clouddemo
 * @Package: com.study
 * @ClassName: Eureka
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/3 22:47
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/3 22:47
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 陈方岩
 * @date 2019/10/3 22:47
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {
    public static void main(String[] args) {
        SpringApplication.run(Eureka.class);
    }
}
