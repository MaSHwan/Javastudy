package com.awteventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx01 extends Frame implements ActionListener {
	
	private TextField tf = new TextField(10);
	
	public ActionEventEx01() {
		super("ActionEvent Test");
		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String imsi = tf.getText();
			System.out.println("메시지 : " + imsi);
			tf.setText(""); // textfield 초기화
		}
	}
	
	public static void main(String[] args) {
		new ActionEventEx01();
	}

}
