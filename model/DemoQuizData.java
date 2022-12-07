package com.nissan.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DemoQuizData {
	
	
	public static void createPlayer(){
		Scanner sc= new Scanner(System.in);
		Player player= new Player();
		System.out.println("Enter Your Name: ");
		String name=sc.next();
		player.setName(name);
		HashMap< Player,String> hashMapPlayer= new HashMap< Player,String>();
		
		
		//getQuestions(player, getStatesCapitals());
		displayResult(getQuestions(player, getStatesCapitals()));
		
	}
	
	
	
	private static void displayResult(HashMap< String,Player> questions) {
		
		try{
			
		for (Entry< String,Player> entry : questions.entrySet()) {
			String key = entry.getKey();
			Player val = entry.getValue();
			System.out.println(key +
                    "- " + val);
		
		}
			
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Thank you for choosing");
                System.exit(0);
            }
	}



	public static HashMap< String,Player> getQuestions(Player player,HashMap<String, String> getStatesCapitals){
		int count=0;
		HashMap< String,Player> listOfQuestionsOfOnePlayer= new HashMap< String,Player>();
		ArrayList<String> listOfStates= new ArrayList<String>();
		listOfStates=getStatesList();
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			String tempStateName=listOfStates.get(i);
			//System.out.println(tempStateName);
			String tempQuestion=" What is the capital of "+tempStateName+" ?";
			System.out.println(tempQuestion);
			System.out.print("Enter your answer : ");
			String temp=sc.next();
			
			player.setQuestionArrayList(tempQuestion,findStatescapital(tempStateName,getStatesCapitals),temp,1);
			/*System.out.println(tempQuestion+" "+findStatescapital(tempStateName,getStatesCapitals)+" "+temp+" "+1);
			*/
			
			if(getStatesCapitals.get(listOfStates.get(i)).equalsIgnoreCase(temp)) {
				
				player.setTotalMark();
				
				//System.out.println( listOfQuestionsOfOnePlayer.size());
			}else {
				
				//System.out.println( listOfQuestionsOfOnePlayer.size());
			}
			listOfQuestionsOfOnePlayer.put( tempQuestion,player);
		}
		
		return listOfQuestionsOfOnePlayer;
	}
	
	public static ArrayList<String> getStatesList(){
		ArrayList<String> listOfStates= new ArrayList<String>();
		listOfStates.add("Maharashtra");
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Kerala");
		listOfStates.add("Goa");
		listOfStates.add("Assam");
		listOfStates.add("Andhra Pradesh");
		listOfStates.add("Arunachal Pradesh");
		listOfStates.add("Bihar");
		listOfStates.add("Chhattisgarh");
		listOfStates.add("Gujarat");
		listOfStates.add("Haryana");
		listOfStates.add("Himachal Pradesh");
		
		return listOfStates;
	}
		
	public static HashMap<String, String> getStatesCapitals(){
			
			HashMap<String, String> hashMap= new HashMap<String,String>();
			
			hashMap.put("Maharashtra", "Mumbai");
	        hashMap.put("Madhya Pradesh", "Bhopal");
	        hashMap.put("Kerala", "Thiruvnanthpuram");
	        hashMap.put("Goa", "Panaji");
	        hashMap.put("Assam", "Dispur");
	        hashMap.put("Andhra Pradesh", "Hyderabad");
	        hashMap.put("Arunachal Pradesh", "Itanagar");
	        hashMap.put("Bihar", "Patna");
	        hashMap.put("Chhattisgarh", "Raipur");
	        hashMap.put("Gujarat", "Gandhinagar");
	        hashMap.put("Haryana", "Chandigarh");
	        hashMap.put("Himachal Pradesh", "Shimla");
	        
	        return hashMap;
		}
	
	public static String findStatescapital(String stateName,HashMap<String, String> getStatesCapitals) {
		
		for (Map.Entry<String, String> entry : getStatesCapitals.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			if(key.equalsIgnoreCase(stateName)) {
				return val;
			}
			
		}
		return null;
	}
}
