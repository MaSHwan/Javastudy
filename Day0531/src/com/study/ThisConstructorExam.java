package com.study;

class House {
	int price; // �������
	int size;
	String dong;
	String kind;

	public House() {// �����ε�
					// �⺻ ������
		
		this(100,32,"��赿","����Ʈ");
	}

	public House(int price) {// �����ε�
		this(price,32,"��赿","����Ʈ");
	}

	public House(int price, int size) {// �����ε�
		this(price,size,"��赿","����Ʈ");
	}
	public House(int price, int size, String dong) {// �����ε�
		this(price,size,dong,"����Ʈ");
	}
	public House(int price, int size, String dong, String kind) {// �����ε�
		// �ʱ� �۾�
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	}

}

public class ThisConstructorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House h1 = new House();						// 100, 32 , ��赿, ����Ʈ
		System.out.println("h1 price : " + h1.price + ", h1 size : " + h1.size + ", h1. dong : " 
		+ h1.dong + ", h1. kind : " + h1.kind);
		House h2 = new House(200);					// 200, 32 , ��赿, ����Ʈ
		System.out.println("h2 price : " + h2.price + ", h2 size : " + h2.size + ", h2. dong : " 
				+ h2.dong + ", h2. kind : " + h2.kind);
		House h3 = new House(300, 35);				// 300, 35, ��赿, ����Ʈ
		System.out.println("h3 price : " + h3.price + ", h3 size : " + h3.size + ", h3. dong : " 
				+ h3.dong + ", h3. kind : " + h3.kind);
		House h4 = new House(800,52,"���ʵ�");		// 800 , 52, ���ʵ�, ����Ʈ
		System.out.println("h4 price : " + h4.price + ", h4 size : " + h4.size + ", h4. dong : " 
				+ h4.dong + ", h4. kind : " + h4.kind);
		House h5 = new House(900,58,"���ʵ�","����");	// 900, 58, ���ʵ�, ����
		System.out.println("h5 price : " + h5.price + ", h5 size : " + h5.size + ", h5. dong : " 
				+ h5.dong + ", h5. kind : " + h5.kind);
		
	}

}
