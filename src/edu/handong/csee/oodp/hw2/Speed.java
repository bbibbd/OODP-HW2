package edu.handong.csee.oodp.hw2;

public class Speed implements Runnable {
	int setSpeed;
	int currentSpeed = (int)(Math.random()*(100-60)+60);
	public Speed(int setSpeed) {
		this.setSpeed = setSpeed;

	}


	public void run() {

		int currentSpeed = this.currentSpeed;
		System.out.println("Speed Control at work");
		System.out.println("Speed set to "+setSpeed);

		for(int i=0 ; i<15; i++) {

			System.out.println("Thread for Speed Control, current speed: "+currentSpeed);

			if(currentSpeed < setSpeed) 
				System.out.println("pick up speed...");
			else if(currentSpeed == setSpeed)
				System.out.println("Do not have to adjust the speed");
			else
				System.out.println("Push brake to slow down...");
			currentSpeed +=(int)(Math.random()*(11+11)-11);
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
