package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/view") // ��ġ
	public String view() {
		
		return "view"; // �����ִ� �� ��ġ �̸��� ����
	}
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model) {
		
		model.addAttribute("id", "abcde"); // �Ķ���� model �� �޾Ƽ� ���� ���� �� ����
		
		return "content/contentView";
	}
	
	@RequestMapping("modelAndView/modelView") 
	public ModelAndView modelAndView() {
		
		ModelAndView mv = new ModelAndView(); // ������(model) �� �䰡 ���� �ִ� ��ü ���� ����
		mv.addObject("id", "abcde"); // ������ �Ӽ�
		mv.setViewName("/modelAndView/modelView"); // �� �̸�
		
		return mv;
	}
	

}
