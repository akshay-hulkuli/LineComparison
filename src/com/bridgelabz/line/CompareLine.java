package com.bridgelabz.line;

public class CompareLine {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computaion program");
		int x1=0,y1=0,x2=0,y2=0;
		x1 = (int) Math.floor(Math.random()*100);
		y1 = (int) Math.floor(Math.random()*100);
		x2 = (int) Math.floor(Math.random()*100);
		y2 = (int) Math.floor(Math.random()*100);
		double len =  Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("the points are (x1,y1):("+x1+","+y1+")  (x2,y2):("+x2+","+y2+")");
		System.out.println("the length is : "+ len);
	}

}
