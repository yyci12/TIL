package com.mvc.upgrade.model.dao;

import com.mvc.upgrade.model.dto.MemberDto;

public interface MemberDao {
	
	String NAMESPACE = "mymember.";
	
	public MemberDto login(MemberDto Dto);
	public int insert(MemberDto dto);
}
