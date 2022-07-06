package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowEx01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing Programming");
		frame.setPreferredSize(new Dimension(200, 70));
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JLabel label = new JLabel("Hello");
		JButton button = new JButton("»Æ¿Œ");
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		ActionListener listener = new ConfirmButtonActionListener(text, label);
		
		button.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
