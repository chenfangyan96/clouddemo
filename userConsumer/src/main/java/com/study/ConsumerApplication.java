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
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 陈方岩
 * @date 2019/10/3 22:02
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
