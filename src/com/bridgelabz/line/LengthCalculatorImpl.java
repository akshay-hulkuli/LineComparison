package com.bridgelabz.line;

public class LengthCalculatorImpl implements LengthCalculatorIF {
	
	@Override
	public double lengthCalculator(Line line) {
		double length;
		Point point1 = line.getPoint1();
		Point point2 = line.getPoint2();
		length = Math.sqrt(Math.pow(2, (point2.getX()-point1.getX()) )  +  ( Math.pow(2, ( point2.getY()-point1.getY() ) ) ) );
		return length;
	}	
}
