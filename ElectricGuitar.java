package com.Ritesh.tools;

public class ElectricGuitar extends StringedInstrument{
	
	public ElectricGuitar (){
		this.name="Guitar";
		this.numberofstring=8;
	}
	
	
	public void Play() {
		System.out.println("Name of Instruent is "+this.name);
		System.out.println("Number of strings "+this.numberofstring);
	} 
	
	
     
}