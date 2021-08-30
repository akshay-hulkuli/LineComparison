package com.bridgelabz.line;

public class Line {
	private Point point1;
	private Point point2;
	
	public void setPoint1(int x1Coordinate, int y1Coordinate) {
		point1 = new Point(x1Coordinate,y1Coordinate);
	}
	public void setPoint2(int x2Coordinate, int y2Coordinate) {
		point2 = new Point(x2Coordinate,y2Coordinate);
	}
	public Point getPoint1() {
		return point1;
	}
	public Point getPoint2() {
		return point2;
	}
	
}
