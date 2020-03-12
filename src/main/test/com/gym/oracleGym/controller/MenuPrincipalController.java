package com.gym.oracleGym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gym.oracleGym.constant.ViewConstant;

@Controller
public class MenuPrincipalController {
	@GetMapping("/menu-principal")
	public ModelAndView getMenuPrincipal(){
		ModelAndView mav = new ModelAndView(ViewConstant.MENU_PRINCIPAL);

		return mav;
	}
	

}
