package com.empex;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	public MainFrame() {
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();
		
		tp.addTab("사원정보 입력", ap);
		tp.addTab("사원정보 조회", fp);
		tp.addTab("전체사원정보 보기", tpa);
		
		
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
