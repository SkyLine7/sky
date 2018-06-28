/**
 * Project Name:zjbi
 * File Name:SessionUtil.java
 * Package Name:com.handsure.zjbi.util
 * Date:2017年6月1日下午6:24:37
 * Copyright (c) 2017, 上海点贸信息计算有限公司版权所有.
 *
 */

package com.panda.sky.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: SessionUtil
 * Function: TODO ADD FUNCTION.
 * date: 2017年6月1日 下午6:24:37
 *
 * @author zhao rui
 * @version 
 */
public class SessionUtil {
	private static final Logger logger = LoggerFactory.getLogger(SessionUtil.class);
	
	private static Map<String, HttpSession> sessionMap = new HashMap<String, HttpSession>();
	
	public static Map<String, HttpSession> getSessionMap() {
        return sessionMap;
    }
 
    public synchronized static void addSession(HttpSession session) {
        if (session != null) {
            sessionMap.put(session.getId(), session);
        }
    }
 
    public synchronized static void delSession(HttpSession session) {
        if (session != null) {
            sessionMap.remove(session.getId());
        }
    }
 
    public synchronized static HttpSession getSession(String sessionid) {
        if (sessionid != null) {
            return (HttpSession) sessionMap.get(sessionid);
        } else {
            return null;
        }
    }
 
    public static void printCurrentSessionMapInfo() {
    	logger.info("session size: {}", sessionMap.size());
        Set<String> sessionids = sessionMap.keySet();
        for (String sessionid : sessionids) {
        	logger.info("session Id: {}", sessionid);
        }
    }
    public static void clearAllSession() {
        if (sessionMap != null)
            sessionMap.clear();
    }
}