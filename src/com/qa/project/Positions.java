package com.qa.project;

import java.util.Scanner;


//Aiming to have grid size and person and chest positions here
//Need to implement an if statement which makes sure that Chest
//and Person do not begin at same position

public class Positions {
	
	public void grid_size() {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is the width of your grid? (max 1000)");
	int x_length = sc.nextInt();
	System.out.println("What is the length of your grid? (max 1000)");
	int y_length = sc.nextInt();
	}
	
	public void coords() {
		double x_chest = (int) (Math.random()*1000)%x_length;
	System.out.println("Chest x: " + x_chest);
	}
		double y_chest = (int) (Math.random()*1000)%y_length;
	System.out.println("Chest y: " + y_chest);
	}
		double x_person = (int) (Math.random()*1000)%x_length;
	System.out.println("Person x: " + x_person);
	}
		double y_person = (int) (Math.random()*1000)%y_length;
		System.out.println("Person y: " + y_person);
	}
	
	//initialise start positions and grid size here
	

	
	/////	if (x_person == x_chest && y_person == y_chest);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Need to create a NEW game using game game = new game()
	// and creeate a new constants class is smae way
	
	
	
	
	
	
	
	
	
	
}
