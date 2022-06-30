package com.syncex;

/*
 * 		동기화 : 여러명이 접근하는 것을 방지 하기 위한 방법
 * 		
 * 		임계영역
 * 		- 멀티 스레드에 의해 공유자원이 참조될 수 있는 코드의 범위를 의미한다.
 * 		- 멀티 스레드 프로그램에서 임계영역을 처리한 경우 심각한 문제가 발생됨
 * 		- 이러한 상황을 해결할 수 있는 방법이 동기화임
 * 
 * 		동기화를 처리하기 위해 모든 객체에 락을 포함시킴
 * 
 * 		락이란?
 * 		- 공유객체 여러 스레드가 동시에 접근하지 못하도록 하지위한 것임
 * 		  모든 객체가 힙 영역에 생성될때 자동으로 만들어지는 것을 락이라고 함
 * 		- 동기화가 잘못되면 Dead Lock 이 걸림
 * 		
 * 		동기화 구현 방법
 * 		1. public synchronized void synchronizedMethod(){
 * 		   }
 * 
 * 		2. public void synchronizedMethod(){
 * 		   synchronized(객체 또는 클래스명){
 * 		  	}
 * 		   }
 */
class ATM2 implements Runnable {

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {

				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
				if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {
					try {
						this.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				} else {
					this.notify();
					
				}

			}

		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	// 출금
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액 : %d원%n", getDepositeMoney());
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}

class ATM implements Runnable {// 동기화는 실행 되었는데 문제 발생

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}

				if (getDepositeMoney() <= 0)
					break;

				withDraw(1000);
			}

		}

	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	// 출금
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액 : %d원%n", getDepositeMoney());
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 입금

}

public class SynchronizedEx01 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();

		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");

		mother.start();
		son.start();
	}
}
