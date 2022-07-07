package com.swingex;
import java.awt.*;
import javax.swing.*;
public class WindowEx02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("������ ��� ���α׷�");
		
		jf.setPreferredSize(new Dimension(300, 150));
		jf.setLocation(500, 400);
		
		Container contentPane = jf.getContentPane();
		
		String colNames[] = {"�̸�", "����", "����"};
		Object data[][] = {
				{"ȫ�浿", 24, "����"},
				{"����ȯ", 25, "����"},
				{"������", 30, "����"}
		};
		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button, BorderLayout.SOUTH);
		
		button.addActionListener(new PrintActionListener(table));
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	
	
}
