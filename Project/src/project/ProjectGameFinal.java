package project;

import java.util.Scanner;

public class ProjectGameFinal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0; // ����
		int c = 0, d = 0; // ���
		String ch; // ��� �̵� �޾��ִ� ����
		String[][] aa = new String[10][20]; // ��ũ��

		c = (int) (Math.random() * 7 + 1); // �ʱ� ����� ��ġ��
		d = (int) (Math.random() * 17 + 1);

		while (true) {
			a = (int) (Math.random() * 7 + 1); // �ʱ� ���� ��ġ�� && �ݺ����� ���� �ɶ����� �����̴� �����Լ�
			b = (int) (Math.random() * 17 + 1);

			for (int i = 0; i < aa.length; i++) {
				for (int j = 0; j < aa[i].length; j++) {
					if (i == 0 || i == 9) {
						aa[i][j] = "#";
					} else {
						if (j == 0 || j == 19) {
							aa[i][j] = "#";
						}

						else {
							aa[i][j] = " ";

						}
					}

					aa[3][15] = "G"; // ������ ����� ��
					aa[a][b] = "M"; // �����Լ��κ��� �޾ƿͼ� ������ ��ġ�� ���� ��
					aa[c][d] = "@"; // �ݺ��� ���������� �����Լ��κ��� �޾ƿ��� ����� ���� ��ġ��
					System.out.print(aa[i][j]);

				}

				System.out.println();

			}
			System.out.println("���� : (W), �Ʒ��� : (S), ���� : (A) ������ : (D)");
			ch = sc.next();

			switch (ch) {
			case "W":
				c--;
				break;
			case "S":
				c++;
				break;
			case "A":
				d--;
				break;
			case "D":
				d++;
				break;

			default:System.out.println("�ٽ� �Է��� �ּ���");
				continue;
			}

			if (aa[c][d] == aa[3][15]) {
				System.out.println("Win!!");
				break;
			} else if (aa[c][d] == aa[a][b]) {
				System.out.println("Lose!!");
				break;
			}
		}

	}
}
