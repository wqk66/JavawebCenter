/**  
 * hrm
 * com.hrm.utils 
 */
package com.hrm.utils;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月30日 上午11:50:26
 * @version   
 * @see 
 */
public class Constants {

	/**
	 * kaptcha生成验证码配置
	 */
	public final static String KAPTCHA_IMAGE_WIDTH = "kaptcha.image.width";//设置验证码的宽度
	public final static String KAPTCHA_IMAGE_HEIGHT = "kaptcha.image.height";//设置验证码的高度
	public final static String KAPTCHA_TEXTPRODUCER_FONT_SIZE = "kaptcha.textproducer.font.size";//验证码字体大小
	public final static String KAPTCHA_TEXTPRODUCER_CHAR_LENGTH = "kaptcha.textproducer.char.length";//验证码字符个数
	public final static String KAPTCHA_TEXTPRODUCER_CHAR_SPACE = "kaptcha_textproducer.char.space";//验证码字符间距
	public final static String KAPTCHA_TEXTPRODUCER_FONT_COLOR = "kaptcha.textproducer.font.color";//验证码字体颜色
	public final static String KAPTCHA_BORDER_COLOR = "kaptcha.border.color";//边框颜色
	public final static String KAPTCHA_BACKGROUND_CLR_FROM = "kaptcha.background.clr.from";
	public final static String KAPTCHA_NOISE_IMPL = "kaptcha.noise.impl";//干扰线接口
	public final static String KAPTCHA_OBSCURIFICATOR_IMPL = "kaptcha.obscurificator.impl";
	public final static String KAPTCHA_TEXTPRODUCER_CHAR_STRING = "kaptcha.textproducer.char.string";//可能生成的字符
	public final static String KAPTCHA_SESSION_CONFIG_KEY = "kaptcha.session.config.key";
	public final static String KAPTCHA_SESSION_KEY = "kaptcha.session.key";
	public final static String KAPTCHA_BACKGROUND_IMPL = "kaptcha_background_impl";
	public final static String KAPTCHA_BACKGROUND_CLEAR_TO = "kaptcha.background.clear.to";
	public final static String KAPTCHA_BORDER = "kaptcha.border";
	public final static String KAPTCHA_TEXTPRODUCER_IMPL = "kaptcha.textproducer.impl";
	
	//保存会话中的用户信息
	public final static String USER_SESSION = "user_session";
	
	//数据库常量
	public final static String USERTABLE = "user_info";
	public final static String DEPTTABLE = "dept_info";
	public final static String JOBTABLE = "job_info";
	public final static String EMPLOYEETABLE = "employee_info";
	public final static String NOTICETABLE = "notice_info";
	public final static String DOCUMENTTABLE = "document_info";
	
	//登陆
	public final static String LOGIN = "loginForm";
	
}
