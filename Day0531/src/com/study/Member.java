package com.study;

public class Member {
	private String name;
	private String nation;
	private int height;
	private int weight;

	

	public Member(String name, String nation, int height, int weight) { // 알트 + 쉬프트 + s
																		// constructor using field
		
		this.name = name;
		this.nation = nation;
		this.height = height;
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNation() {
		return nation;
	}



	public void setNation(String nation) {
		this.nation = nation;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
