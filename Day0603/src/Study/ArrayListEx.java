package Study;
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("'�����⵿��'");
		list1.add("���ɰ���");
		
		List<String> list2 = new ArrayList<String>(list1);// ����Ʈ1�� �ڷḦ ����
		list2.add("��ǻŸ");
		
		List<String> list3 = new ArrayList<String>(list2);
		list3.addAll(list2);
		
		int n = list3.indexOf("���ɰ���");
		System.out.println(n);
		list3.add(n+1, "�ڳ�");
		
		System.out.println(list3);
	}
}
