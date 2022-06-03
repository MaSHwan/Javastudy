package Study;
import java.util.*;
public class QueueTest {
	private static final String colors[] = { // �迭(��ü) ����
			" ����", " ���", " ���", " û��", " ����", " ����"
	};
	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<>();
		for(String color : colors) {
			qu.offer(color);
		}
		
		while(qu.peek() != null) {
			System.out.println(qu.poll());
		}
	}

}
