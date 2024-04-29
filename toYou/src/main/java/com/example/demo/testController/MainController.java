package com.example.demo.testController;

import org.springframework.aot.generate.ValueCodeGeneratorDelegates.MapDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String hello() {
		return "main";
	}



}