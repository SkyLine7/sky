package com.panda.sky.controller.test;

import com.panda.sky.controller.BaseController;
import com.panda.sky.http.ResponseUtil;
import com.panda.sky.vo.StudentVo;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 测试 controller
 * @author pcongda
 */
@Controller
@RequestMapping("/xlsx")
public class XlxsHandle extends BaseController{
	private static final Logger logger = LoggerFactory.getLogger(XlxsHandle.class);

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
				List<StudentVo> studentVoList = read2003Excel(file.getInputStream());
				dataMap.put("studentVoList",studentVoList);
				return ResponseUtil.success(dataMap,"成功！");
			}catch (Exception e){
				e.printStackTrace();
				return ResponseUtil.serverError("服务器出错！");
			}
		}else if("xlsx".equals(extension)){
			try {
				List<StudentVo> studentVoList = read2007Excel(file.getInputStream());
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
	 * 得到content
	 * @return
	 */
	@RequestMapping(value = "/getJsonData",method = {RequestMethod.GET,RequestMethod.POST})
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


	/**
	 * 读取xlsx后缀文件:SXSSFWorkbook
	 */
//	private List<StudentVo> read2007Excel(InputStream is) throws Exception{
//		//保存读取到的数据
//		List<StudentVo> listData = new LinkedList<>();
//		//创建sxssfworkbook 对象，内存中保留 1000条数据，以免内存溢出，其余写入硬盘
//		SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook(new XSSFWorkbook(is),1000);
//		//循环工作簿
//		for(int numSheet = 0; numSheet < sxssfWorkbook.getNumberOfSheets();numSheet++){
//			SXSSFSheet sheet = sxssfWorkbook.getSheetAt(numSheet);
//			if(sheet == null){
//				continue;
//			}
//			for(int rowNum = 1;rowNum <= sheet.getLastRowNum(); rowNum++){ //这里jar包有bug,取到的size总为0
//				SXSSFRow row = sheet.getRow(rowNum);
//				if(row != null){
//					StudentVo student = new StudentVo();
//					//假设3列
//					SXSSFCell name = row.getCell(0);
//					SXSSFCell age = row.getCell(1);
//					SXSSFCell score = row.getCell(2);
//					student.setId(rowNum);
//					student.setName(getValueXlsx(name));
//					student.setAge(new Double(getValueXlsx(age)).intValue());
//					student.setScore(Double.parseDouble(getValueXlsx(score)));
//					listData.add(student);
//				}
//			}
//		}
//		return listData;
//	}

	/**
	 * 读取xlsx后缀文件:XSSFWorkbook
	 */
	private List<StudentVo> read2007Excel(InputStream is) throws Exception{
		//保存读取到的数据
		List<StudentVo> listData = new LinkedList<>();
		XSSFWorkbook sxssfWorkbook = new XSSFWorkbook(is);
		//循环工作簿
		for(int numSheet = 0; numSheet < sxssfWorkbook.getNumberOfSheets();numSheet++){
			XSSFSheet sheet = sxssfWorkbook.getSheetAt(numSheet);
			if(sheet == null){
				continue;
			}
			for(int rowNum = 1;rowNum <= sheet.getLastRowNum(); rowNum++){
				XSSFRow row = sheet.getRow(rowNum);
				if(row != null){
					StudentVo student = new StudentVo();
					//假设3列
					XSSFCell name = row.getCell(0);
					XSSFCell age = row.getCell(1);
					XSSFCell score = row.getCell(2);
					student.setId(rowNum);
					student.setName(getValueXlsx(name));
					student.setAge(new Double(getValueXlsx(age)).intValue());
					student.setScore(Double.parseDouble(getValueXlsx(score)));
					listData.add(student);
				}
			}
		}
		return listData;
	}

	/**
	 * 读取xls后缀文件:HSSFWorkbook
	 * @param is
	 */
	private List<StudentVo> read2003Excel(InputStream is) throws Exception{
		//保存读取到的数据
		List<StudentVo> listData = new LinkedList<>();
		//获取workbook对象
		HSSFWorkbook hwb = new HSSFWorkbook(is);

		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hwb.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hwb.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row,从第二行（index:1）开始
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow != null) {
					StudentVo student = new StudentVo();
					//假设3列
					HSSFCell name = hssfRow.getCell(0);
					HSSFCell age = hssfRow.getCell(1);
					HSSFCell score = hssfRow.getCell(2);
					student.setId(rowNum);
					student.setName(getValueXls(name));
					student.setAge(new Double(getValueXls(age)).intValue());
					student.setScore(Double.parseDouble(getValueXls(score)));
					listData.add(student);
				}
			}
		}
		return listData;
	}

	/**
	 * 获取不同类型的cell值,返回String:xls
	 * @param hssfCell
	 * @return
	 */
	@SuppressWarnings("static-access")
	private String getValueXls(HSSFCell hssfCell) {
		//boolean
		if (hssfCell.getCellTypeEnum() == CellType.BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		//数值
         } else if (hssfCell.getCellTypeEnum() == CellType.NUMERIC) {
             return String.valueOf(hssfCell.getNumericCellValue());
         //String
         } else {
             return hssfCell.getStringCellValue();
         }
    }

	/**
	 * 获取不同类型的cell值,返回String:xlsx
	 * @param sxssfCell
	 * @return
	 */
//	@SuppressWarnings("static-access")
//	private String getValueXlsx(SXSSFCell sxssfCell) {
//		//boolean
//		if (sxssfCell.getCellType() == CellType.BOOLEAN.getCode()) {
//			return String.valueOf(sxssfCell.getBooleanCellValue());
//			//数值
//		} else if (sxssfCell.getCellType() == CellType.NUMERIC.getCode()) {
//			return String.valueOf(sxssfCell.getNumericCellValue());
//			//String
//		} else {
//			return sxssfCell.getStringCellValue();
//		}
//	}

	/**
	 * 获取不同类型的cell值,返回String:xlsx
	 * @param sxssfCell
	 * @return
	 */
	@SuppressWarnings("static-access")
	private String getValueXlsx(XSSFCell sxssfCell) {
		//boolean
		if (sxssfCell.getCellType() == CellType.BOOLEAN.getCode()) {
			return String.valueOf(sxssfCell.getBooleanCellValue());
			//数值
		} else if (sxssfCell.getCellType() == CellType.NUMERIC.getCode()) {
			return String.valueOf(sxssfCell.getNumericCellValue());
			//String
		} else {
			return sxssfCell.getStringCellValue();
		}
	}
}

