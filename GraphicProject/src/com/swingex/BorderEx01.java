package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx01 extends JFrame {

	private JButton[] jb = new JButton[6];

	public BorderEx01() {

		super("Border Test");

		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));
		
		for(int i = 0; i < 6; i++) {
			jb[i] = new JButton(i+1 + "¹ø ¹öÆ°");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10,10,10,10);
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.red, 5);
		jb[1].setBorder(lb);
		
		EtchedBorder eeb = new EtchedBorder();
		jb[2].setBorder(eeb);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[4].setBorder(bb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.orange);
		jb[5].setBorder(mb);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderEx01();
	}

}
