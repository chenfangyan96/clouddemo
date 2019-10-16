package com.study.cloud.user.service;/**
 * @ProjectName: clouddemo
 * @Package: com.study.cloud.user.service
 * @ClassName: Userservice
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/3 17:39
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/3 17:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import com.study.cloud.user.mapper.UserMapper;
import com.study.cloud.user.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 陈方岩
 * @date 2019/10/3 17:39
 */
@Service
public class Userservice {
    @Autowired
    private UserMapper userMapper;
    public User queryById(Long id){
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return userMapper.selectByPrimaryKey(id);
    }

}
