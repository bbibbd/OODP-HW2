package edu.handong.csee.oodp.hw2;

public class RandomEvents {
	
	int changedSpeed=0;	
	int randomEventEvoker;
	
	public int setRandomEvent() {
		
		randomEventEvoker = (int)(Math.random()*6);
		
		switch(randomEventEvoker) {
		
			case 0: speedChange();	return 0;
			case 1:	avoidPedestrain();	return 1;
			case 2: avoidAnimal();	return 2;
			case 3: changedToRedLight();	return 3;
			case 4:	temperatureChange();	return 4;
			case 5: notInCenterLane();	return 5;
		
		}
		
		return -1;
		

	}
	
	public boolean speedChange() {
		
		

		
		return true;
	}
	
	
	public void avoidPedestrain() {
		
		System.out.println("pediestrain !!! slow down. slow donw...");
		
	}
	
	public void avoidAnimal() {
		System.out.println("aminal !!! slow down. slow donw...");
		
	}
	
	public void changedToRedLight() {
		System.out.println("redlight sensored");
		
	}
	
	public void temperatureChange() {
		System.out.println("temeerature changed.");
		
	}
	
	public void notInCenterLane() {
		System.out.println("out of lane...");
		
	}
}
