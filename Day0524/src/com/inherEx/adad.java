package com.inherEx;

import java.net.Socket;

class PointEx {
	private int x;
	private int y;

	public PointEx() {
	}

	public PointEx(int x) {
		this.x = x;
	}

	public PointEx(int x, int y) {
		this(x);
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}

class Circle extends PointEx {

	private int r = 4;

	public Circle() {
	
	}

	public Circle(int x) {
		super(x);
		r =1;
	}
	
	public Circle(int x, int y) {
		super(x,y);
		r = 2;
	}
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	
	

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	@Override
	public void disp() {
		
		super.disp();
		System.out.println("r : " + r);
	}
}
public class adad{

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.disp();
		c.setR(100);
		System.out.println(c.getR());
	}

}