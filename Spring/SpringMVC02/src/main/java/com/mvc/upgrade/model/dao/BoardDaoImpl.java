package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		try {
			list= sqlSession.selectList("myboard.selectList");
		} catch (Exception e) {
			System.out.println("[error]:select list");
			e.printStackTrace();
		}
		System.out.println("listsize: "+ list.size());
		return list;
	}

	@Override
	public BoardDto selectOne(int myno) {
		BoardDto dto = null;
		
		try {
			dto = sqlSession.selectOne(NAMESPACE+"selectOne",myno);
		} catch (Exception e) {
			System.out.println("[error] : select one");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(BoardDto dto) {

		int res =0;
		
		try {
			res= sqlSession.insert(NAMESPACE+"insert",dto);
		} catch (Exception e) {
			System.out.println("[erro] : insert");
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int update(BoardDto dto) {

		return 0;
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
