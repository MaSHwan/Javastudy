package com.swingex;
import java.awt.*;
import javax.swing.*;
public class WindowEx02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("참가자 명단 프로그램");
		
		jf.setPreferredSize(new Dimension(300, 150));
		jf.setLocation(500, 400);
		
		Container contentPane = jf.getContentPane();
		
		String colNames[] = {"이름", "나이", "성별"};
		Object data[][] = {
				{"홍길동", 24, "남자"},
				{"마승환", 25, "남자"},
				{"한찬규", 30, "여자"}
		};
		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);
		
		button.addActionListener(new PrintActionListener(table));
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	
	
}
