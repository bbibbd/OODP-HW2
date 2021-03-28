package edu.handong.csee.oodp.hw2;

public class Brake extends AutonomousCar {
	
	private Mediator med;
	private int countRedLight=0, countAnimal=0, countPedstrain=0;
	
	public Brake(Mediator med) {
		this.med = med;
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
	
	public void handleEvents(int randomEvent, int decreasedSpeed, int increasedSpeed) {
		
		if(randomEvent == 0) {
			countRedLight ++;
			System.out.println("Slowing down speed to stop at red light");
			System.out.println("Current Decreased Speed in Front of Red Light: "+decreasedSpeed);
			System.out.println("Now the car made a complete stop");
			System.out.println("Now Green Light Turned on");
			System.out.println("Current Increased Speed on Green Traffic Light: "+increasedSpeed);
		}
		
		else if(randomEvent == 1) {
			countAnimal ++;
			System.out.println("Animal Crossing Sensed: slow down...!");
			System.out.println("Current Decreased Speed in Front of Animal: "+decreasedSpeed);
			System.out.println("Road Cleared of Animal: Increase Speed");
			System.out.println("Current Increased Speed after Passing an Animal: "+increasedSpeed);
		}
		else {
			
			countPedstrain ++;
			System.out.println("Pedestrain Crossing Sensed: slow down to stop!");
			System.out.println("Current Decreased Speed in Front of Pedestrain: "+decreasedSpeed);
			System.out.println("Road Cleared of Pedestrain: Increase Speed");
			System.out.println("Current Increased Speed after Passing a Pedestrain in Safe Area: "+increasedSpeed);
		}
	}
	
	public void run() {

			for(int i=0; i<15; i++) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int decreasedSpeed = (int)(Math.random()*(10)+10);
				handleEvents(setRandomEvent(),decreasedSpeed,decreasedSpeed+20);	
			}
	}
	@Override
	public void handleData() {
		
	}




}
