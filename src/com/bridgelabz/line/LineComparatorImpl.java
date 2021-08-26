package com.bridgelabz.line;

public class LineComparatorImpl implements LineComparatorIF {
	LengthCalculatorImpl calculator = new LengthCalculatorImpl(); 
	@Override
	public void compareUsingEquals(Line line1 , Line line2) {
		
		Double length1  = calculator.lengthCalculator(line1);
		Double length2  = calculator.lengthCalculator(line2);
		
		System.out.println("***** Comparing using equals()  method *****");
		System.out.println("Are two lines equal : "+ length1.equals(length2));
	}
	
	
	
	@Override
	public void compareUsingCompareTo(Line line1 , Line line2) {

		Double length1  = calculator.lengthCalculator(line1);
		Double length2  = calculator.lengthCalculator(line2);
		
		System.out.println("***** Comparing using compareTo() method *****");
		int result = length1.compareTo(length2);
		if(result == 0) System.out.println("Two lines are equal");
		else if(result < 0) System.out.println("line2 is greater then line1 ");
		else System.out.println("line1 is greater then line2 ");
	}
	
}
