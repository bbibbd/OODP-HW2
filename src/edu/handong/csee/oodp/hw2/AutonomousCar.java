package edu.handong.csee.oodp.hw2;

public abstract class  AutonomousCar extends Thread{
	

	protected int curreutSeeed, currnetTemperatrue;
	
	public abstract void handleData();
	public abstract void sendData(int counter);

	
	
}
