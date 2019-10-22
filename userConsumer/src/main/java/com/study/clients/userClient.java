package com.study.clients;/**
 * @ProjectName: clouddemo
 * @Package: com.study.clients
 * @ClassName: FeignClient
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/17 23:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/17 23:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 陈方岩
 * @date 2019/10/17 23:41
 */
@FeignClient(value = "user-service",fallback = userClientFallBack.class)
public interface userClient {
    @GetMapping("user/{id}")
    public String queryId(@PathVariable("id") Long id);
}
