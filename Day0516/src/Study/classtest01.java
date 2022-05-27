package Study;

class Car {

	String color;
	static int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void dowbSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
	
	

}

public class classtest01 {
	public static void main(String[] args) {

	Car car1 = new Car();
	car1.color = "보라색";	// car 클래스 멤버변수에 값을 설정한다.
	car1.speed = 0;
	
	car1.upSpeed(30); 		// car 클래스의 upSpeed(30)메소드에 30을 매개변수의 값을 대입.
	
	System.out.println(car1.getColor());
	System.out.println(car1.getSpeed());
	
	}
}
