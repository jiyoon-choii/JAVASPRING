package com.cjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cjy.domain.Member;
import com.cjy.domain.Student;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "home";
		
	}
	
	@GetMapping("/aaa")
	public void aaa(Model model) {
		model.addAttribute("name","홍길동");
		model.addAttribute("age",28);		
	}
	
	
	@GetMapping("/member")
	private String member(Model model) {
		Member member=new Member();
		member.setId("abcd");
		member.setPw("1234");
		member.setName("홍길동");
		model.addAttribute("member", member);
		System.out.println();
		return "member";
	}
	@GetMapping("/student")
	public void student(Model model) {
		/*
		Student student=new Student();
		student.setSno(1);
		student.setName("홍길동");
		student.setMajor("컴공");
		*/
		Student student=new Student(1, "홍길동","컴공");
		System.out.print(student);
		model.addAttribute("stud",student);
	}
}
