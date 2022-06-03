package Study;
import java.util.*;
public class QueueTest {
	private static final String colors[] = { // ¹è¿­(°´Ã¼) »ý¼º
			" °ËÁ¤", " ³ë¶û", " ³ì»ö", " Ã»»ö", " »¡°­", " ¿¬µÎ"
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
