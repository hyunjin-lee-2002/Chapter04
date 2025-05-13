package com.javaex.ex02;

public class MyList {
	
	//필드
	private Object[] oArray;   //상상 추가하면 늘어나고 삭제하면 줄어든다 
    private int crtPos;       //현재위치 -->화살표

	//생성자
	public MyList() {
		oArray = new Object[3];  //상상 추가하면 늘어나고 삭제하면 줄어든다 
		crtPos=0;
	}
	
	//메소드gs
	
	//메소드일반
	public void add(Object p) {
		this.oArray[crtPos] = p;  //업캐스팅 자동-섞어쓰기
		this.crtPos++;
	}
	
	public Object get(int i) {
		return oArray[i];
	}
	
	
	public int size() {
		return crtPos;
	}
	
	
}