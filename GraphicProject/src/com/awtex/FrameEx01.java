package com.awtex;
import java.awt.*;
import java.awt.event.*;
public class FrameEx01 {

	public static void main(String[] args) {
		// 프레임 객체 생성
		Frame frame = new Frame();
		WinEvent we = new WinEvent();
		frame.addWindowListener(we);
		frame.setSize(9000000, 6000000);
		frame.setVisible(true); // 화면에 표시할지 말지 
	}

}
