package com.example.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class ZuulLoggingFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //사전 filter, 사후 filter 결정
        return "pre";
    }

    @Override
    public int filterOrder() {
        //여러개 필터중 순서 결정
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        //필터로 사용하겠다 지정
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //실제 동작 정의
        log.info("====================================> print logs : ");

        RequestContext ctx = RequestContext.getCurrentContext();
        //HttpServletRequest을 통한 사용자 요청 정보 가져오기
        HttpServletRequest request = ctx.getRequest();
        //HttpServletRequest로만은 request객체를 넘겨받은것이 아니므로 request, response정보를 가진 최상위 객체를 이용하여 체크
        log.info("====================================> " + request.getRequestURI());
        return null;
    }
}
