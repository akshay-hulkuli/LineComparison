package com.bridgelabz.line;

public class Point {

	private int xCoordinate;
	private int yCoordinate;
	
	public Point (int x , int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	public int getX() {
		return xCoordinate;
	}
	
	public int getY() {
		return yCoordinate;
	}
	
	public void setX(int x) {
		xCoordinate = x;
	}
	
	public void setY(int y) {
		yCoordinate = y;
	}

}
