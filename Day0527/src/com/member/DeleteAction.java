package com.member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ ȸ���� �̸��� �Է��ϼ���.");
		System.out.print("������ ȸ�� �̸� : ");
		String name = sc.next();
		deleteMember(name);
		
	}

	private void deleteMember(String name) {
		int deleteIndex = -1;
		//������ ȸ�� ���� ��ü�� �迭������ �ε��� ��ȣ�� -1 �� �ʱ�ȭ��
		MemberVO[] members = MemberMain.members;
		/*
		 * 		������ ȸ������ ��ü�� �ε��� ��ȣ�� ã�Ƴ��� ���� MemberMainŬ������ static ������
		 * 		�����Ǿ� �ִ� members �迭 ���۷��� ������ ���۷��� ���� ������
		 */
		MemberVO[] temp = null;
		/*
		 * 		���� �迭�� ��ü���� ������ ȸ������ ��ü�� �����ϰ� ������ ȸ������ ��ü��
		 * 		�迭 ��ü ���۷��� �������� temp�� ����
		 */

		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				deleteIndex = i;
				/*
				 * 	���� �迭 ��ü�� ����Ǿ� �ִ� ȸ�� ���� ��ü�� �Ƕ���� ������ ���۵Ǿ� �� name���� ������
				 * 	�ִ� ȸ�� ���� ��ü�� ã�� ���ߴٴ� �ǹ��̸� �޽����� ����ϰ� �޼ҵ带 ������
				 */
			}
		}
		if (deleteIndex == -1) {
			System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
			return;
			// deleteIndex�� -1 �̶�� ���� �Ķ���� ���۵Ǿ� �� name���� ���� name���� ������
			// �ִ� ȸ�� ���� ��ü�� ã�� ���ߴٴ� �ǹ��̸� �޽����� ����ϰ� �޼ҵ带 ������
		}

		if (members.length >= 1) {
			temp = new MemberVO[members.length - 1];
			/*
			 * 	temp �迭 ��ü�� MemberMainŬ������ �����Ǿ� �ִ� members�迭�� ũ�⺸��
			 * 	�ϳ� ���� ũ��� ������
			 * 	���� �迭���� ȸ������ ��ü �ϳ��� ������ ���̹Ƿ� ���� �迭�� ũ�⺸�� �ϳ� ���� ������
			 */

			for (int i = 0; i < members.length; i++) {
				if (i == deleteIndex) {
					// ���� �ε����� �����Ϸ��� ȸ�������� �ε����� ������ continue�� �����Ͽ� �ǳʶ�
					//	ȸ�� ������ ��ü�� �������� �ʴ´�.
					continue;
				} else if (i > deleteIndex) {
					// ���� �ε��� ��ȣ�� �����Ϸ��� ȸ�� ������ �ε��� ���� �̸� �����Ϸ��� ��ü��
					// �ε��� ��ȣ �ϳ��� ������ ������ �����Ϸ��� �ε������� ū �ε����� �����ϴ�
					// ��ü���� ������ �ϳ��� �̵����Ѽ� ������.
					temp[i - 1] = members[i];
				} else {
					temp[i] = members[i];
					
				}
			}
		}
		MemberMain.members = temp;
		// �迭��ü temp�� MemberMain Ŭ������ static���� �����Ǿ� �ִ�
		// member������ ������
	}

}
