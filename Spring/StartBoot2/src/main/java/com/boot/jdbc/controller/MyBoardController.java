package com.boot.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.dto.MyDto;
import com.boot.jdbc.model.service.MyService;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/list")
	public String selectList(Model model) {
		
		List<MyDto> list = myService.selectList();
		model.addAttribute("list",list);
		
		return "myboardlist";
	}
	@GetMapping("/detail")
	public String selectOne(Model model,int myno) {
		model.addAttribute("dto", myService.selectOne(myno));
		
		return "myboarddetail";
	}
	@GetMapping("/insertform")
	public String insertform() {
		
		return null;
	}
	@GetMapping("/insert")
	public int insert() {
		
		return 0;
	}
	@GetMapping("/update")
	public String updaete() {
		
		return "myboardupdate";
	}
	@GetMapping("/delete")
	public int delete() {
		
		return 0;
	}
	/*
	 * /dateail : 상세보기
	 * /insertform: 글 작성 페이지 이동
	 * /insert : 작성글 저장
	 * /update:  글수정
	 * /delete: 글 삭제
	 * */
}
