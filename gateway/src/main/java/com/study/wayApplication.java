package com.study;
/**
 * @ProjectName: clouddemo
 * @Package: com.study
 * @ClassName: wayApplication
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/18 17:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/18 17:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 陈方岩
 * @date 2019/10/18 17:45
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class wayApplication {
    public static void main(String[] args) {
        SpringApplication.run(wayApplication.class);
    }
}
