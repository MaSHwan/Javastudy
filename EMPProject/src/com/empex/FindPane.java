package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;
	private JButton rsb;

	private int department = 10;

	// 제목
	String[] caption = { "번호 : ", "이름 : ", "직책 : ", "부서 : ", "메일 : " };

	public FindPane() {
		setLayout(new GridLayout(7, 1));

		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;

		int i;
		for (i = 0; i < size; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			
			tf[i].setEditable(false); // 텍스트 필드를 입력 불가능한 상태로 전환
			if (i == 0 || i == 1) {
				tf[i].setEditable(true); // 사번과 이름으로 검색해야하므로 입력 가능한 상태로 만듦
			}
		}

//		jp[i] = new JPanel();
//		jl[i] = new JLabel(caption[i]);
//		jp[i].add(jl[i]);
//		add(jp[i]);

		jp[size] = new JPanel();

		okb = new JButton("사원 정보 조회");
		okb.addActionListener(this); // 이벤트 추가

		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this); // 이벤트 추가

		jp[size].add(okb);
		jp[size].add(rsb);

		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();		// 이벤트가 발생한 버튼의 캡션 값을 얻어옴

		
		EmployeeVO evo = null;		// 검색한 사원정보를 저장한 VO객체를 생성

		employeeDAO edvo = null;		// 데이터 베이스 처리를 위한 DAO 객체


		if (ae_type.equals(okb.getText())) { // 조회버튼을 누를경우
			try {
				edvo = new employeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("") && !sname.equals("")) {		// 사번과 이름
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				}else if(!sno.equals("") && sname.equals("")) {// 사번
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				}else if(sno.equals("") && !sname.equals("")) {// 이름
					evo = edvo.getEmployeeName(sname);
				}
				
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			}
			if (evo != null) { // 해당하는 사원이 존재하지 않는다면 필드를 초기화
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobgrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail());
			} else if(evo == null) {
				JOptionPane.showMessageDialog(this,"검색실패!");
			}
		} else if (ae_type.equals(rsb.getText())) { // 다시 쓰기 버튼을 누를경우
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				tf[i].setText(""); // tf[i]를 초기화
			}
		}
	}

}// JOptionPane.showInternalMessageDialog(this,"검색실패!");
