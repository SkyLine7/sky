package com.panda.sky.controller.test;

import com.alibaba.fastjson.JSONArray;
import com.panda.sky.controller.BaseController;
import com.panda.sky.util.SXSSFWorkbookUtil;
import com.panda.sky.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 导入导出excel
 * @author pcongda
 * @version 1.0
 */
@Controller
@RequestMapping("/outputXLS")
public class OutPutXLSX extends BaseController{

	@RequestMapping(value = "/downloadToXLSX.html",method = {RequestMethod.GET,RequestMethod.POST})
	public void downloadToXLSX(HttpServletRequest request, HttpServletResponse response){
		//生成10000条假数据
		int count = 100000;
		JSONArray json = new JSONArray();
		for(int i=0;i<100000;i++){
			Student s = new Student();
			s.setName("POI"+i);
			s.setAge(i);
			s.setBirthday(new Date());
			s.setHeight(i);
			s.setWeight(i);
			s.setSex(i/2==0?false:true);
			json.add(s);
		}
		Map<String,String> headMap = new LinkedHashMap<>();
		headMap.put("name","姓名");
		headMap.put("age","年龄");
		headMap.put("birthday","生日");
		headMap.put("height","身高");
		headMap.put("weight","体重");
		headMap.put("sex","性别");

		//调用下载excel接口
		SXSSFWorkbookUtil.createDatas(count,"测试数据.xlsx",headMap,json,request,response);
	}

	@RequestMapping("/downloadToXLS.html")
	public void downloadToXLS(HttpServletRequest request, HttpServletResponse response){
		//生成10000条假数据
		int count = 100000;
		JSONArray json = new JSONArray();
		for(int i=0;i<100000;i++){
			Student s = new Student();
			s.setName("POI"+i);
			s.setAge(i);
			s.setBirthday(new Date());
			s.setHeight(i);
			s.setWeight(i);
			s.setSex(i/2==0?false:true);
			json.add(s);
		}
		Map<String,String> headMap = new LinkedHashMap<>();
		headMap.put("name","姓名");
		headMap.put("age","年龄");
		headMap.put("birthday","生日");
		headMap.put("height","身高");
		headMap.put("weight","体重");
		headMap.put("sex","性别");

		//调用下载excel接口
		SXSSFWorkbookUtil.createData(count,"测试数据.xls",headMap,json,request,response);
	}
}
