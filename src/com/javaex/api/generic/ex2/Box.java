package com.javaex.api.generic.ex2;

//	Generic ÀÌ¿ë
public class Box<T> {//T = ÅÛÇÃ¸´
	T content;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}

}
