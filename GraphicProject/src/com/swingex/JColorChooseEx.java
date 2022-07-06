package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;

public class JColorChooseEx extends JFrame implements ActionListener {

	JMenuBar mb = new JMenuBar();
	JMenu mnuselect = new JMenu("선택");
	JMenuItem mnucolor = new JMenuItem("색상");
	JLabel l = new JLabel("출력창");
	JTextArea ta = new JTextArea();
	
	public JColorChooseEx() {
		
		super("JColorChooser Test");
		mnuselect.add(mnucolor);
		mb.add(mnuselect);
		setJMenuBar(mb);
		
		add("North", l);
		add("Center", ta);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 400, 300); // x축, y축, 가로, 세로
		setVisible(true);
		
		mnucolor.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mnucolor) {
			JColorChooser chooser = new JColorChooser();
			Color col = chooser.showDialog(this, "색상을 고르세요.", Color.blue);
			l.setText("선택한 색상은 " + col);
			ta.setBackground(col);
		}
		
	}
	public static void main(String[] args) {
		new JColorChooseEx();
	}
}
