/**  
 * hrm
 * com.hrm.utils 
 */
package com.hrm.controller;

import java.util.Properties;

import org.springframework.stereotype.Component;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import com.hrm.utils.Constants;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月30日 上午11:49:28
 * @version   
 * @see 
 */
@Component
public class GenerateCode {

    public DefaultKaptcha captchaProducer() {
        DefaultKaptcha captchaProducer = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty(Constants.KAPTCHA_IMAGE_WIDTH, "110");
        properties.setProperty(Constants.KAPTCHA_IMAGE_HEIGHT, "35");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_SIZE, "30");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, "4");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_SPACE, "4");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, "137,71,57");
        properties.setProperty(Constants.KAPTCHA_BORDER_COLOR, "LIGHT_GRAY");
        properties.setProperty(Constants.KAPTCHA_NOISE_IMPL, "com.google.code.kaptcha.impl.NoNoise");
        properties.setProperty(Constants.KAPTCHA_OBSCURIFICATOR_IMPL, "com.google.code.kaptcha.impl.WaterRipple");
        properties.setProperty(Constants.KAPTCHA_BACKGROUND_IMPL, "com.google.code.kaptcha.impl.DefaultBackground");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, "abcde2345678gfynmnpwx");
        properties.setProperty(Constants.KAPTCHA_SESSION_CONFIG_KEY, "checkCode");
        properties.setProperty(Constants.KAPTCHA_BACKGROUND_CLEAR_TO, "blue");
        properties.setProperty(Constants.KAPTCHA_BORDER, "no");
        Config config = new Config(properties);
        captchaProducer.setConfig(config);
        return captchaProducer;
    }
}
