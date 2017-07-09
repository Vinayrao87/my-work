package com.actitime;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String, Integer> qsp=new HashMap<String,Integer>();
		qsp.put("marker",123);
		qsp.put("duster",4);
		System.out.println(qsp);
		
		qsp.put("duster",5);
		System.out.println(qsp);
		
		
		boolean v1=qsp.containsKey("duster");
		System.out.println("Is 'duster' key present=>>"+v1);
		
		boolean v2=qsp.containsKey("bottle");
		System.out.println("Is 'bottle' key present=>>"+v2);
		
		Integer v=qsp.get("marker");
		System.out.println(v);
		
		for(String key:qsp.keySet()){
			System.out.println(key);
		
		Integer v3=qsp.get(key);
		
		System.out.println(v3);
		}
		
	}

}

