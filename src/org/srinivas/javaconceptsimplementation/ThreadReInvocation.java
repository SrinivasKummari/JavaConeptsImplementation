package org.srinivas.javaconceptsimplementation;

public class ThreadReInvocation implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadReInvocation tri=new ThreadReInvocation();
		Thread t=new Thread(tri);
		t.start();
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("value is: "+i);
		}
	}

}
