package com.panda.sky.controller.test;

import com.alibaba.fastjson.JSONArray;
import com.panda.sky.controller.BaseController;
import com.panda.sky.http.ResponseUtil;
import com.panda.sky.util.FileUtil;
import com.panda.sky.util.SXSSFWorkbookUtil;
import com.panda.sky.vo.Student;
import com.panda.sky.vo.TenderListItemVo;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

/**
 * 文件操作类：word(doc,docx) excel(xls,xlsx) pdf ...
 * @author pcongda
 * @version 1.0
 */
@Controller
@RequestMapping("/test")
public class FileController extends BaseController{

	private Logger logger = LoggerFactory.getLogger(FileController.class);

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

	/**
	 * 导入excel文件，输出json内容
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "/outputXlxs.json",method = {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<Object> outputXlxs(MultipartFile file){
		Map<String,Object> dataMap = new HashMap<>();
		String originName = file.getOriginalFilename();
		String extension = originName.lastIndexOf(".") == -1 ? "":originName.substring(originName.lastIndexOf(".")+1);
		if("xls".equals(extension)){
			try {
				List<TenderListItemVo> studentVoList = FileUtil.read2003Excel(file.getInputStream());
				dataMap.put("studentVoList",studentVoList);
				return ResponseUtil.success(dataMap,"成功！");
			}catch (Exception e){
				e.printStackTrace();
				return ResponseUtil.serverError("服务器出错！");
			}
		}else if("xlsx".equals(extension)){
			try {
				List<TenderListItemVo> studentVoList = FileUtil.read2007Excel(file.getInputStream());
				dataMap.put("studentVoList",studentVoList);
				return ResponseUtil.success(dataMap,"成功！");
			} catch (Exception e) {
				e.printStackTrace();
				return ResponseUtil.serverError("服务器出错！");
			}
		}else{
			logger.error("不支持的文件类型！");
			return ResponseUtil.badRequest("不支持的文件类型！");
		}
	}

	/**
	 * freemarker解析字符，得到content
	 * @author pcongda
	 * @return
	 */
	@RequestMapping(value = "/getJsonData.json",method = {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<Object> getContent(String jsonData){
		Map<String,Object> dataMap = new HashMap<>();
		Template temp = null;

		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		StringTemplateLoader stringLoader = new StringTemplateLoader();
		stringLoader.putTemplate("ac",jsonData);
		cfg.setTemplateLoader(stringLoader);
		try {
			temp = cfg.getTemplate("ac","utf-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String,Object> root = new HashMap<>();
		root.put("供方单位","上海的说法计算的话");
		root.put("招标项目名称","上海的说法");
		root.put("招标项目名称","上海的说");
		root.put("中标金额大写","九十九万");
		root.put("中标金额",99);

		Writer out = new StringWriter(2048);
		try {
			temp.process(root, out);
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(out.toString());
		dataMap.put("data",out.toString());
		return ResponseUtil.success(dataMap,"成功！");
	}
}
