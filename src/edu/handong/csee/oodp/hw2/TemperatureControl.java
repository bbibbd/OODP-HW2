package edu.handong.csee.oodp.hw2;

public class TemperatureControl  extends Thread{


	int currentTemp, countHeater=0, countAircon=0;
	private Mediator med;
	
	
	public TemperatureControl(int currentTemp, Mediator med) {
		this.currentTemp = currentTemp;
		this.med = med;
	}


	public void run() {
		int currentTemp = this.currentTemp;

		try {
			for(int i=0; i<15; i++) {

				Thread.sleep(78);
				System.out.println("Thread for Air Conditioner Control, currnet Temperature: "+ currentTemp);
				if(currentTemp <23) {
					System.out.println("Turn on heater to increase temperature");
					countHeater ++;
					currentTemp = this.currentTemp;
				}
				else if(currentTemp>26) {
					System.out.println("Turn on Air Conditioner to decrease temperature");
					countAircon ++;
					currentTemp = this.currentTemp;
				}
				else
					System.out.println("Temperature OK");
				currentTemp -= (int)(Math.random()*(4+4)-4);
				
			}

		}catch (InterruptedException e) {

		}

	}




}
