package edu.handong.csee.oodp.hw2;

public class Brake implements Runnable {
	
	int currentSpeed;

	public Brake(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public int setRandomEvent() {
		int randomEventEvoker = (int)(Math.random()*3);
		
		if (randomEventEvoker == 0) {
			System.out.println("Event Generated -- Red Traffic Light Sensored");
		}
		
		else if(randomEventEvoker == 1) {
			System.out.println("Event Generated -- Animal Appeared");
		}
		else  {
			System.out.println("Event Generated -- Pedestrain Appeared");
		}
		return randomEventEvoker;
	}
	
	public void handleEvents(int randomEvent) {
		
		System.out.println("Thread for speed control, current speed: "+currentSpeed);
		
		if(randomEvent == 0) {
			System.out.println("Slowing down speed to stop at red light");
			System.out.println("Current Decreased Speed iin Front of Red Light: "+10);
			System.out.println("Now the car made a complete stop");
			System.out.println("Now Green Light Turned on");
			System.out.println("Current Increased Speed on Green Traffic Light: "+31);
		}
		
		else if(randomEvent == 1) {
			System.out.println("Animal Crossing Sensed: slow down...!");
			System.out.println("Current Decreased Speed in Front of Animal: "+21);
			System.out.println("Road Cleared of Animal: Increase Speed");
			System.out.println("Current Increased Speed after Passing an Animal: "+22);
		}
		else {
			System.out.println("Pedestrain Crossing Sensed: slow down to stop!");
			System.out.println("Current Decreased Speed in Front of Pedestrain: "+21);
			System.out.println("Road Cleared of Animal: Increase Speed");
			System.out.println("Current Increased Speed after Passing a Pedestrain in Safe Area: "+22);
		}
	}
	public void run() {
		
		try {
			for(int i=0; i<15; i++) {
				handleEvents(setRandomEvent());	
				Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			
		}
		
		
	}


}
