package com.cjy.test002.controller;

import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {
	@GetMapping("/register")
	public void registerForm() {
		
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("m") Member m) {
		return "/member/read";
	}
	
	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("age",20);
		return "/member/view";
	}
	
	@GetMapping("param")
	public String requestParam(@RequestParam("id") String id, Model model) {
		model.addAttribute("id",id);
		return "/member/param";
		
	}
	
	@GetMapping("/path/{no}")
	public String path(@PathVariable("no") int no,Model model){
		model.addAttribute("no",no);
		return "/member/path";
	}
	
	
	
	
	
	
}
