package com.empex;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

	private JTabbedPane tp;
	private AddPane ap;
	
	
	public MainFrame() {
		tp = new JTabbedPane();
		ap = new AddPane();
		
		tp.addTab("사원정보 입력", ap);
		
		getContentPane().add(tp);
		setTitle("사원관리 프로그램");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setSize(600,600);
		
	}

}
