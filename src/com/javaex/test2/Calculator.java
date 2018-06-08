package com.javaex.test2;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { //synchronized가 없을 시 둘 다 user2값이 나옴
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
	}
}
