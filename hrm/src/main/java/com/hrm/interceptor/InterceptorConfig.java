/**  
 * hrm
 * com.hrm.interceptor 
 */
package com.hrm.interceptor;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月29日 下午1:16:31
 * @version   
 * @see 
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	
	@Resource
	private LoginInterceptor LoginInterceptor;

	/**
	 * @param registry 配置静态资源放行
	 */
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/**");
//	}

	/**
     * @param registry 添加拦截器
     */
    public void addInterceptors(InterceptorRegistry registry) {
        //添加登录处理拦截器，拦截所有请求，登录请求除外
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(LoginInterceptor);
        //排除配置
        interceptorRegistration.excludePathPatterns("/pages/**");
        interceptorRegistration.excludePathPatterns("/statics/**");
        interceptorRegistration.excludePathPatterns("/loginForm");
        interceptorRegistration.excludePathPatterns("/loginHrm");
        interceptorRegistration.excludePathPatterns("/logout");
        interceptorRegistration.excludePathPatterns("/code/generateCode");
//        interceptorRegistration.excludePathPatterns("/index");
        //配置拦截策略
        interceptorRegistration.addPathPatterns("/**");
    }
}
