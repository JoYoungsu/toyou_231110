package com.toyou.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value="/") //컨트롤할 url path
	public String Main() { 
		return "index";	// View, 파일 이름 문자열로 리턴
	}
}
