package com.khwan.domain.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DomainInterceptor  implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(DomainInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("==================     interceptor start     =========================");
        logger.info("==  requestURI ======>   "+request.getRequestURI());
        logger.info("==  requestURL ======>   "+request.getRequestURL());
        logger.info("==  domain  ======>   "+request.getServerName()==null?"":request.getServerName());
        logger.info("==  querySTring ======>   "+request.getQueryString());
        logger.info("==================     interceptor end    =========================");


        return true;
    }
}
