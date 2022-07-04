package com.awtex;

import java.awt.*;

public class ChoiceEx extends Frame {
	
	private Label la = new Label("생일");
	private Button bt = new Button("확인");
	private Choice ch = new Choice();
	private Choice ch2 = new Choice();
	
	public ChoiceEx() {

		super("Choice");
		setLayout(new GridLayout(3,1));
		add(la);
		
		for(int i = 1; i <= 12; i++) {
			ch.add(String.valueOf(i) + "월");
		}
		for(int i = 1; i <= 31; i++) {
			ch2.add(String.valueOf(i) + "일");
		}
		
		add(ch);
		add(ch2);
		add(bt);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChoiceEx();
	}

}
