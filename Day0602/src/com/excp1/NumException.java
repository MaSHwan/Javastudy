package com.excp1;

public class NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringNumber = { "23", "12", "3.141592", "998" };

		int i = 0;

		for (i = 0; i < stringNumber.length; i++) {
			try {
				int n = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 " + n);
			} catch (NumberFormatException ne) {
				System.out.println(stringNumber[i] + " 는 정수로 변환할 수 없습니다.");

			}
		}
	}

}
