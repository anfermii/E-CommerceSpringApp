package com.sierra;

import java.util.Iterator;

class ThreadOne extends Thread{
	@Override
	public void run() {
		System.out.println("thread one");
		
	}
}
class ThreadTwo implements Runnable{

	@Override
	public void run() {
		
		System.out.println("thread two");
	}
	
}
class ThreadThree extends Thread{
	@Override
	public void run() {
		System.out.println("thread three");
		
	}
}
public class MyThreadApp {

	public static void main(String[] args) {
		ThreadOne tone = new ThreadOne(); //1.
		tone.start(); //2. ready to run = runnable
		ThreadThree tthree = new ThreadThree();
		tthree.start();//2. ready to run = runnable
		Thread ttwo = new Thread(new ThreadTwo());// ThreadTwo is implementing runnable 
		ttwo.start();//2. ready to run
		 // 3. running
		//4. exit
		tone.setPriority(8);
		System.out.println(tone.getPriority());
		ttwo.setPriority(3);
		System.out.println(ttwo.getPriority());
		System.out.println(tthree.getPriority());
		System.out.println(tone.getPriority());

		System.out.println("tone pror"+tone.getPriority()); //5 // return the priority
		tone.setPriority(8);  //sets the priority ranging from 1 to 10. 10 is the max. 5 is the default
		ttwo.setPriority(3);
		System.out.println("ttwo pror"+ttwo.getPriority());  //3
		System.out.println("tthree pror"+tthree.getPriority()); //5
		System.out.println("tone pror"+tone.getPriority()); //8
		try {
			tone.join();
			ttwo.yield();
			tthree.sleep(0, 0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 for (int i = 0; i < 5; i++) {
	System.out.println(i);
	try {tone.join();
	ttwo.yield();
	
		
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
