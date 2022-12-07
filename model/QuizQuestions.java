package com.nissan.model;

public class QuizQuestions {
	private String question;
	private String correctAnswer;
	private String yourAnswer;
	private int mark;
	
	public QuizQuestions() {
		
	}

	public QuizQuestions(String question,String correctAnswer,String yourAnswer, int mark) {
		
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.yourAnswer = yourAnswer;
		this.mark = mark;
		System.out.println(question+" "+correctAnswer+" "+yourAnswer);
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}


	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}


	public String getYourAnswer() {
		return yourAnswer;
	}


	public void setYourAnswer(String yourAnswer) {
		this.yourAnswer = yourAnswer;
	}
	
	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return this.question+" "+this.correctAnswer+ " " +this.yourAnswer +" "+this.mark +"\n";
	}
	
	

}
