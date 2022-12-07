package com.nissan.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
		private String name;
		private List<QuizQuestions> questionArrayList=new ArrayList<QuizQuestions>();
		private static int totalMark;
		
		
		public Player() {
			}
		static {
			totalMark=0;
		}

		public Player(String name  ) {
			
			this.name = name;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		
      
		public List<QuizQuestions> getQuestionArrayList() {
			return questionArrayList;
		}


		public void setQuestionArrayList(String inputQuestion,String correctAnswer,String yourAnswer,int mark) {
			
			QuizQuestions tempObjQuizQues=new QuizQuestions(inputQuestion,correctAnswer,yourAnswer,mark);
			this.questionArrayList.add(tempObjQuizQues);
			
		}


		public int getTotalMark() {
			return totalMark;
		}


		public void setTotalMark() {
			Player.totalMark = totalMark+1;
		}


		@Override
		public String toString() {
			return "Player [name=" + name + ",  Total Marks "+totalMark+""
							+questionArrayList.toString()+ "\n]";
		}


		
		
		
		
		
}
