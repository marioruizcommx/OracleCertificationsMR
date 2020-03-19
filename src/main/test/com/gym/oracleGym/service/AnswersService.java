package com.gym.oracleGym.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gym.oracleGym.entity.Answers;
import com.gym.oracleGym.model.AnswersModel;
import com.gym.oracleGym.model.QuestionModel;

public interface AnswersService extends JpaRepository<Answers, String> {

	public AnswersModel getAnswer(String clave_exam, int number_question);

}
