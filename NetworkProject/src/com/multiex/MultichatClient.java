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

	// 메인 윈도우 창
	private JFrame jframe;

	// 채팅 내용을 출력하는창
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

		// 대화명 라벨
		label1 = new JLabel("대화명");

		// 패널에 대한 레이아웃 설정
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginb, BorderLayout.EAST);

		// 로그아웃 패널구성
		logoutPanel = new JPanel();

		// 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutb = new JButton("로그아웃");

		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutb, BorderLayout.EAST);

		// 입력 패널 구성
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);

		exitb = new JButton("종료");

		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitb, BorderLayout.EAST);

		// 로그인/로그아웃 패널 선택을 위한 카드 레이아웃
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel);
		tab.add(logoutPanel, "logout");

		// 메인 프레임 구성
		jframe = new JFrame("멀티 채팅 프로그램");
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);

		// 수직 스크롤 바는 항상 나타내고, 수평 스크롤바는 필요시에만 나타나게 함
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		clayout.show(tab, "login");

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack(); // 프레임크기 자동설정
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
