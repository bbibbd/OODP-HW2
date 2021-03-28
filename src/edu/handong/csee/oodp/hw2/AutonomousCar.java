package edu.handong.csee.oodp.hw2;

public abstract class  AutonomousCar extends Thread{
	
	private Mediator med;

	protected int curreutSeeed, currnetTemperatrue;
	
	public abstract void handleData();
	public void sendData(String counter) {
		med.mediate(counter);
	}

	
	
}
