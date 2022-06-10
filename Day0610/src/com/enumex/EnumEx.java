package com.enumex;

/*
 * 	열거형은 내부에서 순차적으로 저으이되는 값들을 java, xml, ejb라는 이름으로 그냥 일반적인
 * 	상수라는 개념만으로 저장되는 것이 아니다. 정확히 말하면 java.lang이라는 패키지에 enum이라는 추상
 * 	클래스를 상속받는 내부 클래스가 정의되는것.
 */
public class EnumEx {

	private Color myColor = Color.Red;

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {
		EnumEx ee = new EnumEx();
		ee.setMyColor(Color.Green);
		Color color = ee.getMyColor();

		switch (color) {
		case Red:
			System.out.println("red");
			break;
		case Green:
			System.out.println("green");
			break;
		case Blue:
			System.out.println("blue");
			break;

		default:
			break;
		}

	}
}
