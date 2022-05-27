package com.ex;

public class RoadBike extends AbstractBicycle{

	public static void main(String[] args) {
		RoadBike rb = new RoadBike();
		rb.id = 300;
		rb.brand = "Look";
		rb.prtInfo();

	}

	@Override
	void prtInfo() {
		System.out.println("ID : " + id);
		System.out.println("Bramd : " + brand);
		
	}

}
