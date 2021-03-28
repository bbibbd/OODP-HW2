package edu.handong.csee.oodp.hw2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Car Speed between 60 and 100: ");
		
		int speedSet = keyboard.nextInt();
		int currentTemp = (int)(Math.random()*(26-23)+23);
		keyboard.close();
		
		Mediator mb = new BlackBoxMediator();
		//Runnable temp = (AutonomousCar) new TemperatureControl(currentTemp, mb);
		//Thread brakeThread = new Brake();
		Thread tempThread = new TemperatureControl(currentTemp, mb);
		Thread speedThread = new Speed(speedSet);
		Thread cruisthread = new AdaptiveCruiseControl();
		
		//speedThread.start();
		//brakeThread.start();
		tempThread.start();
	
		


		
		//cruisthread.start();

		
	}


}
