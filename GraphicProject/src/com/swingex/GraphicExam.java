package com.swingex;

import java.awt.*;
import javax.swing.*;

public class GraphicExam {

	public static void main(String[] args) {
		
		
		
		JFrame jf = new JFrame("���� �׷��� ���α׷�");

		jf.setPreferredSize(new Dimension(400, 350));
		jf.setLocation(500, 200);
		
		Container contentPane = jf.getContentPane();
		DrawingPanel drawingPanel = new DrawingPanel();
		
		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		
		JButton button = new JButton("�׷��� �׸���");
		
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text1);
		
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text2);
		
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text3);
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));
		
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}

}
