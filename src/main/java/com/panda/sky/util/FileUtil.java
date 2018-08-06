package com.panda.sky.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.panda.sky.vo.TenderListItemVo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ClassName: FileUtil
 * Function: TODO ADD FUNCTION 文件工具类
 * date: 2018年8月6日
 *
 * @author zhao rui
 * @version 
 */
public class FileUtil {
	private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);

	//默认日期格式
	public static String DEFAULT_DATE_PATTERN="yyyy-MM-dd";

	//默认列宽
	public static int DEFAULT_COLOUMN_WIDTH = 17;

	/**
	 * 给定指定路径，判断文件是否存在.
	 * @author zhao rui
	 * @param destFileName
	 * @return
	 */
	public static File getFile(String destFileName) {
		File file = new File(destFileName);  
        if (file.exists()) {
        	return file;  
        }
        return null;
	}
	
	/**
	 * 
	 * 给定指定文件，判断文件是否存在,存在则删除
	 * @author zhao rui
	 * @param file
	 * @return
	 */
	public static void removeFile(File file) {
        if (file.exists()) {
        	file.delete();
        }
	}
	
	/** 
     * 给定指定路径，创建单个文件
	 * @author pcongda
     * @param destFileName    目标文件名 
     * @return 创建成功，返回true，否则返回false 
     */  
    public static boolean createFile(String destFileName) {  
        File file = new File(destFileName);  
        if (file.exists()) {
        	logger.info("创建单个文件" + destFileName + "失败，目标文件已存在！");  
            return false;  
        }  
        if (destFileName.endsWith(File.separator)) {  
        	logger.info("创建单个文件" + destFileName + "失败，目标文件不能为目录！");  
            return false;  
        }  
        // 判断目标文件所在的目录是否存在  
        if (!file.getParentFile().exists()) {  
            // 如果目标文件所在的文件夹不存在，则创建父文件夹  
        	logger.info("目标文件所在目录不存在，准备创建它！");  
            if (!file.getParentFile().mkdirs()) {  
            	logger.info("创建目标文件所在的目录失败！");  
                return false;  
            }  
        }  
        // 创建目标文件  
        try {  
            if (file.createNewFile()) {  
            	logger.info("创建单个文件" + destFileName + "成功！");  
                return true;  
            } else {  
            	logger.info("创建单个文件" + destFileName + "失败！");  
                return false;  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
            logger.info("创建单个文件" + destFileName + "失败！" + e.getMessage());  
            return false;  
        }  
    }  
  
    /** 
     * 给定指定路径，创建目录(文件夹)
     * @author pcongda
     * @param destDirName   目标目录名 
     * @return 目录创建成功放回true，否则返回false 
     */  
    public static boolean createDir(String destDirName) {  
        File dir = new File(destDirName);  
        if (dir.exists()) {  
        	logger.info("创建目录" + destDirName + "失败，目标目录已存在！");  
            return false;  
        }  
        if (!destDirName.endsWith(File.separator)) {  
            destDirName = destDirName + File.separator;  
        }  
        // 创建目标目录  
        if (dir.mkdir()) {  
        	logger.info("创建目录" + destDirName + "成功！");  
            return true;  
        } else {  
        	logger.info("创建目录" + destDirName + "失败！");  
            return false;  
        }  
    }  
  
    /** 
     * 创建临时文件 
     * @param prefix    临时文件名的前缀 
     * @param suffix    临时文件名的后缀 
     * @param dirName   临时文件所在的目录，如果输入null，则在用户的文档目录下创建临时文件 
     * @return 临时文件创建成功返回true，否则返回false 
     */  
    public static String createTempFile(String prefix, String suffix, String dirName) {  
        File tempFile = null;  
        if (dirName == null) {  
            try {  
                // 在默认文件夹下创建临时文件  
                tempFile = File.createTempFile(prefix, suffix);  
                // 返回临时文件的路径  
                return tempFile.getCanonicalPath();  
            } catch (IOException e) {  
                e.printStackTrace();  
                logger.info("创建临时文件失败!" + e.getMessage());  
                return null;  
            }  
        } else {  
            File dir = new File(dirName);  
            // 如果临时文件所在目录不存在，首先创建  
            if (!dir.exists()) {  
                if (FileUtil.createDir(dirName)) {  
                	logger.info("创建临时文件失败，不能创建临时文件所在的目录！");  
                    return null;  
                }  
            }  
            try {  
                // 在指定目录下创建临时文件  
                tempFile = File.createTempFile(prefix, suffix, dir);  
                return tempFile.getCanonicalPath();  
            } catch (IOException e) {  
                e.printStackTrace();  
                logger.info("创建临时文件失败!" + e.getMessage());  
                return null;  
            }  
        }  
    }

	/**
	 * 导出excel 以xlxs格式
	 * @author pcongda
	 * @param title 标题
	 * @param headMap 列名
	 * @param json 数据集
	 * @param response 响应
	 */
	public static void downloadExcelFile(String title, Map<String,String> headMap, JSONArray json, HttpServletRequest request, HttpServletResponse response, Object obj){
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();

			// 导出为xlsx格式
			exportExcelX(title, headMap, json, null, 0, os,obj);

			byte[] content = os.toByteArray();
			InputStream is = new ByteArrayInputStream(content);
			//设置response参数，打开下载页面
			response.reset();
			response.setContentType("application/msexcel;charset=utf-8");
			response.setHeader("Content-Disposition", "attachment;filename="+ StringUtil.processFileName(request,title));
			response.setContentLength(content.length);
			//设置缓冲区
			response.setBufferSize(1024);
			ServletOutputStream outputStream = response.getOutputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(outputStream);
			byte[] buff = new byte[8192];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
			bis.close();
			bos.close();
			outputStream.flush();
			outputStream.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成Excel 2007 OOXML (.xlsx)格式
	 * @author pcongda
	 * @param title 标题行
	 * @param headMap 属性-列头
	 * @param jsonArray 数据集
	 * @param datePattern 日期格式，传null值则默认 年月日
	 * @param colWidth 列宽 默认 至少17个字节
	 * @param out 输出流
	 */
	public static void exportExcelX(String title, Map<String, String> headMap, JSONArray jsonArray, String datePattern, int colWidth, OutputStream out, Object object) {
		if (datePattern==null) datePattern = DEFAULT_DATE_PATTERN;
		// 声明一个工作薄，内存中保留 100条数据，以免内存溢出，其余写入硬盘
		SXSSFWorkbook workbook = new SXSSFWorkbook(100);//缓存
		workbook.setCompressTempFiles(true);  // 设置压缩
		//设置表头样式
		CellStyle titleStyle = workbook.createCellStyle();
		titleStyle.setAlignment(HorizontalAlignment.CENTER);
		org.apache.poi.ss.usermodel.Font titleFont = workbook.createFont();
		titleFont.setFontHeightInPoints((short) 20);
		titleFont.setBold(true);
		titleStyle.setFont(titleFont);

		// 设置列头样式
		CellStyle headerStyle = workbook.createCellStyle();

		headerStyle.setBorderBottom(BorderStyle.THIN);
		headerStyle.setBorderLeft(BorderStyle.THIN);
		headerStyle.setBorderRight(BorderStyle.THIN);
		headerStyle.setBorderTop(BorderStyle.THIN);
		headerStyle.setAlignment(HorizontalAlignment.CENTER);
		org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 12);
		headerFont.setBold(true);
		headerStyle.setFont(headerFont);

		// 设置单元格样式
		CellStyle cellStyle = workbook.createCellStyle();

		cellStyle.setBorderBottom(BorderStyle.THIN);
		cellStyle.setBorderLeft(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setAlignment(HorizontalAlignment.CENTER);
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		org.apache.poi.ss.usermodel.Font cellFont = workbook.createFont();
		cellFont.setBold(true);
		cellStyle.setFont(cellFont);

		// 生成一个(带标题)表格
		SXSSFSheet sheet = workbook.createSheet("sheet1");
		//设置列宽
		int minBytes = colWidth < DEFAULT_COLOUMN_WIDTH ? DEFAULT_COLOUMN_WIDTH : colWidth;
		int[] arrColWidth = new int[headMap.size()];
		// 产生表格标题行,以及设置列宽
		String[] properties = new String[headMap.size()];
		String[] headers = new String[headMap.size()];
		int ii = 0;
		for (Iterator<String> iter = headMap.keySet().iterator(); iter.hasNext();) {
			String fieldName = iter.next();
			properties[ii] = fieldName;
			headers[ii] = headMap.get(fieldName);
			int bytes = fieldName.getBytes().length;
			arrColWidth[ii] =  bytes < minBytes ? minBytes : bytes;
			sheet.setColumnWidth(ii,arrColWidth[ii] * 256);
			ii++;
		}

		//列头 rowIndex = 0
		SXSSFRow headerRow = sheet.createRow(0);
		for(int i=0;i<headers.length;i++) {
			headerRow.createCell(i).setCellValue(headers[i]);
			headerRow.getCell(i).setCellStyle(headerStyle);
		}

		// 遍历集合数据，产生数据行
		int rowIndex = 0;
		if(jsonArray != null){
			for (Object obj : jsonArray) {
				if(rowIndex == 65535 || rowIndex == 0){
					//如果数据超过了，则在第二页显示
					if (rowIndex != 0) sheet = workbook.createSheet("sheet2");

					for(int i=0;i<headers.length;i++) {
						headerRow.createCell(i).setCellValue(headers[i]);
						headerRow.getCell(i).setCellStyle(headerStyle);
					}
					//数据内容从 rowIndex=1开始
					rowIndex = 1;
				}
				JSONObject jo = (JSONObject) JSONObject.toJSON(obj);
				SXSSFRow dataRow = sheet.createRow(rowIndex);
				for (int i = 0; i < properties.length; i++) {
					SXSSFCell newCell = dataRow.createCell(i);
					Object o =  jo.get(properties[i]);
					String cellValue = "";
					if(o==null) {
						cellValue = "";
					} else if(o instanceof Date){
						cellValue = new SimpleDateFormat(datePattern).format(o);
					} else if(o instanceof Float || o instanceof Double){
						cellValue= new BigDecimal(o.toString()).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
					} else{
						cellValue = o.toString();
					}
					newCell.setCellValue(cellValue);
					newCell.setCellStyle(cellStyle);
				}
				rowIndex++;
			}
		}
		//写入输出流
		try {
			workbook.write(out);
			workbook.close();
			workbook.dispose();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	/**
	 * 读取xls后缀文件:HSSFWorkbook
	 * @author pcongda
	 * @param is
	 */
	public static List<TenderListItemVo> read2003Excel(InputStream is) throws Exception{
		//保存读取到的数据
		List<TenderListItemVo> listData = new LinkedList<>();
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
					TenderListItemVo itemVo = new TenderListItemVo();
					//列头
					HSSFCell tenderItemName = hssfRow.getCell(0);
					HSSFCell tenderItemSpecific = hssfRow.getCell(1);
					HSSFCell tenderItemUnit = hssfRow.getCell(2);
					HSSFCell tenderItemQuantity = hssfRow.getCell(3);
					HSSFCell tenderItemPriceDepend = hssfRow.getCell(4);
					HSSFCell tenderItemRemark = hssfRow.getCell(5);
					//赋值
					itemVo.setTenderItemName(getValueXls(tenderItemName));
					itemVo.setTenderItemSpecific(getValueXls(tenderItemSpecific));
					itemVo.setTenderItemUnit(getValueXls(tenderItemUnit));
					itemVo.setTenderItemQuantity(new Double(getValueXls(tenderItemQuantity)).intValue());
					itemVo.setTenderItemPriceDepend(getValueXls(tenderItemPriceDepend));
					itemVo.setTenderItemRemark(getValueXls(tenderItemRemark));
					listData.add(itemVo);
				}
			}
		}

		if(hwb != null) {
			hwb.close();
		}
		return listData;
	}

	/**
	 * 读取xlsx后缀文件:XSSFWorkbook
	 * @author pcongda
	 * @param is
	 */
	public static List<TenderListItemVo> read2007Excel(InputStream is) throws Exception{
		//保存读取到的数据
		List<TenderListItemVo> listData = new LinkedList<>();
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
					TenderListItemVo itemVo = new TenderListItemVo();
					//列头
					XSSFCell tenderItemName = row.getCell(0);
					XSSFCell tenderItemSpecific = row.getCell(1);
					XSSFCell tenderItemUnit = row.getCell(2);
					XSSFCell tenderItemQuantity = row.getCell(3);
					XSSFCell tenderItemPriceDepend = row.getCell(4);
					XSSFCell tenderItemRemark = row.getCell(5);
					//赋值
					itemVo.setTenderItemName(getValueXlsx(tenderItemName));
					itemVo.setTenderItemSpecific(getValueXlsx(tenderItemSpecific));
					itemVo.setTenderItemUnit(getValueXlsx(tenderItemUnit));
					itemVo.setTenderItemQuantity(new Double(getValueXlsx(tenderItemQuantity)).intValue());
					itemVo.setTenderItemPriceDepend(getValueXlsx(tenderItemPriceDepend));
					itemVo.setTenderItemRemark(getValueXlsx(tenderItemRemark));
					listData.add(itemVo);
				}
			}
		}

		if(sxssfWorkbook != null) {
			sxssfWorkbook.close();
		}
		return listData;
	}

	/**
	 * @deprecated 废弃不用，jar包有bug,取到的size总为0
	 * @author pcongda
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
	 * excel2003获取不同类型的cell值,返回String:xls
	 * @author pcongda
	 * @param hssfCell
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static String getValueXls(HSSFCell hssfCell) {
		if(hssfCell == null) return "";
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
	 * excel2007获取不同类型的cell值,返回String:xlsx
	 * @author pcongda
	 * @param sxssfCell
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static String getValueXlsx(XSSFCell sxssfCell) {
		if(sxssfCell == null) return "";
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


	//========================================================以下是私有方法=========================================//


}