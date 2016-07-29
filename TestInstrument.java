package com.Ritesh.test;

import com.Ritesh.tools.ElectricBassGuitar;
import com.Ritesh.tools.ElectricGuitar;
import com.Ritesh.tools.StringedInstrument;

public class TestInstrument {

	public static void main(String[] args) {
		ElectricBassGuitar bt = new ElectricBassGuitar();
		 ElectricGuitar et = new  ElectricGuitar();
		 StringedInstrument st = new StringedInstrument();
		 st.Play();
		 et.Play();
		 bt.Play();
		
	}

}
