package com.gym.oracleGym.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gym.oracleGym.entity.Questions;
import com.gym.oracleGym.model.QuestionModel;


public interface QuestionsService  extends JpaRepository<Questions, String> {
	
	public QuestionModel getQuestion(String clave_exam, int number_question);

}
