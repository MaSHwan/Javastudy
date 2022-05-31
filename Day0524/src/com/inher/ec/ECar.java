package com.inher.ec;

public class ECar {

	private int battertPercentage = 100;
	private int distance = 0;

	public static ECar getInstance() {
		ECar car = new ECar();
		return car;
		// 객체 반환

	}

	public void dispDistance() {
		System.out.println(distance + "km 주행");
	}

	public void dispBattery() {
		if (this.battertPercentage == 0) {
			System.out.println("배터리가 없습니다. 충전 시뗴쿠다사이");
			return;
		}
		System.out.println("배터리 : " + battertPercentage);
	}

	public void drive() {
		if (this.battertPercentage != 0) {
			this.distance += 1;
			this.battertPercentage -= 10;
		}
	}

	public static void main(String[] args) {
		//ECar car = new Ecar();
		ECar car = ECar.getInstance();
		car.drive();
		car.drive();
		car.drive();
		car.dispDistance();
		car.dispBattery();
	}
}
