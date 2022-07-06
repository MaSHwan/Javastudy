package com.awteventex;

import java.awt.event.*;

import com.awtex.*;

import java.awt.*;

public class KeyEventEx extends Frame implements KeyListener {

	Label la = new Label("주민번호", Label.RIGHT);
	Label la1 = new Label("-", Label.CENTER);

	TextField jumin1 = new TextField(10);
	TextField jumin2 = new TextField(10);

	Button ok = new Button("확인");

	public KeyEventEx() {

		super("KeyEvent Test");

		setForm();

		WinEvent we = new WinEvent();
		addWindowListener(we);
//		setSize(300, 120);
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
		pack();
		setVisible(true);
	}

	public void setForm() {
		setLayout(new BorderLayout());
		add("West", la);

		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(jumin1);
		p.add(la1);
		p.add(jumin2);
		add("Center", p);

		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(ok);
		add("South", p1);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == jumin1) {
			if(jumin1.getText().trim().length() == 6) {
				jumin2.requestFocus();
			}
		}
		if (e.getSource() == jumin2) {
			if(jumin2.getText().trim().length() == 7) {
				ok.requestFocus();
			}
		}
	}

	public static void main(String[] args) {
		new KeyEventEx();
	}
}
