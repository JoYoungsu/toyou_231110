package com.example.demo.mainController;

import java.util.List;

import org.springframework.aot.generate.ValueCodeGeneratorDelegates.MapDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mainService.MainService;
import com.example.demo.mainVo.MainVO;


@Controller
public class MainController {

	@Autowired
	MainService svc;
	
	MainVO vo;
	
	@RequestMapping(value = "/index")
	public String hello(Model model) {
	
		
		List<MainVO> list;
		try {
			list = svc.getUser(vo);
			model.addAttribute("users",list);
			
//			for(int i=0; i<list.size(); i++) {
//				System.out.println(list.get(i).getId());
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}



}