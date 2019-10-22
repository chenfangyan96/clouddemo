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


import com.study.clients.userClient;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈方岩
 * @date 2019/10/3 17:43
 */
@RestController
@RequestMapping("consumer")
public class UserController {
/*
  这种方式最初始的方式进行调用



  @Autowired
    private RestTemplate restTemplate;
     @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("/{id}")
    public String queryId(@PathVariable("id") Long id) {
        //根据服务id获取实例
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //从实例中获取id和port
        ServiceInstance serviceInstance = instances.get(0);
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort() +"/user/"+id;
        //注解方式
        return restTemplate.getForObject(url,String.class);
    }*/

   /* @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{id}")
    public String queryId(@PathVariable("id") Long id) {
        //默认轮询算法
       // ServiceInstance choose = client.choose("user-service");
        //String url="http://"+choose.getHost()+":"+choose.getPort() +"/user/"+id;
        *//*第二种
        * 在RestTempla添加@LoadBalanced
        *
        *
        * *//*
       //这种方法会使用拦截器进行拦截  替换user-service

        String url="http://user-service/user/"+id;
        return restTemplate.getForObject(url, String.class);

    }*/


     /* public   String queryFallBack( ){
       return "请求超时啦";
      }*/
        @Autowired
        private userClient client;
    @GetMapping("{id}")
    public String queryId(@PathVariable("id") Long id) {

       return client.queryId(id);

    }

}
