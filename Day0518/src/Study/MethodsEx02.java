package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 		�������� ���
 * 		
 * 		1. �ִ� ��, 2. ������ �հ�, 3. ����, 4. ����
 */
public class MethodsEx02 {

	// �ִ밪 ���ϴ� �޼ҵ� �ۼ�
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		System.out.print("ù��° �� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�ι�° �� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		}
		return b;

	}//end aaa
	//�� ���� �հ踦 ���ϴ� �޼ҵ�
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		System.out.print("ù��° �� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�ι�° �� �Է� : ");
		int b = Integer.parseInt(br.readLine());

		//���� ���� ����
		int tot = 0;
		if(a>b) {
		a = a^b;
		b = b^a;
		a = a^b;
		}
		
		for(int i = a; i <= b; i++) {
			tot += i;
		}
		System.out.println(a + "~~~" + b + "������ �հ� : " + tot);
	}//end bbb
	
	// ū ������� �����ϴ� ������ �����ϴ� �޼ҵ�
	public static String ccc(int x, int y, int z) {// first = x, second = y, third = z
		if(y >= x && y >= z) {
			// swap
			int temp = x;
			x = y;
			y = temp;
		}else if(z >= x && z>= y) {
			int temp = x;
			x = z;
			z = temp;
		}if(z >=y) {
			int temp = y;
			y = z;
			z = temp;
		}
		String abc = x + ">=" + y + ">=" + z;
		return abc;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( // InputStreamReader ��
				new InputStreamReader(System.in)); // BufferedReade �� ���� ����

		int x = 0;

		while (true) {
			System.out.print("1: �ִ�� 2: ���� �հ� 3: ���� 4: ����");
			x = Integer.parseInt(br.readLine());
			
			if(x == 1) {
				int k = aaa();
				System.out.println("�� ���� �ִ밪�� " + k + " �Դϴ�.");
				
			}else if(x == 2) {// Call by Name
				bbb();
				
			}else if(x == 3) {// Call by Value
				System.out.print("ù��° �� �Է� : ");
				int first = Integer.parseInt(br.readLine());
				System.out.print("�ι�° �� �Է� : ");
				int second = Integer.parseInt(br.readLine());
				System.out.print("����° �� �Է� : ");
				int third = Integer.parseInt(br.readLine());
				
				String str = ccc(first, second, third);
				System.out.println("ū ������ ������ " + str);
			}else if(x == 4) {
				break;
			}else {System.out.println("�߸��Է� �ϼ̽��ϴ�.");}
		}

	}
}
