package com.javaex.ex06;

public class Triangle {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 메소드gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드일반
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}