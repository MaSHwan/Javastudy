package com.awtex;
import java.awt.*;
import java.awt.event.*;
public class FrameEx01 {

	public static void main(String[] args) {
		// ������ ��ü ����
		Frame frame = new Frame();
		WinEvent we = new WinEvent();
		frame.addWindowListener(we);
		frame.setSize(9000000, 6000000);
		frame.setVisible(true); // ȭ�鿡 ǥ������ ���� 
	}

}
