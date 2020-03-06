package com.gym.oracleGym.model;

public class AnswersModel {
	
	public int optionA;
	public int optionB;
	public int optionC;
	public int optionD;
	public int optionE;
	public int optionF;
	public int optionG;
	
	
	
	public int getOptionG() {
		return optionG;
	}
	public void setOptionG(int optionG) {
		this.optionG = optionG;
	}
	public int getOptionA() {
		return optionA;
	}
	public void setOptionA(int optionA) {
		this.optionA = optionA;
	}
	public int getOptionB() {
		return optionB;
	}
	public void setOptionB(int optionB) {
		this.optionB = optionB;
	}
	public int getOptionC() {
		return optionC;
	}
	public void setOptionC(int optionC) {
		this.optionC = optionC;
	}
	public int getOptionD() {
		return optionD;
	}
	public void setOptionD(int optionD) {
		this.optionD = optionD;
	}
	public int getOptionE() {
		return optionE;
	}
	public void setOptionE(int optionE) {
		this.optionE = optionE;
	}
	public int getOptionF() {
		return optionF;
	}
	public void setOptionF(int optionF) {
		this.optionF = optionF;
	}

	public AnswersModel(int optionA, int optionB, int optionC, int optionD, int optionE, int optionF, int optionG) {
		super();
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.optionF = optionF;
		this.optionG = optionG;
	}
	public AnswersModel() {}
	@Override
	public String toString() {
		return "AnswersModel [optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", optionD="
				+ optionD + ", optionE=" + optionE + ", optionF=" + optionF + ", optionG=" + optionG + "]";
	}

	
	
	
	
	
}
