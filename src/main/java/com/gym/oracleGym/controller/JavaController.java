package com.gym.oracleGym.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import com.gym.oracleGym.constant.ViewConstant;
import com.gym.oracleGym.model.AnswersModel;
import com.gym.oracleGym.model.ImgModel;
import com.gym.oracleGym.model.JavaModel;
import com.gym.oracleGym.service.JavaService;

@Controller
public class JavaController {

	private static final Log LOG = LogFactory.getLog(JavaController.class);
	public String numQue="1";

	@Autowired
	@Qualifier("JavaServiceImpl")
	private JavaService javaService;

	@GetMapping("/java")
	public ModelAndView showTest(Model model) {


		numQue = String.valueOf(javaService.getTier());
		
		

		ModelAndView mav = new ModelAndView(ViewConstant.JAVA_FORM);
		HashMap<String, String> imagen = new HashMap<String, String>();
		
		imagen.put("imagen", numQue + ".jpg");
		javaService.setQuestionNow(Integer.valueOf(numQue));
		javaService.setImage(numQue);
		mav.addObject("review", imagen);
		mav.addObject("question", javaService.getQuestion(numQue));

		javaService.setTier(Integer.valueOf(numQue));
		System.out.println("+++++++++++++++++++++++++++++++ numque " + numQue);
		
		
			return mav;
	
	}


	@PostMapping("/java")
	public String workAnswer(@ModelAttribute(name = "answersU") AnswersModel answersModel, Model model) {

		LOG.info("Metodo: que viene de respuestas: " + answersModel.toString());
		ArrayList<String> ansU = new ArrayList<String>();
		ansU.add(String.valueOf(Integer.valueOf(numQue)));

		if ("1".equals(String.valueOf(answersModel.getOptionA()))) {
			ansU.add("A");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionB()))) {
			ansU.add("B");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionC()))) {
			ansU.add("C");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionD()))) {
			ansU.add("D");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionE()))) {
			ansU.add("E");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionF()))) {
			ansU.add("F");
		}

		Boolean resultQuestion = javaService.verifyAnswer(Integer.valueOf(numQue), ansU);
		System.out.println("La respuesta es:" + resultQuestion);
		System.out.println("respuestas buenas:" + javaService.getSuccess());
		System.out.println("respuestas malas:" + javaService.getFails());
		
		if(numQue.equals("3") ) {
			
	        return "redirect:/score";
		}
		
		return "redirect:/java";
		


	}
	
	@GetMapping("/score")
	public ModelAndView scoreFinal() {
		ModelAndView mav = new ModelAndView(ViewConstant.SCORE_FINAL);
		HashMap<String, String> scoreFinal = new HashMap<String, String>();
		scoreFinal.put("score",String.valueOf( javaService.calculateScore()));
		mav.addObject("review", scoreFinal);
		return mav;
		
	}
}
