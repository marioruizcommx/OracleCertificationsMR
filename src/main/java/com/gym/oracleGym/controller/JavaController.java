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
import com.gym.oracleGym.model.JavaModel;
import com.gym.oracleGym.service.JavaService;



@Controller
public class JavaController {
	
private static final Log LOG = LogFactory.getLog(JavaController.class);
public String numQue;
	
	@Autowired
	@Qualifier("JavaServiceImpl")
	private JavaService javaService;
	
	
	@GetMapping("/java")
	public ModelAndView showTest(Model model) {

		List<Integer> numbers = new ArrayList<>(40);
		for (int i=1;i<=3;i++){
		   numbers.add(i);
		}

		Random random = new Random();
		int randomIndex = random.nextInt(numbers.size());
		/*while (numbers.size()>1){
		   

		   System.out.println("Not Repeated Random Number "+numbers.get(randomIndex));

		   
		}*/

		 System.out.println("Not Repeated Random Number "+numbers.get(randomIndex));
		 
		numQue = String.valueOf(numbers.get(randomIndex));
		ModelAndView mav = new ModelAndView(ViewConstant.JAVA_FORM);
		javaService.setQuestionNow(Integer.valueOf(numQue));
		mav.addObject("question", javaService.getQuestion(numQue));
		numbers.remove(randomIndex);
		return mav;
		
		//registrar error o sucess
		//validar el tamaño de la hasmap y devolver score o la misma pantalla
		
		
		
   /*ArrayList<String> outPut = javaService.getQuestion("3");
   System.out.print("SAlida del controllador '''''''''''''''''''''''''''''''''"+outPut);
   //outPut.clear();
   ArrayList<String> resp = new ArrayList<String>();
   resp.add("C");
   resp.add("E");
   boolean answer = javaService.verifyAnswer(8, resp);
   System.out.print("La respuesta es  '''''''''''''''''''''''''''''''''"+answer);
   */
   
   
		//return ViewConstant.JAVA_FORM;
	}
	
	@PostMapping("/java")
	public String workAnswer(@ModelAttribute(name="answersU") AnswersModel answersModel,
			 Model model) {

		LOG.info("Metodo: que viene de respuestas: " + answersModel.toString());
		ArrayList<String> ansU = new ArrayList<String>();
		ansU.add(String.valueOf(Integer.valueOf(numQue)));
		
		if ("1".equals(String.valueOf(answersModel.getOptionA()) )) {
			ansU.add("A");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionB()) )) {
			ansU.add("B");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionC()) )) {
			ansU.add("C");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionD()) )) {
			ansU.add("D");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionE()) )) {
			ansU.add("E");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionF()) )) {
			ansU.add("F");
		}

				
		Boolean resultQuestion = javaService.verifyAnswer(Integer.valueOf(numQue), ansU);
		System.out.print("La respuesta es:" +resultQuestion);
		return "redirect:/java";

		
		//1-mandar la pregunta a la vista 
		//2-cachar la respuesta
		//3-.validar la respuesta
		//registrar error o sucess
		//validar el tamaño de la hasmap y devolver score o la misma pantalla
		
		
		
   /*ArrayList<String> outPut = javaService.getQuestion("3");
   System.out.print("SAlida del controllador '''''''''''''''''''''''''''''''''"+outPut);
   //outPut.clear();
   ArrayList<String> resp = new ArrayList<String>();
   resp.add("C");
   resp.add("E");
   boolean answer = javaService.verifyAnswer(8, resp);
   System.out.print("La respuesta es  '''''''''''''''''''''''''''''''''"+answer);
   */
   
   
		//return ViewConstant.JAVA_FORM;
	}
}
