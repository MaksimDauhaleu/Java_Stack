package com.codingdojo.calculator;

public class Calculator {
	private int operandOne;
	private int operandTwo;
	private String operation;
	private int finalSum;
	
	//Getters 
	public int getOne() {
		return this.operandOne;
	}
	public int getTwo() {
		return this.operandTwo;
	}
	public String getSign() {
		return this.operation;
	}
	
	
	
	//Setters
	public void setOne(int num) {
		this.operandOne = num;
	}
	public void setTwo(int num) {
		this.operandTwo = num;
	}
	public void setSing(String num) {
		this.operation = num;
	}
	
	public Calculator(int int1,String str1,int int2) {
		this.operandOne = int1;
		this.operandTwo = int2;
		this.operation = str1;
	}
	
	
	
	public void performOperation() {
		if(getSign() == "+") {
			this.finalSum = getOne() + getTwo();
		}
		if(getSign() == "-") {
			this.finalSum = getOne() - getTwo();
		}
		if(getSign() == "*") {
			this.finalSum = getOne() * getTwo();
		}
		if(getSign() == "/") {
			this.finalSum = getOne() / getTwo();
		}
		if(getSign() == "%") {
			this.finalSum = getOne() % getTwo();
		}
		System.out.println(finalSum);
	}
	
	
}
