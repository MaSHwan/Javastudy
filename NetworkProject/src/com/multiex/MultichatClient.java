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

	// 로그인 패널
	private JPanel loginPanel;

	// 로그인 버튼
	private JButton loginb;

	// 대화명
	private JLabel label1;

	// 대화명 입력할때 사용할 텍스트 필드
	private JTextField idInput; // 여기까지가 로그인에 필요한 정보

	// 로그아웃 패널
	private JPanel logoutPanel;

	// 로그인 버튼
	private JButton logoutb;

	// 대화명
	private JLabel label2; // 여기까지 로그아웃에 필요한 정보

	// 입력패널
	private JPanel msgPanel;
	
	// 입력텍스트 필드
	private JTextField msgInput;
	
	// 종료버튼
	private JButton exitb;
	
	//메인 윈도우 창
	private JFrame jframe;
	
	//채팅 내용을 출력하는창
	private JTextArea msgOut;
	
	// 카드 레이아웃
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	
	// 상태 플래그
	boolean status;
	
	public MultichatClient(String ip) {
		this.ip = ip;
		
		// 로그인 패널 구성
		loginPanel = new JPanel();
		
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginb = new JButton("로그인");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void run() {

	}

}
