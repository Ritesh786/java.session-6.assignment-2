package com.Ritesh.tools;

public class ElectricBassGuitar extends StringedInstrument{
	public ElectricBassGuitar (){
		this.name="Bass Guitar";
		this.numberofstring=10;
	}
	public void Play() {
		System.out.println("Name of Instruent is "+this.name);
		System.out.println("Number of strings "+this.numberofstring);
	} 
	
}
