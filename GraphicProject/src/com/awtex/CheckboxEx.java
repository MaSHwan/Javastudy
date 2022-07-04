package com.awtex;

import java.awt.*;

public class CheckboxEx extends Frame {

	private Label lb = new Label("좋아하는 과일");
	private Button bt = new Button("확인");
	private Checkbox[] cb = { new Checkbox("바나나"), new Checkbox("사과"), new Checkbox("파인애플"), new Checkbox("딸기", true)

	};

	public CheckboxEx() {

		super("Checkbox");
		setLayout(new GridLayout(6, 1));
		add(lb);
		for(int i = 0; i < 4; i++) {
			add(cb[i]);
		}
		
		add(bt);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckboxEx();

	}

}
