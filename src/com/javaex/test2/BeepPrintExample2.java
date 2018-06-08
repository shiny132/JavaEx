package com.javaex.test2;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		//위의 두 줄 대신 사용가능
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					System.out.println("beep");
					try {Thread.sleep(500);}catch (Exception e) {}
				}
			}
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);}
			catch (Exception e) {}
		}
	}

}
