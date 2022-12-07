package com.nissan.app;

import java.util.Scanner;

import com.nissan.model.DemoQuizData;

public class QuizApp {

	public static void main(String[] args) {
		try {
			int choice;
			do {
				choice=menu();
				switch(choice) {
				case 0:
					System.out.println("Thank You. Exited Successfully.");
					break;
					
				case 1:
					DemoQuizData.createPlayer();
					break;
					
				default:
					System.out.println("Invalid choice, please try again..");
					continue;
				}
			}while(choice!=0);
			
		}catch(Exception e){
			System.out.println("Invalid choice "+e.getMessage());
		}

	}
	
	public static int menu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("0.Exit\n1.Start Quiz\n");
		System.out.println("Enter your choice :");
		int choice=sc.nextInt();
		return choice;
	}

}
