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

	// ����
	String[] caption = { "��ȣ : ", "�̸� : ", "��å : ", "�μ� : ", "���� : " };

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
			
			tf[i].setEditable(false); // �ؽ�Ʈ �ʵ带 �Է� �Ұ����� ���·� ��ȯ
			if (i == 0 || i == 1) {
				tf[i].setEditable(true); // ����� �̸����� �˻��ؾ��ϹǷ� �Է� ������ ���·� ����
			}
		}

//		jp[i] = new JPanel();
//		jl[i] = new JLabel(caption[i]);
//		jp[i].add(jl[i]);
//		add(jp[i]);

		jp[size] = new JPanel();

		okb = new JButton("��� ���� ��ȸ");
		okb.addActionListener(this); // �̺�Ʈ �߰�

		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this); // �̺�Ʈ �߰�

		jp[size].add(okb);
		jp[size].add(rsb);

		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();		// �̺�Ʈ�� �߻��� ��ư�� ĸ�� ���� ����

		
		EmployeeVO evo = null;		// �˻��� ��������� ������ VO��ü�� ����

		employeeDAO edvo = null;		// ������ ���̽� ó���� ���� DAO ��ü


		if (ae_type.equals(okb.getText())) { // ��ȸ��ư�� �������
			try {
				edvo = new employeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("") && !sname.equals("")) {		// ����� �̸�
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				}else if(!sno.equals("") && sname.equals("")) {// ���
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				}else if(sno.equals("") && !sname.equals("")) {// �̸�
					evo = edvo.getEmployeeName(sname);
				}
				
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			}
			if (evo != null) { // �ش��ϴ� ����� �������� �ʴ´ٸ� �ʵ带 �ʱ�ȭ
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobgrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail());
			} else if(evo == null) {
				JOptionPane.showMessageDialog(this,"�˻�����!");
			}
		} else if (ae_type.equals(rsb.getText())) { // �ٽ� ���� ��ư�� �������
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				tf[i].setText(""); // tf[i]�� �ʱ�ȭ
			}
		}
	}

}// JOptionPane.showInternalMessageDialog(this,"�˻�����!");
