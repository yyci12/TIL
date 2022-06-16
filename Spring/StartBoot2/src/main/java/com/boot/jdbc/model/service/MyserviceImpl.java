package com.boot.jdbc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jdbc.model.dto.MyDto;
import com.boot.jdbc.model.mapper.MyBoardMapper;

@Service
public class MyserviceImpl implements MyService{
	
	@Autowired
	private MyBoardMapper myBoardMapper;
	
	@Override
	public List<MyDto> selectList() {
		
		return myBoardMapper.selectList();
	}

	@Override
	public MyDto selectOne(int myno) {
		// TODO Auto-generated method stub
		System.out.println(myno);
		return myBoardMapper.selectOne(myno);
	}

	@Override
	public int insert(MyDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MyDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
