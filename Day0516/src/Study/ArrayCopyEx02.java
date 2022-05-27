package Study;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("변경 전 arr.length : " + arr.length);
		
		int[] temp = new int[arr.length*2];// 수식이 들어갈 수도 있음
		System.out.println("temp.length : "+ temp.length);
		
		// for문을 이용해서 arr배열에 저장된 값을 temp배열에 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
			
			System.out.print(temp[i] + "\t");
			
			
		}
		arr = temp;
		System.out.println();
		System.out.println("변경 후 arr.length : " + arr.length);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + "\t");
		}
	}
}
