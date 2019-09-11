/**  
 * hrmsys
 * com.hrm.utils 
 */
package com.hrm.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 描述：创建sesssion工厂类
 * @author tsingsoft
 * @since 2019年9月8日 下午10:04:23
 * @version   
 * @see 
 */
public class FKSqlSessionFactory {

	private static SqlSessionFactory sessionFactory = null;
	//初始化创建sqlsessionfactory对象
	static {
		
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mappers/UserMapper.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//获取sqlsession对象的静态方法
	public static SqlSession getSqlsession() {
		return sessionFactory.openSession();
	}
	
	//获取sqlsessionfactory的静态方法
	public static SqlSessionFactory getSqlSessionFactory() {
		return sessionFactory;
	}
}
