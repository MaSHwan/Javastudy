package Study;

public class TvTest03 {
	public static void main(String[] args) {
		Tv[] tv; // 객체 배열 선언
		tv = new Tv[5];
		
		
		for(int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
			tv[i].channel = i + 10; // tv[i]의 채널에 i + 10을 저장한다.
			System.out.println(tv[i].channel);
		}
		
		for(int i = 0; i < tv.length; i++) {
			tv[i].channelup();	// tv[i].channelup() 메소드를 호출하여 채널을 1증가
			System.out.printf("tv[%d].channel = %d\n", i, tv[i].channel);
		}
	}
}
