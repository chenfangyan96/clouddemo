package com.study.cloud.user.controller;
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

import com.study.cloud.user.service.Userservice;
import com.study.cloud.user.vo.User;
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
@RequestMapping("user")
public class UserController {
    @Autowired
    private Userservice userservice;

    @GetMapping("/{id}")
    public User queryId(@PathVariable("id") Long id) {
        return  userservice.queryById(id);
    }
    @GetMapping("/hello")
    public  String  hello(){

        return "魏兴泽好帅";
    }

}
