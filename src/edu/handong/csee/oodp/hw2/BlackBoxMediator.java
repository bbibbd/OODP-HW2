package edu.handong.csee.oodp.hw2;

public class BlackBoxMediator extends Mediator {
	

	@Override
	public void mediate(int count) {
		// TODO Auto-generated method stub
		for(AutonomousCar threads: autoCar) {
			threads.handleData();
			
		}
		
	}

}
