package com.awtex;
import java.awt.*;
public class LableEx01 extends Frame{

	Label la1;
	Label la2;
	Label la3;
	Label la4;
	
	Font f1;
	Font f2;
	
	
	
	public LableEx01() {
		
		super("Label Test");
		// ��ü����
		la1 = new Label("�ȳ��ϼ���!");
		la2 = new Label("ȫ�浿 �Դϴ�.", Label.CENTER);
		la3 = new Label("Student�Դϴ�.",Label.RIGHT);
		la4 = new Label("�ݰ����ϴ�.", Label.LEFT);
		
		f1 = new Font("����ü", Font.BOLD, 20);
		f2 = new Font("����ü", Font.ITALIC, 25);
		
		// ���̾ƿ� ����
		setLayout(new GridLayout(4,1));
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		
		// ��Ʈ����
		la1.setFont(f1);
		la2.setFont(f1);
		la3.setFont(f2);
		la4.setFont(f2);
		
		la1.setBackground(Color.red);
		la2.setBackground(Color.orange);
		la3.setBackground(Color.PINK);
		la4.setBackground(Color.GRAY);
		
		
		// �⺻����
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new LableEx01();
	}

}
