package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �迭02 {
	public static void main(String[] ar) throws IOException {
		/*
		 * for (int i = 0; i < ar.length; i++) { System.out.println(ar[i]); }
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * if(ar.length == 0) { System.out.println("���� ���� �����ϴ�. "); System.exit(0); }//
		 * ar.length : ���� ��
		 */
		// �̸� �Է� �ޱ�
		String name = br.readLine();
		// String[] subject = new String[ar.length];
		String[] subject = { "����", "����", "����" };
		/*
		 * for(int i = 0; i < subject.length; i++) { //subject[i] = ar[i];
		 * System.out.print(subject[i]+" "); }
		 */
		int score[] = new int[subject.length + 1];// ������ �����ϱ� ���� ����

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " ���� : ");
			score[i] = Integer.parseInt(br.readLine());// ���� �Է¹���

			score[score.length - 1] += score[i];
			System.out.println("���� : " + score[score.length - 1]);
		}
		float avg = score[score.length - 1] / (float) subject.length;
		// �Ҽ���3�ڸ����� �ݿø� �ݿ�
		avg = (int) ((avg + 0.005) * 100) / 100.f;

		// int�� �ʿ��� ���� ã�ƶ�

		char grade = 0;
		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';
			break;
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------"+ name + "���� ����ǥ--------------------");
		System.out.println("----------------------------------------------------");

	}
}
