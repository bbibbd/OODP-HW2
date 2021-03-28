package edu.handong.csee.oodp.hw2;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	protected List <AutonomousCar> autoCar;
	
	public Mediator() {
		autoCar = new ArrayList<>();
	}
	
	public void addColleague(AutonomousCar autoC) {
		autoCar.add(autoC);
		
	}
	
	void mediate(String data) {
		
		for(AutonomousCar autoc: autoCar) {
			autoc.handleData();
			
		}
		
	}
	
}
