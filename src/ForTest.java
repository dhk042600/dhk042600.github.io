
public class ForTest {

	
	public static void main(String[] args) {
		
		// 1부터 10까지의 합을 출력하시오. 이때, 출력은 결과만 출력하기
		// 1부터 10까지의 합:55 
	
		// 2. 구구단 2단 출력하기
		// 출력 결과: 2 x 1 = 2
		// 		      2 x 2 = 4
		//			  ...
		//            2 x 9 = 18
		int sum = 0;
		
		for (int dan = 2; dan < 10; dan++) {
		
		for(int i=1; i<=100; i++) {
		
					
		System.out.println(dan + "X" + i + "="+ (dan*i));
	}
}
}
}