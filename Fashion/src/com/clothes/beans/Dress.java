package com.clothes.beans;

public class Dress {

	private String length;
	private int size;
	private String color;

	
	public String getLength () {
		
		return length;
	}
	
	public void setLength(String length) {
		this.length=length;
		
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
	
	return "Dress [length=" + length + ", size =" + size +", color=" + color + "]";
}
	}

