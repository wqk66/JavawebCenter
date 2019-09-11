/**  
 * hrmsys
 * com.hrm.controller 
 */
package com.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述：人事管理启动项
 * @author wqk
 * @since 2019年9月8日 上午12:19:58
 * @version   
 * @see 
 */
@SpringBootApplication(scanBasePackages = {"com.hrm.controller","com.hrm.service.impl"})
@EnableAutoConfiguration
@MapperScan("com.hrm.mapper")
public class HrmApplication {
	public static void main(String[] args) {
		SpringApplication.run(HrmApplication.class, args);
	}
}
