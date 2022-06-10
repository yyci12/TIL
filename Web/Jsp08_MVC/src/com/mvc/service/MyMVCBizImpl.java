package com.mvc.service;

import java.sql.Connection;
import java.util.List;

import com.mvc.dao.MyMVCDao;
import com.mvc.dao.MyMVCDaoImpl;
import com.mvc.dto.MyMVCDto;

import static common.JDBCTemplate.*;
public class MyMVCBizImpl implements MyMVCBiz{
	private MyMVCDao dao=new MyMVCDaoImpl();
	
	@Override
	public List<MyMVCDto> selectAll() {
	Connection con =getConnection();	
	
	List<MyMVCDto> res= dao.selectAll(con);
	
	close(con);
		return res;
	}

	@Override
	public MyMVCDto selectOne(int seq) {
		Connection con=getConnection();
		MyMVCDto res=dao.selectOne(con, seq);
		return res;
	}

	@Override
	public boolean insert(MyMVCDto dto) {
		Connection con=getConnection();
		boolean res=dao.insert(con, dto);
		
		if(res) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

	@Override
	public boolean update(MyMVCDto dto) {
		Connection con =getConnection();
		boolean res= dao.update(con, dto);
		
		if(res) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

	@Override
	public boolean delete(int seq) {
		Connection con=getConnection();
		boolean res=dao.delete(con, seq);
		
		if(res) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

}
