package com.study.cloud.user.vo;/**
 * @ProjectName: clouddemo
 * @Package: com.study.cloud.user.vo
 * @ClassName: User
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/3 17:31
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/3 17:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author 陈方岩
 * @date 2019/10/3 17:31
 */
@Data
@Table(name = "t_user")
public class User {
    // 主键
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;    // 用户名
    private String username;
    // 密码
    private String sex;

    // 姓名
    private Date birthday;

}
