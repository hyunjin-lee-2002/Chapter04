package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//HashSet<Integer> iSet = new HashSet<Integer>();
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);
		
		iSet.add(i01);   //3
		iSet.add(6); //자동박싱
		iSet.add(9); //자동박싱
		
		iSet.add(9); //중복으로 안들어감
		
		System.out.println("--------------------------------");
		System.out.println(iSet.size());
		
		
		System.out.println("--------------------------------");
		//방번호(순서) 개념이 없다 ->일반적 for문을 사용할수없다
		for( Integer i : iSet ) { //향상된  for문
			System.out.println(i.toString());
		}
		
		
		
		
	}

}