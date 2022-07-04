package com.awtex;

import java.awt.*;

public class ListEx extends Frame {
	
	private Label lb = new Label("인원 목록");
	private List ls = new List(4, true);
	private Button bt = new Button("확인");
	private String[] name;
	
	
	public ListEx(String a[]) {
		
		super("List test");
//		name = a;
		setLayout(new BorderLayout());
		
		for(int i = 0; i < a.length; i++) {
			ls.add(a[i]);
		}
		
		add("North", lb);
		add("Center", ls);
		add("South", bt);
		ls.setFont(new Font("굴림체", Font.BOLD, 30));
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
//		setSize(300, 200);
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ListEx(args);
	}

}
