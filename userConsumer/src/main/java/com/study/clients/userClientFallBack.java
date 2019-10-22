package com.study.clients;/**
 * @ProjectName: clouddemo
 * @Package: com.study.clients
 * @ClassName: userClientFallBack
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/18 0:21
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/18 0:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import com.study.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author 陈方岩
 * @date 2019/10/18 0:21
 */
@Component
public class userClientFallBack implements userClient {
    @Override
    public String queryId(Long id) {
        User user = new User();
        user.setUsername("未查询到此用户");
        return  user.toString();
    }
}
