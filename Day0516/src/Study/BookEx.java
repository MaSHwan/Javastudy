package Study;

public class BookEx {
	public static void main(String[] args) {

		Book mybook = new Book();
		mybook.name = "논어";
		mybook.writer = "공자";
        mybook.price = 6000;
		mybook.isbn = "10000-1111-22222";
		mybook.nowPage = 1;
		
		System.out.println(mybook);
		Book mybook2 = new Book("논어", "공자", 6000, 1, "10000-1111-22222," );

	}
}
