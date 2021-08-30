package com.bridgelabz.line;

public class CompareLine {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computaion program");
		int p1x1=0,p1y1=0,p1x2=0,p1y2=0,p2x1=0,p2x2=0,p2y1=0,p2y2=0;
		p1x1 = (int) Math.floor(Math.random()*100);
		p1y1 = (int) Math.floor(Math.random()*100);
		p1x2 = (int) Math.floor(Math.random()*100);
		p1y2 = (int) Math.floor(Math.random()*100);
		p2x1 = (int) Math.floor(Math.random()*100);
		p2y1 = (int) Math.floor(Math.random()*100);
		p2x2 = (int) Math.floor(Math.random()*100);
		p2y2 = (int) Math.floor(Math.random()*100);
		Double len1 =  Math.sqrt(Math.pow(p1x2-p1x1,2)+Math.pow(p1y2-p1y1,2));
		Double len2 =  Math.sqrt(Math.pow(p2x2-p2x1,2)+Math.pow(p2y2-p2y1,2));
		System.out.println("the end points of 1st line are (x1,y1):("+p1x1+","+p1y1+")  (x2,y2):("+p1x2+","+p1y2+")");
		System.out.println("the length is : "+ len1);
		System.out.println("the end points of 2nd line are (x1,y1):("+p2x1+","+p2y1+")  (x2,y2):("+p2x2+","+p2y2+")");
		System.out.println("the length is : "+ len2);
		System.out.println("Are they equal in length : "+len1.equals(len2));
		
	}

}
