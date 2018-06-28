package com.panda.sky.http;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import com.mysql.cj.core.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 统一响应工具,用于json数据返回
 * @author pcongda
 * @version
 */
public class ResponseUtil {
	//消息名称常量
	private final static String MESSAGE = "msg";
	//状态码名称常量
	private final static String CODE = "code";
	//数据名称常量
	public final static String DATA = "data";

	/**
	 * 构造响应对象
	 * @param body
	 * @param msg
	 * @param statusCode
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static ResponseEntity<Object> getEntity(Object body,String msg, HttpStatus statusCode) {
		MultiValueMap<String, String> headers = new HttpHeaders();
		List<String> contentType = new ArrayList<>();
		contentType.add("application/json;charset=utf-8");
		headers.put("Content-Type", contentType);
		Map<String,Object> data = new HashMap<>();
		if(statusCode == HttpStatus.NO_CONTENT){
			//因为HTTP状态码如果为204,则不会返回任何数据,所以需要把HTTP状态码更新为200,并使code状态码变为204
			data.put(CODE,HttpStatus.NO_CONTENT.value());
			statusCode = HttpStatus.OK;
		} else{
			data.put(CODE,statusCode.value());
		}
		//消息
		if(!StringUtils.isNullOrEmpty(msg)){
			data.put(MESSAGE, msg);
		}
		//内容
		if(body != null) {
			data.put(DATA, body);
		}
		return new ResponseEntity(data, headers, statusCode);
	}

	/**
	 * 请求成功,无需返回结果
	 */
	public static ResponseEntity<Object> success() {
		return getEntity(null,"success", HttpStatus.NO_CONTENT);
	}
	/**
	 * 请求成功,并返回请求结果集
	 * @param object 返回到客户端的对象
	 * @return Spring mvc ResponseEntity
	 */
	public static ResponseEntity<Object> success(Object object,String msg) {
		return getEntity(object,msg, HttpStatus.OK);
	}

	/**
	 * 服务器错误
	 * @param msg 请求失败的错误信息
	 * @return Spring mvc ResponseEntity
	 */
	public static ResponseEntity<Object> serverError(String msg) {
		return getEntity(null,msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * 请求失败,找不到数据
	 * @return Spring mvc ResponseEntity
	 */
	public static ResponseEntity<Object> notFound(String msg) {
		return getEntity(null,msg, HttpStatus.NOT_FOUND);
	}

	/**
	 * 鉴权失败
	 * @param msg 请求失败的错误信息
	 * @return Spring mvc ResponseEntity
	 */
	public static ResponseEntity<Object> authorityFailed(String msg) {
		return getEntity(null,msg, HttpStatus.FORBIDDEN);
	}

	/**
	 * 非法参数
	 * @param msg 请求失败的错误信息
	 * @return Spring mvc ResponseEntity
	 */
	public static ResponseEntity<Object> illegalArgument(String msg) {
		return getEntity(null,msg, HttpStatus.NOT_ACCEPTABLE);
	}

	/**
	 * Bad Request
	 * @param msg
	 * @return 请求失败的错误信息
	 */
	public static ResponseEntity<Object> badRequest(String msg) {
		return getEntity(null,msg, HttpStatus.BAD_REQUEST);
	}
}
