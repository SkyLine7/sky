package com.panda.sky.controller.test;

import com.panda.sky.controller.BaseController;
import com.panda.sky.util.DocumentUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * html导出为word
 * @author pcongda
 * @version 1.0
 */
@Controller
@RequestMapping("/document")
public class DocumentHandle extends BaseController{
	@RequestMapping(value = "/downloadDocx.html",method = {RequestMethod.GET,RequestMethod.POST})
	public void outputDocx(HttpServletRequest request, HttpServletResponse response, String jsonData){
		//拼接标准的html格式
		String htmlContent = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"></meta>\n</head>\"\n<body>"+jsonData+"</body></html>";
		DocumentUtil.inputStreamToWord(htmlContent,request,response);
	}
}
