package com.cjy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjy.domain.Board;
import com.cjy.service.BoardService;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) throws Exception{
		log.info("list func()");
		model.addAttribute("list", boardService.list());
		return "/board/list";
	}
	
	@GetMapping("/read")
	public String read(@RequestParam("bno") int bno, Model model)throws Exception {
		model.addAttribute("board", boardService.read(bno));
		return "/board/read";
	}
	
	@GetMapping("/register")
	public void registerForm() {
		
	}
}
