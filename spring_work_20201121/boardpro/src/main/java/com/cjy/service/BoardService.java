package com.cjy.service;

import java.util.List;

import com.cjy.domain.Board;

public interface BoardService {
	public void register(Board board) throws Exception;
	public List<Board> list() throws Exception;
	public Board read(int bno)throws Exception;
	public void modify(Board board) throws Exception;
	public void remove(int bno) throws Exception;

}
