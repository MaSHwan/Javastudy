package com.play;

public class Flute extends Instrument{
public static void main(String[] args) {
	Flute f = new Flute();
	f.play();
	f.volumeup();
	f.volumedown();
}
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute : play() ȣ���");
	}

	@Override
	void volumeup() {
		// TODO Auto-generated method stub
		System.out.println("Flute : volume up() ȣ���");
	}

	@Override
	void volumedown() {
		// TODO Auto-generated method stub
		System.out.println("Flute : volume down() ȣ���");
	}

}
