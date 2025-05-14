package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		//HashMap 준비 => 키(보통 스트링), 벨류를 2가지 결정해줘야 함
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		//포인트
		Point p01 = new Point (2,6);
		Point p02 = new Point (2,5);
		Point p03 = new Point (2,2);
		
		//Map에 포인트 주소 넣기  --> 키를 중복되지 않게 정해줌
		pMap.put("카리나", p01);
		pMap.put("윈터", p02);
		pMap.put("장원영", p03);
//		pMap.add("카리나", p01);		키 값에 String 넣었으니 스트링으로 써야함
//		pMap.add("윈터", p02);		map은 add아니고 !put!
//		pMap.add("장원영", p03);
		
		//출력
		System.out.println(pMap.size());
		
		//toString()
		System.out.println("==========");
		System.out.println(pMap.toString());
		
		System.out.println("====karina====");
		System.out.println(pMap.get("카리나").toString());

		System.out.println("====winter====");
		System.out.println(pMap.get("윈터").toString());
		
		System.out.println("=======remove=========");
		pMap.remove("장원영");  //장원영 삭제
		System.out.println(pMap.toString());
		
		
		System.out.println("==========");
		Point p04 = new Point(100,100);
		pMap.put("닝닝", p04);	//닝닝 포인트 추가
		System.out.println(pMap.toString());
		
		
		System.out.println("==========");
		//같은 키 값을 사용했을 때
		Point p05 = new Point(200,200);
		pMap.put("지젤", p05); //지젤 포인트 추가
		//같은 거 넣으니까 카리나 2,6이었던게 마지막에 넣은 카리나 200, 200으로 출력됨
		System.out.println(pMap.toString());
		
		System.out.println("===========================");
		
		//print all
		
		//1. 키 세트 받기
		Set<String> keys = pMap.keySet();
		
		for(String name : keys) {
			System.out.println(pMap.get(name).toString());
		}
		
		System.out.println("==========");
		
		Map<String, String> boardMap = new HashMap<String, String> ();
		
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("date", "may / 14 / 2025");
		boardMap.put("id", "katarina");
		boardMap.put("content", "게시판 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		System.out.println(boardMap.get("date"));
		
   }
	
	
}
