package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class �迭03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int human = Integer.parseInt(args[0]);

		System.out.print("�л��� �Է� : ");
		int human = Integer.parseInt(br.readLine()); // ����� ���ϱ�
		String[] name = new String[human];

		// String[] subject = new String[args.length - 1]; // ����� �ʱ�ȭ
		String[] subject = { "����", "����", "����" };

		// ������ ���� ó�� �迭����
		int[][] score = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		/*
		 * for (int i = 0; i < subject.length ; i++) { // subject[i] = args[i + 1];
		 * System.out.println(subject[i]); }
		 */
		for (int i = 0; i < human; i++) {// ����� ��ŭ �ݺ�
			System.out.print((i + 1) + " ��° �л� �̸� : ");
			name[i] = br.readLine();
			System.out.println(name[i] + " �л� ���� �Է�  ");

			for (int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + " ���� : ");
				score[i][j] = Integer.parseInt(br.readLine());
			}

		}
	}
}
