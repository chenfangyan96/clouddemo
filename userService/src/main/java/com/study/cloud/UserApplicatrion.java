package com.study.cloud;/**
 * @ProjectName: clouddemo
 * @Package: com.study.cloud
 * @ClassName: UserApplicatrion
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/3 17:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/3 17:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 陈方岩
 * @date 2019/10/3 17:20
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.study.cloud.user.mapper")
public class UserApplicatrion {
    public static void main(String[] args) {
        SpringApplication.run(UserApplicatrion.class);
    }
}
