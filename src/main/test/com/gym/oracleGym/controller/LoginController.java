package com.gym.oracleGym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gym.oracleGym.constant.ViewConstant;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public ModelAndView getLogin() {
		ModelAndView mav = new ModelAndView(ViewConstant.LOGIN);
		return mav;
		
	}
	

}
