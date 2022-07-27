package swingproject;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;


public class SetFrame extends JFrame implements ActionListener {
	JMenuBar mb = new JMenuBar();
	JMenu mnuSelect = new JMenu("기능(F)");
	JMenu mnuSelect2 = new JMenu("계산기(C)");
	JMenu mnuSelect3 = new JMenu("도움말(H)");
	JMenuItem mi1 = new JMenuItem("저장하기(S)");
	JMenuItem mi2 = new JMenuItem("불러오기(L)");
	JMenuItem mi3 = new JMenuItem("실행하기(O)");
	JMenuItem mi4 = new JMenuItem("정보(I)");

	JLabel la1 = new JLabel("수입");
	JLabel la2 = new JLabel("금액");
	JLabel la3 = new JLabel("Memo");
	JLabel la4 = new JLabel("지출");
	JLabel la5 = new JLabel("금액");
	JLabel la6 = new JLabel("Memo");
	JLabel la7 = new JLabel("현재잔액 : ", JLabel.CENTER);
	JLabel la8 = new JLabel("0", JLabel.CENTER);
	JLabel la9 = new JLabel("원", JLabel.CENTER);

	Choice co1 = new Choice();
	Choice co2 = new Choice();

	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(30);
	JTextField tf3 = new JTextField(20);
	JTextField tf4 = new JTextField(30);

	JTextArea ta1 = new JTextArea(22, 20);
	JTextArea ta2 = new JTextArea(22, 20);

	JButton bt1 = new JButton("INCOME");
	JButton bt2 = new JButton("EXPENSE");

	public SetFrame() throws IOException {

		JFrame frame = new JFrame("가계부");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 150));
		Container contentPane = frame.getContentPane();

		// 메뉴 저장
		mnuSelect.add(mi1); // 기능 메뉴에 저장하기 추가
		mnuSelect.add(mi2); // 기능 메뉴에 불러오기 추가
		mnuSelect2.add(mi3);
		mnuSelect3.add(mi4);
		setJMenuBar(mb);
		mb.add(mnuSelect);
		mb.add(mnuSelect2);
		mb.add(mnuSelect3);
		contentPane.add(mb, BorderLayout.NORTH);

		// choice 넣기
		co1.add("용돈");
		co1.add("월급");
		co1.add("로또");
		co1.add("기타수입");

		co2.add("식비");
		co2.add("교통비");
		co2.add("세금");
		co2.add("문화생활");
		co2.add("경조사비");

		// 이미지
		File file = new File("src/images/01.jpeg");
		BufferedImage img = ImageIO.read(file);
		JLabel imagLabel = new JLabel(new ImageIcon(img));

		// 입력하는 곳
		JPanel p1 = new JPanel();
		p1.add(la1);
		p1.add(co1);
		p1.add(la2);
		p1.add(tf1);
		JPanel p2 = new JPanel();
		p2.add(la3);
		p2.add(tf2);
		JPanel p3 = new JPanel();
		p3.add(la4);
		p3.add(co2);
		p3.add(la5);
		p3.add(tf3);
		JPanel p4 = new JPanel();
		p4.add(la6);
		p4.add(tf4);
		JPanel p5 = new JPanel();
		p5.add(bt1);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		p5.add(bt2);
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(5, 1));
		p6.add(p1);
		p6.add(p2);
		p6.add(p3);
		p6.add(p4);
		p6.add(p5);
		JPanel p7 = new JPanel();
		p7.setLayout(new GridLayout(2, 1));
		p7.add(imagLabel);
		p7.add(p6);
		contentPane.add(p7, BorderLayout.CENTER);

		// 수입, 지출 Border, scrollbar 설정
		SoftBevelBorder ssb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		JScrollPane sp = new JScrollPane(ta1);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JScrollPane sp2 = new JScrollPane(ta2);
		sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		ta1.setBorder(ssb);
		ta1.setEditable(false);
		ta2.setBorder(ssb);
		ta2.setEditable(false);

		// 수입, 지출 Area
		JPanel p8 = new JPanel();
		p8.add(sp);
		p8.add(sp2);

		// 현재금액 추기
		JPanel p9 = new JPanel();
		p9.add(la7);
		p9.add(la8);
		p9.add(la9);

		JPanel p10 = new JPanel();
		p10.setLayout(new BorderLayout());
		p10.add(p8);
		p10.add(p9, BorderLayout.SOUTH);
		contentPane.add(p10, BorderLayout.EAST);

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);

		frame.setSize(900, 500);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {
			// null이면 추가 안됨
			if (tf1.getText().length() != 0 || tf2.getText().length() != 0) {

				String choice = co1.getSelectedItem();
				ta1.append(choice + "\t" + tf1.getText() + "원\n" + tf2.getText() + "\n\n");

				try {
					// text 얻어온걸 int로 형변환
					int la8int = Integer.parseInt(la8.getText());
					int tf1int = Integer.parseInt(tf1.getText());

					la8.setText(la8int + tf1int + "");
				} catch (NumberFormatException ee) {
				}

				tf1.setText("");
				tf2.setText("");
			}
		}
		if (e.getSource() == bt2) {
			// null이면 추가 안됨
			if (tf3.getText().length() != 0 || tf4.getText().length() != 0) {
				String choice = co2.getSelectedItem();
				ta2.append(choice + "\t" + tf3.getText() + "원\n" + tf4.getText() + "\n\n");

				try {
					// text 얻어온걸 int로 형변환
					int la8int = Integer.parseInt(la8.getText());
					int tf3int = Integer.parseInt(tf3.getText());

					la8.setText(la8int - tf3int + "");
				} catch (NumberFormatException ee) {
				}

				tf3.setText("");
				tf4.setText("");
			}
		}
		if (e.getSource() == mi1) {
			FileDialog fd = new FileDialog(this, "파일 저장", FileDialog.SAVE);
			fd.setVisible(true);
			String path = fd.getDirectory() + fd.getFile();

			try {
				FileWriter w = new FileWriter(path);
				w.write("★★ 수입 ★★\n" + ta1.getText() + "\n" + "★★ 지출 ★★\n" + ta2.getText() + "\n");
				w.close();

			} catch (Exception e2) {

			}
		}

		if (e.getSource() == mi2) {
			JFrame jf = new JFrame();
			jf.setPreferredSize(new Dimension(300, 150));
			Container contentPane = jf.getContentPane();

			JTextArea jtf = new JTextArea();
			jtf.setEditable(false);

			// 새 창 스크롤 설정
			JScrollPane jsp = new JScrollPane(jtf);
			jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

			FileDialog fd = new FileDialog(this, "파일 불러오기", FileDialog.LOAD);
			fd.setVisible(true);
			String path = fd.getDirectory() + fd.getFile();

			String s = "";

			try {
				FileReader r = new FileReader(path);
				int k;
				for (;;) {
					k = r.read();
					if (k == -1)
						break;
					s += (char) k;
				}
				r.close();
			} catch (Exception ee) {

				System.out.println("오류" + ee);
			}
			jtf.append(s);

			contentPane.add(jsp);
			jf.setSize(300, 500);
			jf.setVisible(true);
		}
		if (e.getSource() == mi3) {
			Calculator cal = new Calculator();

		}

	}
}