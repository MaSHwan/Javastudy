package Study;
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("'공각기동대'");
		list1.add("원령공주");
		
		List<String> list2 = new ArrayList<String>(list1);// 리스트1의 자료를 포함
		list2.add("라퓨타");
		
		List<String> list3 = new ArrayList<String>(list2);
		list3.addAll(list2);
		
		int n = list3.indexOf("원령공주");
		System.out.println(n);
		list3.add(n+1, "코난");
		
		System.out.println(list3);
	}
}
