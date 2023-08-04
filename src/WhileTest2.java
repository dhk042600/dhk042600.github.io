public class WhileTest2 {

	public static void main(String[] args) throws Exception{
		
		// while 루프를 이용해 임의의 난수[실수]
		// 를 발생시키고, 발생된 각 수를 누진 합산하는
		// 프로그램을 작성하자. 단 누진 합계가 20을
		// 넘으면 루프를 종료한다.
		
	boolean bool = false;
	double sum=0.0;
	while(!bool) { //무한루프
		double no = Math.random();
		sum += no;
		Thread.sleep(2000);
		System.out.println("sum: " +sum);
		if(sum>20) break;
	}
}
}