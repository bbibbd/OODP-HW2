package edu.handong.csee.oodp.hw2;

public class TemperatureControl  implements Runnable {
	int currentTemp;
	
	public TemperatureControl(int currentTemp) {
		this.currentTemp = currentTemp;
	}

	public void run() {
		int currentTemp = this.currentTemp;
		try {
			for(int i=0; i<15; i++) {
				
				Thread.sleep(78);
				System.out.println("Thread for Air Conditioner Control, currnet Temperature: "+ currentTemp);
				if(currentTemp <23)
					System.out.println("Turn on heater to increase temperature");
				else if(currentTemp>26)
					System.out.println("Turn on Air Conditioner to decrease temperature");
				else
					System.out.println("Temperature OK");
				currentTemp -= (int)(Math.random()*(4+4)-4);;
				}
			}catch (InterruptedException e) {

			}
	}
}
