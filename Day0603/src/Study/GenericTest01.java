package Study;

public class GenericTest01<T> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U> void print(U t) {
		System.out.println("T : " + t.getClass().getName());
//		System.out.println("U : " + );
	}
	
	public static void main(String[] args) {
		GenericTest01<Integer> g = new GenericTest01<Integer>();
		g.add(new Integer(10));
		g.print("Test");
	}
}
