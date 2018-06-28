/**
 * Project Name:zjbi
 * File Name:AppPropertiesUtil.java
 * Package Name:com.handsure.zjbi.util
 * Date:2017年5月27日上午10:05:15
 * Copyright (c) 2017, 上海点贸信息计算有限公司版权所有.
 *
 */

package com.panda.sky.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesUtil Function: TODO ADD FUNCTION. date: 2017年5月27日
 * 上午10:05:15
 *
 * @author zhao rui
 * @version
 */

@Component
public class PropertiesUtil {
	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
	
	private static Properties props;

	/**
	 * 
	 * 用法:String value = PropertiesUtil.getProperty("key"); .
	 *
	 */
	public PropertiesUtil() {
		try {
			Resource resource = new ClassPathResource("/application.properties");
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			logger.info("获取属性失败:{}", e.getMessage());
		}
	}

	/**
	 * 获取属性
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		return props == null ? null : props.getProperty(key);
	}

	/**
	 * 获取属性
	 * 
	 * @param key          属性key
	 * @param defaultValue 属性value
	 * @return
	 */
	public static String getProperty(String key, String defaultValue) {
		return props == null ? null : props.getProperty(key, defaultValue);
	}

	/**
	 * 获取properyies属性
	 * 
	 * @return
	 */
	public static Properties getProperties() {
		return props;
	}
}
