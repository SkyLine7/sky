package com.panda.sky.util;

import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * word 文档生成工具类
 * @author pcongda
 * @version 1.0
 */
public class DocumentUtil {

	/**
	 * 生成word文档
	 * @param content
	 * @param request
	 * @param response
	 */
	public static void inputStreamToWord(String content, HttpServletRequest request, HttpServletResponse response){
		InputStream byteOS = null;
		try {
			//将字节数组包装到为字节流中,以utf-8编码格式
			byteOS = new ByteArrayInputStream(content.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		try (POIFSFileSystem fs = new POIFSFileSystem();){
			DirectoryEntry directory = fs.getRoot();
			DocumentEntry documentEntry = directory.createDocument("测试文档", byteOS);
			//设置response参数，打开下载页面
			response.setContentType("application/ms-word;charset=utf-8");
			response.setHeader("Content-Disposition", "attachment;filename="+ StringUtil.processFileName(request,documentEntry.getName()+".doc"));
			response.setContentLength(content.getBytes().length);
			fs.writeFilesystem(response.getOutputStream());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
