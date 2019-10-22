package com.study;/**
 * @ProjectName: clouddemo
 * @Package: com.study
 * @ClassName: ConsumerApplication
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/3 22:02
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/3 22:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author 陈方岩
 * @date 2019/10/3 22:02
 */
/*
这三个注释    熔断器  注册  springbooot自动化配置  =SpringCloudApplication
@EnableCircuitBreaker  //Hystrix
@EnableDiscoveryClient   //Eureka
@SpringBootApplication*/
@SpringCloudApplication
@EnableFeignClients
public class ConsumerApplication {
   /* @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
