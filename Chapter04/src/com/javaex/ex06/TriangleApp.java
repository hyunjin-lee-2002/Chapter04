package com.javaex.ex06;

import java.util.ArrayList;
import java.util.List;

public class TriangleApp {
	
	public static void main(String[] args) {
		
		List<Triangle> tList = new ArrayList<Triangle>();
		//List<Triangle> tList = new LinkedList<Triangle>();
		
		Triangle t01 = new Triangle(3,3);
		Triangle t02 = new Triangle(4,4);
		Triangle t03 = new Triangle(5,5);
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		for(int i=0; i<tList.size(); i++) {
			//System.out.println(tList.get(i).toString());
			System.out.println(tList.get(i));
		}
		
		System.out.println("---------------------");
		System.out.println(tList.get(1).getWidth());
		System.out.println(tList.get(1).getHeight());
		System.out.println("---------------------");
		
		tList.remove(1);
		System.out.println(tList.toString());
		System.out.println(tList.size());
		
		System.out.println("=================================");
		// 3   6   9
		//List<Triangle> tList = new ArrayList<Triangle>();
		
		//제네릭을 쓰는곳에는 기본 자료형을 쓸수 없다 : 8개 
		//List<int> iList = new ArrayList<int>();   //X
		List<Integer> iList = new ArrayList<Integer>(); 
		
		/*
		Integer i01 = new Integer(3);
		iList.add(i01); 
		System.out.println(iList.get(0).toString());
		*/
		
		iList.add(3);  //자동 박싱 
		iList.add(6);  //자동 박싱
		iList.add(9);  //자동 박싱
		
		System.out.println(iList.toString());
		System.out.println("----------------------");
		
		for(int i=0; i<iList.size(); i++) {
			System.out.println(iList.get(i).toString());
		}
		
	}

}