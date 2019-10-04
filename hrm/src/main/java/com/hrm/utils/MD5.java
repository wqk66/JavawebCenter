/**   
   * 功能描述：
 * @author: tsingsoft   
 * @date: 2019年7月23日 下午2:46:56 
 * @version：
 * @see：
 */
package com.hrm.utils;

import java.security.MessageDigest;

/**
 * 
 * 描述：md5加密工具
 * @author wqk
 * @since 2019年7月23日 下午5:10:11
 * @version
 */
public class MD5 {

	private static final String[] digital = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e",
			"f" };

	/**
	 * 
	 * <p>
	 * Title: initMD5
	 * </p>
	 * <p>
	 * Description: md5加密
	 * </p>
	 * 
	 * @param txt
	 * @return
	 * @throws Exception String
	 */
	public static String initMD5(String txt) throws Exception {

		// 获取封装MD5算法的核心类
		MessageDigest md5 = MessageDigest.getInstance("MD5");

		// 将明文经过md5加密后变成长度位16字节的数组----->32位的字符串（16进制）
		byte[] bytes = md5.digest(txt.getBytes("utf-8"));
		// 用来保存最终的密文
		String miWen = "";
		for (byte b : bytes) {
			int temp = b;
			//控制temp为正数，根据此数取商，取余
			if (temp < 0) {
				temp += 256;
			}
			int index1 = temp / 16;// 取商
			int index2 = temp % 16;// 取余
			miWen += digital[index1] + digital[index2];

		}
		return miWen;
	}

	/**
	 * 
	 * <p>Title: finalMD5</p>  
	 * <p>Description: md5最终加密</p>  
	 * @param txt
	 * @return
	 * @throws Exception
	 * String
	 */
	public static String finalMD5(String txt) throws Exception {
		//多次加密，提高安全性
		return initMD5(initMD5(initMD5(txt + "md5" + txt) + "md5" + txt));
	}

	public static void main(String[] args) throws Exception {
//		String miWen = MD5.finalMD5("123456");
//		System.out.println(miWen);
		
//		System.out.println(Byte.MAX_VALUE);
		
//		String txt = "123456";
		
		
//		MessageDigest md5 = MessageDigest.getInstance("MD5");
//		byte[] bytes = md5.digest(txt.getBytes());
//		for(byte b : bytes) {
//			System.out.print(b%16+"\t");
//			
//		}
		System.out.println(finalMD5("1"));
	}
	/**
	 * 
	 * <p>功能描述: </p>  
	 * @Return_type：void
	 * @author: wqk   
	 * @date: 2019年7月23日 下午5:04:09
	 * @see
	 */
	
	public void test() {
		
	}

}
