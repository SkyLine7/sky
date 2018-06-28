package com.panda.sky.controller;

import com.panda.sky.security.domain.UserDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;

/**
 * 基本的controller,所有的controller都必须继承它
 * @author pcongda
 * @version 1.0
 */
public class BaseController {
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
    protected final static String SERVER_ERROR_MESSAGE = "对不起,服务器出了点问题";
    
    /**
     * 
     * 获取当前登录用户信息
     * @param session
     * @return
     */
    public UserDetail getLoginUserInfo(HttpSession session) {
		UserDetail userDetail = (UserDetail) session.getAttribute("userDetail");
    	return userDetail;
    }
}