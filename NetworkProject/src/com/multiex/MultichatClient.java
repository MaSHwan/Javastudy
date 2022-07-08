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
	
	//���� ������ â
	private JFrame jframe;
	
	//ä�� ������ ����ϴ�â
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
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void run() {

	}

}
