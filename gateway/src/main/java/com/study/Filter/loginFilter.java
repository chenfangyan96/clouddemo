package com.study.Filter;/**
 * @ProjectName: clouddemo
 * @Package: com.study.Filter
 * @ClassName: loginFilter
 * @Description: miaoshu
 * @Author: chenfangyan
 * @CreateDate: 2019/10/29 21:10
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/29 21:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 陈方岩
 * @date 2019/10/29 21:10
 */
@Component
public class loginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER -1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取上下文请求
        RequestContext currentContext = RequestContext.getCurrentContext();
        //获取请求
        HttpServletRequest request = currentContext.getRequest();
        //获取参数
        String parameter = request.getParameter("access-token");
        if(StringUtils.isBlank(parameter)){
             currentContext.setSendZuulResponse(false);
             currentContext.setResponseStatusCode(HttpStatus.SC_FORBIDDEN);
        }
        return null;

    }
}
