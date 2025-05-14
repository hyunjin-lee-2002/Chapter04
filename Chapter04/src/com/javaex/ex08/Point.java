package com.javaex.ex08;

import java.util.Objects;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)   //진짜 주소가 같은경우 
			return true;
		if (obj == null)   //비교할 상대가 없는경우
			return false;
		if (getClass() != obj.getClass())  //다른 종족을 비교할 경우
			return false;
		
		Point p = (Point)obj;   //진짜 비교해야 할 경우
		return this.x == p.x && this.y == p.y;
	}

	/*
	@Override
	public boolean equals(Object obj) {
		
		Point p = (Point)obj;
		if(this.x == p.x && this.y == p.y) {
			return true;
		
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int code = this.x * this.y;
		return code;
	}
	*/
	
	
}