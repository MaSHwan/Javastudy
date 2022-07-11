package com.multiex;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MultichatClient implements Runnable, ActionListener {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;

	// �α��� �г�
	private JPanel loginPanel;

	// �α��� ��ư
	private JButton loginb;

	// ��ȭ��
	private JLabel label1;

	// ��ȭ�� �Է��Ҷ� ����� �ؽ�Ʈ �ʵ�
	private JTextField idInput; // ��������� �α��ο� �ʿ��� ����

	// �α׾ƿ� �г�
	private JPanel logoutPanel;

	// �α��� ��ư
	private JButton logoutb;

	// ��ȭ��
	private JLabel label2; // ������� �α׾ƿ��� �ʿ��� ����

	// �Է��г�
	private JPanel msgPanel;

	// �Է��ؽ�Ʈ �ʵ�
	private JTextField msgInput;

	// �����ư
	private JButton exitb;

	// ���� ������ â
	private JFrame jframe;

	// ä�� ������ ����ϴ�â
	private JTextArea msgOut;

	// ī�� ���̾ƿ�
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	// ���� �÷���
	boolean status;

	public MultichatClient(String ip) {
		this.ip = ip;

		// �α��� �г� ����
		loginPanel = new JPanel();

		// ���̾ƿ� ����
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginb = new JButton("�α���");

		// ��ȭ�� ��
		label1 = new JLabel("��ȭ��");

		// �гο� ���� ���̾ƿ� ����
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginb, BorderLayout.EAST);

		// �α׾ƿ� �гα���
		logoutPanel = new JPanel();

		// ���̾ƿ� ����
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutb = new JButton("�α׾ƿ�");

		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutb, BorderLayout.EAST);

		// �Է� �г� ����
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);

		exitb = new JButton("����");

		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitb, BorderLayout.EAST);

		// �α���/�α׾ƿ� �г� ������ ���� ī�� ���̾ƿ�
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel);
		tab.add(logoutPanel, "logout");

		// ���� ������ ����
		jframe = new JFrame("��Ƽ ä�� ���α׷�");
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);

		// ���� ��ũ�� �ٴ� �׻� ��Ÿ����, ���� ��ũ�ѹٴ� �ʿ�ÿ��� ��Ÿ���� ��
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		clayout.show(tab, "login");

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack(); // ������ũ�� �ڵ�����
		jframe.setResizable(false);
		jframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void run() {

	}

	public static void main(String[] args) {
		new MultichatClient("192.168.0.26");
	}
}
