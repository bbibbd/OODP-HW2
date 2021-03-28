package edu.handong.csee.oodp.hw2;

public class AdaptiveCruiseControl extends Thread {


	public int setRandomEvent() {
		
		int randomEventEvoker = (int)(Math.random()*2);
		
		if (randomEventEvoker == 0) {
			System.out.println("Event Generated -- Distance Getting Closer from the Front Car");
		}
		
		else {
			System.out.println("Event Generated -- Not in Lane center");
		}
		
		return randomEventEvoker;
	}
	
	public void handleEvents(int randomEvent) {
		
		if(randomEvent == 0) {
			System.out.println("The speed of front car dropping fast: slow down to keep distance....");
			System.out.println("Current Decreased Speed for Distance from the Front Car: "+10);
			System.out.println("Current Increased Speed Following the Front Car Increasing Speed: "+31);
		}
		
		else {
			System.out.println("Not in Lane Center");
			System.out.println("Correcting Car Position ");
			System.out.println("Road Cleared of Animal: Increase Speed");
			System.out.println("Current Increased Speed after Passing an Animal: "+22);
		}

	}
	
	public void run() {
		
		for(int i=0; i<15; i++) {
			try {
				Thread.sleep(63);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			handleEvents(setRandomEvent());
			
		}
		
		
	}

}
