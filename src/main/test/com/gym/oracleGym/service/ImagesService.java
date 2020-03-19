package com.gym.oracleGym.service;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gym.oracleGym.entity.Images;
import com.gym.oracleGym.model.ImagesModel;
import com.gym.oracleGym.model.QuestionModel;

public interface ImagesService  extends JpaRepository<Images, String>{
	
	public ImagesModel getImage(String clave_exam, int question_number);

}
