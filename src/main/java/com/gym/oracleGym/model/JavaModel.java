package com.gym.oracleGym.model;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaModel {
	
	public int score;
	public int success;
	public int fails;
	public int quetionNow;
	
	
	
	public int getQuetionNow() {
		return quetionNow;
	}
	public void setQuetionNow(int quetionNow) {
		this.quetionNow = quetionNow;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getSuccess() {
		return success;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public int getFails() {
		return fails;
	}
	public void setFails(int fails) {
		this.fails = fails;
	}
	

	public JavaModel(int score, int success, int fails, int quetionNow) {
		super();
		this.score = score;
		this.success = success;
		this.fails = fails;
		this.quetionNow = quetionNow;
	}
	public JavaModel() {}
	

	
	
	

}
