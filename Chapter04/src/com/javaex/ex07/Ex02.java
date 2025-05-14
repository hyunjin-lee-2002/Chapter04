package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		//번호 계속 생성
		//번호가 6개 되면 끝 -->Set 의 갯수가 6개면 끝
		
		//로또 번호 프로그램 작성
		//Set
		
		Set<Integer> iSet= new HashSet<Integer>();
		
		while(true) {
	
			if(iSet.size() == 6) { //iSet에 숫자가 6개면 끝
				break;
			}
			
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);   //중복이면 안들어간다
			System.out.println(no);
		}
		
		System.out.println("------------------------------");
		//출력
		for( int no : iSet) {
			System.out.println(no);
		}

	}

}