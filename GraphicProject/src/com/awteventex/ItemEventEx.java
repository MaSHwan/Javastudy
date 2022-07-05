package com.awteventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ItemEventEx extends Frame implements ActionListener, ItemListener {

	private Label lb = new Label("������ : ",Label.RIGHT);
	private Label lb1 = new Label("������� : ",Label.RIGHT);
	private Label lb2 = new Label("���� : ",Label.RIGHT);
	
	private TextField bType = new TextField();
	private Choice blood = new Choice();
	private TextField birth = new TextField();
	
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	
	private TextField area = new TextField();
	
	private List li = new List(3, false);
	private Button end = new Button("������");
	
	public ItemEventEx() {
		
		super("ItemEvent Test");
		
		setForm();
		
		li.addActionListener(this);
		end.addActionListener(this);
		blood.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}
	
	private void setForm() {
		setLayout(new GridLayout(2,1));
		Panel p = new Panel(new BorderLayout());
		Panel p1 = new Panel(new GridLayout(3,1));
		p1.add(lb);
		p1.add(lb1);
		p1.add(lb2);
		p.add("West", p1);
		
		Panel p2 = new Panel(new GridLayout(3,1));
		p2.add(bType);
		p2.add(birth);
		p2.add(area);
		p.add("Center", p2);
		
		Panel p3 = new Panel(new GridLayout(4,1));
		p3.add(blood);
		p3.add(year);
		p3.add(month);
		p3.add(day);
		
		blood.add("A��");
		blood.add("B��");
		blood.add("AB��");
		blood.add("O��");
		
		for(int i = 1970; i <= 2022; i++) {
			year.add(i + "��");
		}
		for(int i = 1; i <= 12; i++) {
			month.add(i + "��");
		}
		for(int i = 1; i <= 31; i++) {
			day.add(i + "��");
		}
		p.add("East", p3);
		add(p);
		
		Panel p4 = new Panel(new BorderLayout());
		p4.add("Center", li);
		
		li.add("����");
		li.add("��⵵");
		li.add("��õ������");
		li.add("������");
		li.add("��걤����");
		li.add("�뱸������");
		li.add("�λ걤����");
		li.add("��û����");
		li.add("��û�ϵ�");
		li.add("����������");
		li.add("��󳲵�");
		li.add("���ϵ�");
		li.add("���󳲵�");
		li.add("����ϵ�");
		li.add("���ֱ�����");
		li.add("���ֵ�");
		
		p4.add("East", end);
		add(p4);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == blood) {
			String imsi = blood.getSelectedItem();
			bType.setText(imsi);
		}else if(e.getSource() == day) {
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2 = day.getSelectedItem();
			birth.setText(imsi + imsi1 + imsi2);
		}else if(e.getSource() == li) {
			String imsi = li.getSelectedItem();
			area.setText(imsi);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == li) {
			int i = li.getSelectedIndex();
			li.remove(i);
		}else if(e.getSource() == end) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new ItemEventEx();
	}

}
