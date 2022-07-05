package com.awteventex;
import java.awt.*;
import java.awt.event.*;

import com.awteventex.WindowEventEx03.WinEventEx;
public class WindowEventEx04 extends Frame{
	public WindowEventEx04() {
		super("WinEvent4");
		addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		
		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowEventEx04();
	}
}
