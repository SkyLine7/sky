/**
 * Project Name:zjbi
 * File Name:AntiSqlInjection.java
 * Package Name:com.handsure.zjbi.util
 * Date:2017年11月6日上午10:01:34
 * Copyright (c) 2017, 上海点贸信息计算有限公司版权所有.
 *
 */

package com.panda.sky.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 防SQL注入工具类 把SQL关键字替换为空字符串. date: 2017年11月6日 上午10:01:34
 *
 * @author zhao rui
 * @version
 */
public class AntiSqlInjection {
	public final static String regex = "'|%|--|and|or|not|use|insert|delete|update|select|count|group|union"
			+ "|create|drop|truncate|alter|grant|execute|exec|xp_cmdshell|call|declare|source|sql";

	/**
	 * 把SQL关键字替换为空字符串
	 * 
	 * @param param
	 * @return
	 */
	public static String filter(String param) {
		if (param == null) {
			return param;
		}
		return param.replaceAll("(?i)" + regex, ""); // (?i)不区分大小写替换
	}

	/**
	 * 返回经过防注入处理的字符串
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getParameter(HttpServletRequest request, String name) {
		return AntiSqlInjection.filter(request.getParameter(name));
	}
}
