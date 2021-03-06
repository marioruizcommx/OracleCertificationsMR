package com.gym.oracleGym.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Consumer;

import com.gym.oracleGym.component.QuestionsConverter;
import com.gym.oracleGym.constant.ViewConstant;
import com.gym.oracleGym.entity.Questions;
import com.gym.oracleGym.model.AnswersModel;
import com.gym.oracleGym.model.ImgModel;
import com.gym.oracleGym.model.QuestionModel;
import com.gym.oracleGym.model.TestModel;
import com.gym.oracleGym.repository.QuestionsRepository;
import com.gym.oracleGym.service.QuestionsService;
import com.gym.oracleGym.service.TestService;

@Controller
public class TestController {

	private static final Log LOG = LogFactory.getLog(TestController.class);
	public String numQue="1";

	@Autowired
	@Qualifier("TestServiceImpl")
	private TestService testService;

	
	@GetMapping("/test")
	public ModelAndView showTest(@RequestParam(name = "typeTest", required= false) boolean typeTest, 
			                     @RequestParam(name = "resetTest", required= false) boolean resetTest, Model model) {

		numQue = String.valueOf(testService.getTier());
		int porcentaje = (Integer.valueOf(numQue)* 100)/77;
		boolean typeTestLocal; 
		



		ModelAndView mav = new ModelAndView(ViewConstant.JAVA_FORM);
		ArrayList<String> unAnswers = new ArrayList<String>();
		HashMap<String, String> imagen = new HashMap<String, String>();
		HashMap<String, Boolean> globalVar = new HashMap<String, Boolean>();
		
		if(resetTest==true) {
			testService.resetTest();
		}
		
        if(typeTest==false) {
        	
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	
		}else {
			
			unAnswers = testService.getValidAnswers(numQue);
		}
        globalVar.put("variable", typeTest);
        
        if(testService.getImage(numQue)==true) {
        	imagen.put("imagen", "");
        }else {
        	
        	imagen.put("imagen", numQue + ".jpg");
        }
        
		
		imagen.put("valuenow", String.valueOf(porcentaje));
		testService.setQuestionNow(Integer.valueOf(numQue));
		testService.setImage(numQue);
		mav.addObject("review", imagen);
		mav.addObject("question", testService.getQuestion(numQue));
		//mav.addObject("question", que);
		mav.addObject("response", unAnswers);
		mav.addObject("global", globalVar);
		testService.setTier(Integer.valueOf(numQue));
		System.out.println("+++++++++++++++++++++++++++++++ numque " + numQue);
		
		
			return mav;
	
	}


	@PostMapping("/test")
	public String workAnswer(@RequestParam(name = "typeTest", required= false) boolean typeTest, @ModelAttribute(name = "answersU") AnswersModel answersModel, Model model) {

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

		Boolean resultQuestion = testService.verifyAnswer(Integer.valueOf(numQue), ansU);
		System.out.println("La respuesta es:" + resultQuestion);
		System.out.println("respuestas buenas:" + testService.getSuccess());
		System.out.println("respuestas malas:" + testService.getFails());
		
		if(numQue.equals("77") ) {
			
	        return "redirect:/score";
		}
		
		return "redirect:/test?typeTest="+typeTest;

	}
	
	
}
