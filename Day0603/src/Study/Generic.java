package Study;
/*
 * 		제네릭
 * 
 * 		Generic은 컬렉션(자료구조) 즉, 쉽게 말해서 객체들을 저장하는 구조적인 성격을 보강하기 위해 제공
 * 
 * 		예를들어 컵이라는 특정 객체가있다. 이 컵은 물만 담을 수 있는 물 컵, 또는 이 컵은 주스만 담을수 있는 주스컵
 * 		이렇게 상징적인 것이 바로 Generics
 * 
 * 		제네릭의 필요성
 * 		특정 컬렉션에 원하는 객체 타입을 명시하여 실행하기 전에 컴파일단계에서 지정된 객체가 아니면 절대
 * 		저장이 불가능하게 할수 있다.
 * 	
 * 		이전 버전까지는 반드시 실행하여 컬렉션에 있는 자원들을 하나씩 검출하여 확인할 수밖에 없었다.
 * 		object로부터 상속받은 객체는 모두 저장이 가능했던 이전의 버전들과는 달리 보다 체계적이라 할수 있다.
 * 		실행시 자원 검출을 하게 되면 별도의 형 변환(castring)이 필요 없이 <>사이에 선언하였던
 * 		객체 자료 형으로 검출되어 편리
 * 
 * 		Generic_class명<적용할_Generic)Type> 변수명; // 선언
 */

class Box<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

public class Generic {
	
	
	
	public static void main(String[] args) {
		
		Box<Integer> bi = new Box<Integer>();
		bi.setT(100);
		System.out.println(bi.getT());
		
		Box<String> bs = new Box<String>();
		bs.setT("수업끝");
		System.out.println(bs.getT());
		
		Box<Integer> bit;
		bit = createBox();
		
	}
	
	static Box createBox() {
		
		return new Box();
	}
}
