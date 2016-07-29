package org.srinivas.javaconceptsimplementation;

public class GreetingThreadTester {

	public static void main(String[] args) {
		GreetingThread gt=new GreetingThread("Good Morning!!");
		GreetingThread gt1=new GreetingThread("Good Night!!");
		Thread t1=new Thread(gt);
		Thread t2=new Thread(gt1);
		t1.start();
		t2.start();
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.interrupt();
		System.out.println("Interrup() invoked");
	}

}
