package Study;

public class �迭 {
	public static void main(String[] args) {

		// int[][] score = new int[5][];
		// ���� 5, ���� 3��
		/*
		score [0] = new int[2];	// 99, 92
		score [1] = new int[4];	// 78, 48, 78, 98
		score [2] = new int[3];	// 95, 92, 30
		score [3] = new int[5];	// 37, 98, 23, 21, 19
		score [4] = new int[3];	// 29, 64, 83
		*/
		int[][] score = {
				{99, 92},
				{78, 48, 78, 98},
				{95, 92, 30},
				{37, 98, 23, 21, 19},
				{29, 64, 83}
		};
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum = 0;
			for(int j = 0 ; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%2d\t",score[i][j]);
			}System.out.println();
			System.out.printf("�հ� : %d, ��� : %.2f\n", sum, sum/(double)(score[i].length));
		}
	}
}
