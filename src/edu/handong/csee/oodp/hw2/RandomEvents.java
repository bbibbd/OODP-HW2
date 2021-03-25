package edu.handong.csee.oodp.hw2;

public class RandomEvents {
	
	int changedSpeed=0;	
	int randomEventEvoker;
	
	public int setRandomEvent() {
		
		randomEventEvoker = (int)(Math.random()*5);
		
		switch(randomEventEvoker) {
		
			case 0: gettingCloser();	return 0;
			case 1:	avoidPedestrain();	return 1;
			case 2: avoidAnimal();	return 2;
			case 3: changedToRedLight();	return 3;
			case 4:	notInCenterLane();	return 4;
		
		}
		
		return -1;
		

	}
	
	public void gettingCloser() {
		
		System.out.println("Event Generated -- Getiing Closer from the Front Car");

		
	}
	
	
	public void avoidPedestrain() {
		
		System.out.println("Event Generated -- Pedestrian");
		
	}
	
	public void avoidAnimal() {
		System.out.println("Event Generated -- Animal");
		
	}
	
	public void changedToRedLight() {
		System.out.println("Event Generated -- Red Traffic Light");
		
	}
	

	public void notInCenterLane() {
		System.out.println("out of lane...");
		
	}
}
