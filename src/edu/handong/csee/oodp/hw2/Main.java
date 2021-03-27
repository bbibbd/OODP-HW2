package edu.handong.csee.oodp.hw2;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		int currentSpeed = (int)(Math.random()*(100-60)+60);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Car Speed between 60 and 100: ");
		int speedSet = keyboard.nextInt();
		keyboard.close();
		
		Runnable brake = new Brake(speedSet);
		Runnable temp = new TemperatureControl();
		Runnable speedControl = new Speed(currentSpeed, speedSet);

		Thread brakeThread = new Thread(brake);
		Thread tempThread = new Thread(temp);
		Thread speedThread = new Thread(speedControl);
		
		speedThread.start();
		brakeThread.start();
		tempThread.start();
	}


}
