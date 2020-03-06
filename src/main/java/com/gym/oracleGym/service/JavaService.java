package com.gym.oracleGym.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.gym.oracleGym.model.JavaModel;

public interface JavaService {
	
	public ArrayList<String> getQuestion(String questionNumber);
	
	public void setFails(int questionNumber);
	
	public void setSuccess(int questionNumber);
	
	public void setQuestionNow(int questionNumber);
	
    public int getFails();
	
	public int getSuccess();
	
	public int getQuestionNow();
	
	public int calculateScore();
	
	public String getImage(String imagenNumber);
	
	public ArrayList<Integer> failQuestionList();
	
	public ArrayList<Integer> successQuestionList();
	
	public boolean verifyAnswer(int numQue, ArrayList<String> answersUser);
	
	public void setImage(String imgNumber);
	
	public int getTier();
	
	public void setTier(int tier);
	
	

}
