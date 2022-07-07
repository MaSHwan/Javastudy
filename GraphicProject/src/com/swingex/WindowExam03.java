package com.swingex;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;

public class WindowExam03 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("참가자 명단 프로그램");
		
		jf.setPreferredSize(new Dimension(400, 200));
		jf.setLocation(500, 400);
		
		Container contentPane = jf.getContentPane();
		
		String colNames[] = {"이름", "나이", "성별"};
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		panel.add(button1);
		panel.add(button2);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		
		button1.addActionListener(new AddActionListener(table, text1, text2, text3));
		button2.addActionListener(new RemoveActionListener(table));
		
		
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane, BorderLayout.CENTER);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	
	
}
