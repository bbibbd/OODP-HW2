package edu.handong.csee.oodp.hw2;

public class Speed implements Runnable {
	int currentSpeed, setSpeed;
	
	public Speed(int currnntSpeed, int setSpeed) {
		this.currentSpeed = currnntSpeed;
		this.setSpeed = setSpeed;
		
	}
	
	

	public void run() {
		
		System.out.println("Speed Control at work");
		System.out.println("Speed set to "+setSpeed);
		System.out.println("Thread for Speed Control, current speed: "+currentSpeed);
		
		if(currentSpeed < setSpeed) 
			System.out.println("pick up speed...");
		else if(currentSpeed == setSpeed)
			System.out.println("Do not have to adjust the speed");
		else
			System.out.println("Push brake to slow down...");
		

	}
	
}
