package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class SamapleRequestMapping {
	
	@RequestMapping("/view")
	public String view() {
		return "/board/view";
	}
	
	
	// 즉, 요청경로 => 클래스의 RM 의 값 + 메소드 RM 의 값
	// /board/view 
}
