package com.bridgelabz.line;

import java.util.Scanner;

public class CompareLine {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Line Comparison Computaion program");
			int x1,x2,y1,y2,m1,m2,n1,n2;
			Line line1 = new Line();
			System.out.println("Enter coodinates of First point, in the order: x1,y1,x2,y2");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			line1.setPoint1(x1, y1);
			line1.setPoint2(x2, y2);
			
			Line line2 = new Line();
			System.out.println("Enter coodinates of Second point, in the order: m1,n1,m2,n2");
			m1 = sc.nextInt();
			n1 = sc.nextInt();
			m2= sc.nextInt();
			n2 = sc.nextInt();
			line2.setPoint1(m1, n1);
			line2.setPoint2(m2, n2);
			
			sc.close();
			
			LineComparatorImpl lineComparator = new LineComparatorImpl();
			
			lineComparator.compareUsingEquals(line1, line2);
			lineComparator.compareUsingCompareTo(line1, line2);
			
		
	}

}
