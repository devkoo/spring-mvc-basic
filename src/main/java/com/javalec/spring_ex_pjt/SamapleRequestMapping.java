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
	
	
	// ��, ��û��� => Ŭ������ RM �� �� + �޼ҵ� RM �� ��
	// /board/view 
}
