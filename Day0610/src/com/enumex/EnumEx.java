package com.enumex;

/*
 * 	�������� ���ο��� ���������� �����̵Ǵ� ������ java, xml, ejb��� �̸����� �׳� �Ϲ�����
 * 	������ ���丸���� ����Ǵ� ���� �ƴϴ�. ��Ȯ�� ���ϸ� java.lang�̶�� ��Ű���� enum�̶�� �߻�
 * 	Ŭ������ ��ӹ޴� ���� Ŭ������ ���ǵǴ°�.
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
