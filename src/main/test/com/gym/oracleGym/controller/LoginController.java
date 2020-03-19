package com.gym.oracleGym.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gym.oracleGym.constant.ViewConstant;


@Controller
public class LoginController {
	
private static final Log LOG = LogFactory.getLog(LoginController.class);	
	
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		LOG.info("Metodo: showLoginForm()--Params: error:" + error + ", Logout:" +logout );
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		LOG.info("Returning true to login view");
		return ViewConstant.LOGIN;
	}
	
	@GetMapping("/loginsuccess")
	public String loginCheck() {
		LOG.info("Metodo: showLoginForm()--Params: :" );
	    LOG.info("Returning true to contacts view" );
			return "redirect:/index";
		
		
		
	}
	

}
