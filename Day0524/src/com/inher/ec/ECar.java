package com.inher.ec;

public class ECar {

	private int battertPercentage = 100;
	private int distance = 0;

	public static ECar getInstance() {
		Ecar car = new ECar();
		return car;
		// ��ü ��ȯ

	}

	public void dispDistance() {
		System.out.println(distance + "km ����");
	}

	public void dispBattery() {
		if (this.battertPercentage == 0) {
			System.out.println("���͸��� �����ϴ�. ���� �Ë���ٻ���");
			return;
		}
		System.out.println("���͸� : " + battertPercentage);
	}

	public void drive() {
		if (this.battertPercentage != 0) {
			this.distance += 1;
			this.battertPercentage -= 10;
		}
	}

	public static void main(String[] args) {
		//ECar car = new Ecar();
		Ecar car = ECar.getInstance();
		car.drive();
		car.drive();
		car.drive();
		car.dispDistance();
		car.dispBattery();
	}
}
