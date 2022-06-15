package com.mvc.file;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String fileUpload(HttpServletRequest request,Model model,UploadFile uploadFile,BindingResult result) {
		
		//유효성 검사, 파일의 크기가 0인지 검사
		filevalidator.validate(uploadFile, result);
		if(uploadFile == null) {
			System.out.println("null");
		}
		if(result.hasErrors())
		{
			return "uploadForm";
		}
		return "home";  
	}
	
}
