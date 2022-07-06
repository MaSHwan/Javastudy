package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JComboboxEx extends JFrame {
	public JComboboxEx() {
		super("JCombobox Test");
		setLayout(new FlowLayout());
		
		String[]citems = {"One", "Two", "Three", "Four", "Five"};
		
		JComboBox<String> combo = new JComboBox<String>(citems);
		add(combo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 100); // x축, y축, 가로, 세로
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComboboxEx();
	}
}
