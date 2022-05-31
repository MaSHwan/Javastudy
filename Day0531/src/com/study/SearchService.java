package com.study;
// ���� ȸ���� �˻��ϴ� ��� ����
public class SearchService {
	
	// ��ü �迭 5�� ����
	Member[] members = new Member[5];
	public SearchService() {
		// �����ڸ� ȣ���ؼ� ��ü�� �����ɋ� �ټ����� �迭�� �����ϴ� �κ�
		// members ��ü�迭�� ȸ������ ������ ����
		members[0] = new Member("ȫ�浿", "�ѱ�", 180, 70);
		members[1] = new Member("��浿", "�Ϻ�", 175, 65);
		members[2] = new Member("������", "�߱�", 172, 70);
		members[3] = new Member("����", "�ѳ���", 187, 97);
		members[4] = new Member("��������", "������", 180, 70);
	}
	// ȸ���� �̸��� �Ű� ������ �޾Ƽ� �ش� �̸��� ������ �ִ� ȸ�� ��ü �迭���� ã��
	// �ش� ȸ���� ������ ����ϴ� ��� ����
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				// �ش� �̸��� ȸ���� ã�� ������ ������ ���
				prtInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	// �Ķ���� ������ ȸ�� ��ü�� ������ �޾Ƽ� ����ϴ� �޼ҵ�
	private void prtInfo(Member member) {
		System.out.println(member.getName() + " ���� ã�� �����");
		System.out.println("�̸� : " + member.getName() + " ���� : " + member.getNation() 
		+ " ���� : " + member.getHeight() + " ������ : " + member.getWeight());
	}
}
