package com.mvc.upgrade.model.dto;

public class MemberDto {
	private int memberno;
	private int memberid;
	private int memberpw;
	private int membername;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(int memberno, int memberid, int memberpw, int membername) {
		super();
		this.memberno = memberno;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public int getMemberpw() {
		return memberpw;
	}
	public void setMemberpw(int memberpw) {
		this.memberpw = memberpw;
	}
	public int getMembername() {
		return membername;
	}
	public void setMembername(int membername) {
		this.membername = membername;
	}
	
	
}
