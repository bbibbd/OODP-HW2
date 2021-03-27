package edu.handong.csee.oodp.hw2;

public class TemperatureControl  implements Runnable {

	int currentTemperature = (int)(Math.random()*(30-20)+20);

	public void run() {

		try {
			for(int i=0; i<15; i++) {
				System.out.println("Thread for Air Conditioner Control, currnet Temperature: "+ currentTemperature);
				if(currentTemperature <23)
					System.out.println("Turn on heater to increase temperature");
				else if(currentTemperature>26)
					System.out.println("Turn on Air Conditioner to decrease temperature");
				else
					System.out.println("Temperature OK");	
				
				Thread.sleep(100);
				}
			}catch (InterruptedException e) {

			}
	}
}
