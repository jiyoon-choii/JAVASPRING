package com.cjy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cjy.domain.Board;

@Repository
public class BoardDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Board board) throws Exception{
		String sql="insert into board(title, content, writer) values(?,?,?)";
		jdbcTemplate.update(sql,board.getTitle(),board.getContent(),board.getWriter());
	}
	
	public List<Board> list() throws Exception {
		String sql="SELECT * FROM board WHERE bno > 0 ORDER BY bno desc";		
		List<Board> results = jdbcTemplate.query(sql, 
				new RowMapper<Board>() {
					@Override
					public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
						Board board = new Board();
						
						board.setBno(rs.getInt("bno"));
						board.setTitle(rs.getString("title"));
						board.setContent(rs.getString("content"));
						board.setWriter(rs.getString("writer"));
						board.setRegdate(rs.getDate("regdate"));
						return board;
					}
		});
		return results;
	}

	
	
	public Board read(int bno) throws Exception {
		String sql="SELECT * FROM board WHERE bno =?";		
		List<Board> results = jdbcTemplate.query(sql, 
				new RowMapper<Board>() {
					@Override
					public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
						Board board = new Board();
						
						board.setBno(rs.getInt("bno"));
						board.setTitle(rs.getString("title"));
						board.setContent(rs.getString("content"));
						board.setWriter(rs.getString("writer"));
						board.setRegdate(rs.getDate("regdate"));
						return board;
					}
		},bno);
		return results.isEmpty()? null:results.get(0);
	}
	
	public void update(Board board) throws Exception{
			String sql="update board set title=?, content=?, writer=? where bno=?";
			jdbcTemplate.update(sql, board.getTitle(), board.getContent(), board.getWriter(), board.getBno());
	}
	public void delete(int bno) throws Exception{
		String sql="delete from board where bno=?";
		jdbcTemplate.update(sql,bno);
	}
	
}
