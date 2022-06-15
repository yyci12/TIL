package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.dto.BoardDto;
import com.mvc.upgrade.model.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("list",service.selectList());
		
		return "mvclist";
	}
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {
		logger.info("SELECT ONE");
		
		model.addAttribute("dto", service.selectOne(myno));
		
		
		return "mvcdetail";
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("INSERT FORM");
		
		return "mvcinsert";
	}
	
	@RequestMapping("/insertres.do")
	public String insertRes(BoardDto dto) {
		logger.info("INSERT RES");
		
		int res = service.insert(dto);
		if (res>0) {
			return "redirect:list.do";
		}else{
			return "mvcinsert";
		}
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(int myno,Model model) {
		logger.info("UPDATE FORM");
		
		model.addAttribute("dto",service.selectOne(myno));
		
		
		return "mvcupdate";
	}
	
	@RequestMapping("/updateres.do")
	public String updateRes(BoardDto dto) {
		logger.info("UPDATE RES");
		
		int res = service.update(dto);
		
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			return "redirect:updateform.do?myno="+dto.getMyno();
		}

	}
	
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		logger.info("delete");
		
		int res = service.delete(myno);
		
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:detail.do?myno="+myno;
		}
	}
	
	@RequestMapping("/test.do")
	public String test() {
		logger.info("TRANSACTION");
		service.test();
		return "redirect:list.do";
	}
}
