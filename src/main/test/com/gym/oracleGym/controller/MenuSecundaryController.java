package com.gym.oracleGym.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gym.oracleGym.constant.ViewConstant;

@Controller
public class MenuSecundaryController {
	

	
	@GetMapping("/menu-secundary")
	public ModelAndView scoreFinal() {
		ModelAndView mav = new ModelAndView(ViewConstant.MENU_SECUNDARY);
		return mav;
		
	}

}
