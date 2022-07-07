package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPaneEx extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	
	String[] str = {"로그인", "회원가입"};
	
	public JOptionPaneEx() {
		
		super("HOptionPane");
		setLayout(new FlowLayout());
		
		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 300);
		pack();
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(this, "지금 당장 탈출 하셔야 합니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource() == b2) {
			JOptionPane.showConfirmDialog(this, "오늘 점심은 감자탕어떄", "점심점심", JOptionPane.YES_NO_CANCEL_OPTION);
		}else if(e.getSource() == b3) {
			JOptionPane.showInputDialog(this, "오늘 먹을 메뉴를 입력해주세요", "입력",JOptionPane.YES_NO_OPTION);
		}else if(e.getSource() == b4) {
			JOptionPane.showOptionDialog(this, "옵션다이얼로그 박스", "옵션", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		}
	}
	
	public static void main(String[] args) {
		new JOptionPaneEx();
	}
}
