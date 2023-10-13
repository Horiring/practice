package kr.kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping(value="/member/login")
	public String memberLogin() {
		return "/member/login";
	}
	
}
