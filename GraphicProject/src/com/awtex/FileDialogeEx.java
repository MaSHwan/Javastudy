package com.awtex;

import java.awt.*;

public class FileDialogeEx extends Frame {
	
	FileDialog fd = new FileDialog(this, "≥ª≤® ¿˙¿Â", FileDialog.SAVE);
	
	public FileDialogeEx() {
		WinEvent we = new WinEvent();
		addWindowListener(we);
//		pack();
		setSize(300, 200);
		setVisible(true);
		fd.setVisible(true);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
	}

	public static void main(String[] args) {
		new FileDialogeEx();
	}
}
