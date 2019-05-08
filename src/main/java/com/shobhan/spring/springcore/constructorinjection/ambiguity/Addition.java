package com.shobhan.spring.springcore.constructorinjection.ambiguity;

public class Addition {
//	Addition(int a, int b){
//	 System.out.println("Inside constructor INT");
// }
//
//	Addition(double a, double b){
//	 System.out.println("Inside constructor DBL");
// }
//	Addition(String a, String b){
//		 System.out.println("Inside constructor String");
//	 }
	
	Addition(int a, double b){
	 System.out.println("Inside constructor");
}	
}
