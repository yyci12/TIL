package com.mvc.dto;

import java.util.Date;

public class MVCBoardDto {
	private int seq;
	private String wirter;
	private String title;
	private String content;
	private Date regdate;
	public MVCBoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MVCBoardDto(int seq, String wirter, String title, String content, Date regdate) {
		super();
		this.seq = seq;
		this.wirter = wirter;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWirter() {
		return wirter;
	}
	public void setWirter(String wirter) {
		this.wirter = wirter;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
