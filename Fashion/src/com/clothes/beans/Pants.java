package com.clothes.beans;

public class Pants {
	
	private String leg;
	private int size;
	private String color;
	
	public String getLeg () {
		
		return leg;
	}
	
	public void setLeg(String leg) {
		this.leg=leg;
		
	}
	
	public int getSize() {
		
		return size;
	}
	
public void setSize(int size) {
	
	this.size=size;
		
	}

	public String getColor() {
		
		return color;
	}
	
public void setColor(String color) {
		
	this.color=color;
		
	}

public String toString() {
	
	return "Pants[leg=" + leg + ", size =" + size +", color=" + color + "]";
}
}
