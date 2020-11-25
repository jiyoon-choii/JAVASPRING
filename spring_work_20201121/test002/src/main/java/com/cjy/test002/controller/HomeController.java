package com.cjy.test002.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cjy.test002.domain.Member;



@Controller
public class HomeController {
	@GetMapping("/home")
	public void home() {
}
	
	@GetMapping("/main")
	public void main() {		
	}
	
	@GetMapping("/page")
	public void page(Model model) {
		model.addAttribute("gender",2);
		List<Member> members=new ArrayList<Member>();
		members.add(new Member("a1","1111","홍길동",20));
		members.add(new Member("a2","1111","홍길수",20));
		members.add(new Member("a3","1111","홍길미",20));
		members.add(new Member("a4","1111","홍길자",20));
		model.addAttribute("members",members);
}
	
}
