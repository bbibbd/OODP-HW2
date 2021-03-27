package edu.handong.csee.oodp.hw2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Car Speed between 60 and 100: ");
		
		int speedSet = keyboard.nextInt();
		int currentTemp = (int)(Math.random()*(26-23)+23);
		keyboard.close();
		
		Runnable brake = new Brake();
		Runnable temp = new TemperatureControl(currentTemp);
		Runnable speedControl = new Speed(speedSet);
		Runnable adc = new AdaptiveCruiseControl();
		
		Thread brakeThread = new Thread(brake);
		Thread tempThread = new Thread(temp);
		Thread speedThread = new Thread(speedControl);
		Thread cruisthread = new Thread(adc);
		
		speedThread.start();
		brakeThread.start();
		tempThread.start();
		cruisthread.start();

		
	}


}
