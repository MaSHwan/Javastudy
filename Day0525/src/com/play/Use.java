package com.play;

public class Use {
	public static void main(String[] args) {

		Instrument[] in = new Instrument[2];
		in[0] = new Piano();
		in[1] = new Flute();
//		Instrument[] in = {new Piano(), new Flute()};
		for(int i = 0; i < in.length; i++) {
			in[i].play();
			in[i].volumeup();
			in[i].volumedown();
			
		}

	}
}
