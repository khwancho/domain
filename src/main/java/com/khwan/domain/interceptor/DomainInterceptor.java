package com.khwan.domain.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DomainInterceptor  implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(DomainInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logger.debug("requestURI ======>   "+request.getRequestURI());
        logger.debug("requestURL ======>   "+request.getRequestURL());
        logger.debug("querySTring ======>   "+request.getQueryString());

        throw new RuntimeException("unauthorized");
    }
}
