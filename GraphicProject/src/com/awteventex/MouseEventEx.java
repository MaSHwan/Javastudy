package com.awteventex;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.awtex.WinEvent;
import java.awt.*;
public class MouseEventEx extends Frame implements MouseListener {

	private Button bt = new Button("Ȯ??");
	private Button bt1 = new Button("????");
	
	public MouseEventEx() {
		
		super("Mouse Test");
		
		setLayout(new FlowLayout());
		
		add(bt);
		add(bt1);
		
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == bt) {
			System.out.println("Ȯ?? ??ư ????????Ÿ");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == bt1) {
			System.out.println("???? ??ư ????????Ÿ");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == bt1) {
			System.out.println("???? ??ư ?????? ?ö? ?????ȵ???");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {// ????
		if(e.getSource() == bt||e.getSource() == bt1) {
			System.out.println("???콺?? ??ư ???? ?Ƹ?????");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == bt||e.getSource() == bt1) {
			System.out.println("???콺?? ??ư???? ?????Ե???");
		}
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}
}
