package com.mvc.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.file.validate.FileValidator;
import com.mvc.file.validate.UploadFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private FileValidator filevalidator;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/form.do")
	public String getUploadForm() {
		
		return "uploadForm";
	}
	@RequestMapping(value = "/upload.do")
	public String fileUpload(HttpServletRequest request,Model model,@ModelAttribute UploadFile uploadFile,BindingResult result) {
		System.out.println("context : "+uploadFile.getDesc());
		System.out.println("File Size :  "+uploadFile.getFile().getSize());
		//유효성 검사, 파일의 크기가 0인지 검사
		filevalidator.validate(uploadFile, result);
		if(result.hasErrors())
		{
			return "uploadForm";
		}
		
		MultipartFile file = uploadFile.getFile();
		String filename = file.getOriginalFilename(); 
		
		UploadFile fileobj = new UploadFile();
		fileobj.setFilename(filename);
		fileobj.setDesc(uploadFile.getDesc());
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = file.getInputStream();
			
			String path = WebUtils.getRealPath(request.getSession().getServletContext(), "/stroage");
			System.out.println("path : "+path);
			
			File storage = new File(path);
			if(!storage.exists()) { //존재여부
				storage.mkdirs(); // 디렉토리 만들기
			}
			
			File newfile = new File(path+"/"+filename);
			if(!newfile.exists()) {
				newfile.createNewFile();
			}
			
			outputStream = new FileOutputStream(newfile);
			
			int read = 0;
			byte[] b = new byte[(int)file.getSize()];
			
			while((read=inputStream.read(b)) != -1) {
				outputStream.write(b,0,read);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		model.addAttribute("fileobj",fileobj);
		
		return "uploadFile";  
	}
	
}
