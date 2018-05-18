package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/view") // 위치
	public String view() {
		
		return "view"; // 돌려주는 값 위치 이름과 같이
	}
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model) {
		
		model.addAttribute("id", "abcde"); // 파라미터 model 로 받아서 값을 넣을 수 있음
		
		return "content/contentView";
	}
	
	@RequestMapping("modelAndView/modelView") 
	public ModelAndView modelAndView() {
		
		ModelAndView mv = new ModelAndView(); // 데이터(model) 와 뷰가 같이 있는 객체 직접 생성
		mv.addObject("id", "abcde"); // 데이터 속성
		mv.setViewName("/modelAndView/modelView"); // 뷰 이름
		
		return mv;
	}
	

}
