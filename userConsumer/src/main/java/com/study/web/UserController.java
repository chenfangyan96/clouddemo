package com.study.web;
/**
 * @ProjectName: clouddemo
 * @Package: com.study.cloud.user.controller
 * @ClassName: UserController
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/3 17:43
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/3 17:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
import com.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 陈方岩
 * @date 2019/10/3 17:43
 */
@RestController
@RequestMapping("consumer")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

   // @Autowired
   // private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public User queryId(@PathVariable("id") Long id) {
        //根据服务id获取实例
       // List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //从实例中获取id和port
       // ServiceInstance serviceInstance = instances.get(0);
        //String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort() +"/user/"+id;
        //注解方式
        String url="http://user-service/user/"+id;
        return restTemplate.getForObject(url, User.class);
    }

}
