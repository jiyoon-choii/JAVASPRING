package com.cjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjy.domain.BoardVO;

import lombok.extern.java.Log; 

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
	
	//@RequestMapping(value="/register" , method=RequestMethod.GET)
	@GetMapping("/registerForm")
	public String registerForm() {
		return "/board/register";
	}
	// 있는 이름과 보내주는 이름 다를 때 
	
	@PostMapping("/register")
	public String register(@ModelAttribute("board") BoardVO boardVO) {
		log.info("board"+boardVO);
		return "board/read";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam("id") String id, String pw, Model model) {
		//@RequestParam : 꼭 입력해야 할 항목 
		log.info("id="+id);
		log.info("pw="+pw);
		model.addAttribute("id", id);
		model.addAttribute("pw",pw);
		
		return "board/result";
	}
	
	/*
	public String register(HttpServletRequest request, Model model) {
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String writer=request.getParameter("writer");
		model.addAttribute("board", new BoardVO(1,title,content,writer));
		return "/board/read";
	}
	*/
	
	@GetMapping("/read")
	public void read(Model model) {
		BoardVO vo=new BoardVO(1, "스프링게시판","스프링게시판 작성","홍길동");
		System.out.println(vo);
		model.addAttribute("board", vo);
		log.info("board: "+vo);
		
	}
}
