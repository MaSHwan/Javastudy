package com.awteventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx02 extends Frame implements ActionListener{
	
	private Button bt = new Button("Á¾·á");
	
	public ActionEventEx02() {
		
		super("ActionEvent2");
		bt.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(bt);
		bt.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
