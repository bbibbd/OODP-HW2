package edu.handong.csee.oodp.hw2;

public class Main {

	public static void main(String[] args) {

		
		RandomEvents randomEvent = new RandomEvents();
		
		Runnable adc = new AdaptiveCruiseControl();
		Thread adcThread = new Thread(adc);
		
	
		int event = randomEvent.setRandomEvent();
		
		if(event == 0) {
			adcThread.run();
		}
		
	
	}

}
