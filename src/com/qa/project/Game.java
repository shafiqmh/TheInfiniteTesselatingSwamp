package com.qa.project;

import java.util.Random;
import java.util.Scanner;

//This runs but doesn't make use of classes
//Aiming to do so but may not manage

public class Game {
	public static void main(String[] args) {
		
		System.out.println("You are stuck in a grey swamp and have no idea where to go. You can only move North, East, "
				+ "\nSouth or West. You are wearing something on your wrist that looks a bit like a watch but it doesnt have "
				+ "\nany hands. The strap of the watch has written on it: This magic compass will give you a distance of how "
				+ "\nfar you are from a mystical chest. Reach this mystical chest and be teleported away from this gloomy "
				+ "\nswamp or fail to do so and stay lost here for ever.\n");
		
		
		//establishing size of grid
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the width of your grid? (max 1000)");
		int x_length = sc.nextInt();
		System.out.println("What is the length of your grid? (max 1000)");
		int y_length = sc.nextInt();
		
		
		
		//Generating random coords for person and chest
		double x_chest = (int) (Math.random()*1000)%x_length;
		//System.out.println("Chest x: " + x_chest);
		double y_chest = (int) (Math.random()*1000)%y_length;
		//System.out.println("Chest y: " + y_chest);
		double x_person = (int) (Math.random()*1000)%x_length;
		//System.out.println("Person x: " + x_person);
		double y_person = (int) (Math.random()*1000)%y_length;
		//System.out.println("Person y: " + y_person);
		
		
		//Distance person is away from chest
		double distToChest = Math.sqrt(((x_chest-x_person)*(x_chest-x_person)) + ((y_chest-y_person)*(y_chest-y_person)));
		System.out.println("Dist to Chest: "+distToChest);
		
		
		//Possible movements
		//double N=1; double E=1; double S=-1; double W=-1;
		//double newDistToChest = distToChest;
		while (distToChest>0.0) {
		System.out.println("Which direction to you wish to move in? (input N/E/S/W)");
		String movement = sc.next();
		
		if (movement.equals("N")) {
			y_person+=1;
		}
		else if (movement.equals("E")) {
			x_person+=1;
		}
		else if (movement.equals("S")) {
			y_person-=1;
		}
		else if(movement.equals("W")) {
			x_person-=1;
		}
		else {System.out.println("Move not valid, try again!");
		}
		x_person=x_person%x_length;
		y_person=y_person%y_length;
		
		distToChest = Math.sqrt(((x_chest-x_person)*(x_chest-x_person)) + ((y_chest-y_person)*(y_chest-y_person)));
		System.out.println("Dist to Chest: "+distToChest +"\n");
		//System.out.println(y_person);
		}
		
		System.out.println("Well done! You have escaped The Infinite Tesselating Swamp");
		
		
		
	}
}
