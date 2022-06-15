package com.mvc.upgrade.common.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{
	
	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	//Controller 호출 전 실행
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws IOException {
		logger.info("[interceptor]:preHandle");
		
		if(request.getRequestURI().contains("/loginform.do")
				|| request.getRequestURI().contains("/ajaxlogin.do")
				|| request.getSession().getAttribute("login") != null) {
			
			return true;
		}
		if(request.getSession().getAttribute("login") ==null){
			response.sendRedirect("loginform.do");
			
			return false;
		}
		
		return false;
	}
	
	//view단으로 forward 되기 전에실행
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView){
		logger.info("[interceptor]:postHandle");
	}
	
	//view까지 처리가 끝난 후 실행
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
		logger.info("[interceptor]:afterCompletion");
	}
}
