package com.clothes.driver;

import com.clothes.beans.Dress;
import com.clothes.beans.Pants;

public class Driver {

	public static void main(String[] args) {
		
		Dress d= new Dress();
		d.setLength("midi");
		d.setColor("Pink");
		d.setSize(10);
		
		System.out.println(d);
		
		Pants p= new Pants();
		
		p.setLeg("boot cut");
		p.setSize(7);
		p.setColor("Pink");
		
		System.out.println(p);

	}

}
