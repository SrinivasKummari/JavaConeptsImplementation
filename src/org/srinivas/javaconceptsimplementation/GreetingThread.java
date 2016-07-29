package org.srinivas.javaconceptsimplementation;
import java.util.Date;

public class GreetingThread implements Runnable{

	private String greetings;
	private static final int timeDelay=1000;
	private static final int repetetions=100;
	public GreetingThread(String greetings) {
		this.greetings=greetings;
	}
	@Override
	public void run() {
		for(int i=0;i<repetetions;i++){
			System.out.println(new Date()+" "+greetings);
			try {
				Thread.sleep(timeDelay);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		}
		
	}

}
