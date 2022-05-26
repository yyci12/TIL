package com.multi.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.multi.dto.MDBoardDto;
import static common.JDBCTemplate.*;
public class MDBoardDao {
	
	//게시판 목록
	
	public List<MDBoardDto> selectAll(){
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs =null;
		List <MDBoardDto> res = new ArrayList<MDBoardDto>();
		
		String sql = "SELECT * FROM MDBOARD ORDER BY SEQ DESC";
		
		try {
			stmt = con.createStatement();
			System.out.println("03.query 준비:"+sql);
			
			rs = stmt.executeQuery(sql);
			System.out.println("04.query 실행 및 리턴");
			
			while(rs.next()) {
				MDBoardDto tmp = new MDBoardDto();
				tmp.setSeq(rs.getInt(1));
				tmp.setWirter(rs.getString(2));
				tmp.setTitle(rs.getString(3));
				tmp.setContent(rs.getString(4));
				tmp.setRegdate(rs.getDate(5));
				
				res.add(tmp);
			}
		}catch (Exception e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			close(con,stmt,rs);
			System.out.println("05.db종료\n");
		}
		return res;
	}
	
	//글선택
	
	public MDBoardDto selectOne(int seq) {
		Connection con = getConnection();
		PreparedStatement pstm =null;
		ResultSet rs = null;
		MDBoardDto res = new MDBoardDto();
		
		String sql = "SELECT * FROM MDBOARD WHERE SEQ=?";
		try {
			pstm= con.prepareStatement(sql);
			pstm.setInt(1, seq);
			System.out.println("03.query 준비 : "+sql);
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			
			while (rs.next()) {
				res.setSeq(rs.getInt(1));
				res.setWirter(rs.getString(2));
				res.setTitle(rs.getString(3));
				res.setContent(rs.getString(4));
				res.setRegdate(rs.getDate(5));
			}
		} catch (SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05.db 종료\n");
		}
		
		return res;
	}
	
	//글작성
	
	public int insert(MDBoardDto dto) {
		return 0;
	}
	
	//글수정
	public int update(MDBoardDto dto) {
		return 0;
	}
	
	//글삭제
	public int delete(int seq) {
		return 0;
	}
	
	public int multiDelete(String[] seq) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res =0;
		int [] cnt = null;
		String sql =" DELETE FROM MDBOARD WHERE SEQ=?";
		
		try {
			pstm = con.prepareStatement(sql);
			for(int i=0; i<seq.length;i++) {
				pstm.setString(1, seq[i]);
				pstm.addBatch();
				System.out.println("03.query 준비:"+sql+"[삭제할번호:"+seq[i]+"]");
			}
			cnt = pstm.executeBatch();
			System.out.println("04.query 실행 및 리턴");
			for(int i=0; i<cnt.length;i++) {
				if(cnt[i] == 1) {
					res++;
				}
			}
			if(seq.length == res) {
				commit(con);
			}else {
				rollback(con);
			}
		}catch (Exception e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
			System.out.println("05.db종료");
		}
		return res;
	}
}
