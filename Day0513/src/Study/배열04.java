package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class �迭04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.print("�л��� �Է� : ");
		int human = Integer.parseInt(br.readLine()); // ����� ���ϱ�
		String[] name = new String[human];

		
		String[][] subject = new String[human][];

		// ������ ���� ó�� �迭����
		int[][] score = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		for (int i = 0; i < human; i++) {// ����� ��ŭ �ݺ�
			System.out.print((i + 1) + " ��° �л� �̸� : ");
			name[i] = br.readLine();
			
			System.out.println("����� �Է� : ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];
			
			for(int j = 0; j < subject[i].length; j++) {
				System.out.println((j+1)+" ��° ���� ���� : ");
				subject[i][j] = br.readLine();
			}
			score[i] = new int[imsi+1];
			System.out.println(name[i] + " �л� ���� �Է�  ");

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + " ���� : ");
				score[i][j] = Integer.parseInt(br.readLine());
			}

		}
	}
}