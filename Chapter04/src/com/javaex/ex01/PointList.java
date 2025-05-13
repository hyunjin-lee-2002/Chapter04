package com.javaex.ex01;

public class PointList {
	
	//필드
	private Point[] pArray;   //상상 추가하면 늘어나면 삭제하면 줄어든다 
    private int crtPos;       //현재위치 -->화살표

	//생성자
	public PointList() {
		pArray = new Point[3];  //상상 추가하면 늘어나면 삭제하면 줄어든다 
		crtPos=0;
	}
	
	//메소드gs
	
	//메소드일반
	public void add(Point p) {
		this.pArray[crtPos] = p;
		this.crtPos++;
	}
	
	public Point get(int i) {
		return pArray[i];
	}
	
	
	public int size() {
		return crtPos;
	}
	
	
}