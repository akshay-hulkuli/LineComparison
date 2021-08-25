package com.bridgelabz.line;

public class CompareLine {
	
	private static int p1x1=0,p1y1=0,p1x2=0,p1y2=0,p2x1=0,p2x2=0,p2y1=0,p2y2=0;
	
	private static void generatePoints() {
		p1x1 = (int) Math.floor(Math.random()*100);
		p1y1 = (int) Math.floor(Math.random()*100);
		p1x2 = (int) Math.floor(Math.random()*100);
		p1y2 = (int) Math.floor(Math.random()*100);
		p2x1 = (int) Math.floor(Math.random()*100);
		p2y1 = (int) Math.floor(Math.random()*100);
		p2x2 = (int) Math.floor(Math.random()*100);
		p2y2 = (int) Math.floor(Math.random()*100);
	}
	
	private static void compareLines(Double length1, Double length2) {
		
		System.out.println("the end points of 1st line are (x1,y1):("+p1x1+","+p1y1+")  (x2,y2):("+p1x2+","+p1y2+")");
		System.out.println("the length is : "+ length1);
		System.out.println("the end points of 2nd line are (x1,y1):("+p2x1+","+p2y1+")  (x2,y2):("+p2x2+","+p2y2+")");
		System.out.println("the length is : "+ length2);
		System.out.println("Are 2 lines equals : "+length1.equals(length2));
		int i = length1.compareTo(length2);
		if(i == 0) System.out.println("the lines are equal");
		else if(i<0) System.out.println("the 2nd line is greater than the 1st one in length");
		else System.out.println("the 1st line is greater than the 2nd line in length");
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computaion program");
		
		generatePoints();
		
		//calculate lengths 
		Double length1 =  Math.sqrt(Math.pow(p1x2-p1x1,2)+Math.pow(p1y2-p1y1,2));
		Double length2 =  Math.sqrt(Math.pow(p2x2-p2x1,2)+Math.pow(p2y2-p2y1,2));
		
		//compare them based on lenghts
		compareLines(length1,length2);
		
		
	}

}
