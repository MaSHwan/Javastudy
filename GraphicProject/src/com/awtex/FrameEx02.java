package com.awtex;
import java.awt.*;
public class FrameEx02 extends Frame{
public FrameEx02() {
	// TODO Auto-generated constructor stub
	super("«¡∑π¿”");
	WinEvent we = new WinEvent();
	addWindowListener(we);
	setSize(300,200);
	setVisible(true);
	
}
	public static void main(String[] args) {
		new FrameEx02();
	
	}

}
