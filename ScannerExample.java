import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name ; 
//		int age ;
//		String dept;
//		double height;
//		
//		//입력 객체 생성
//		Scanner scan = new Scanner(System.in);
//		
//		//데이터 읽어오기
//		
//		System.out.println("이름을 입력하세요:>>");
//		
//		name = scan.next();
//		
//		System.out.println("나이를 입력하세요:>>");
//		
//		age = scan.nextInt();
//				
//		System.out.println("키를 입력하세요:>>");
//		
//		height = scan.nextDouble();
//		
//		System.out.println("전공을 입력하세요:>>");
//		
//		dept = scan.next();
//		
//		
//		System.out.printf("이름:%s, 나이:%d, 키:%5.1f, 전공:%s", name, age, height, dept);
		
		int midScore;
		int finalScore;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		midScore = 60;
		finalScore = 80;
		
		System.out.println("학기 전 동혁이의 중간 점수:");
		midScore = scan.next();
		System.out.println("학기 전 동혁이의 기말 점수:");
		finalScore = scan.next();
		
		
		System.out.println("중간:%d, 기말:%d", score);
	}

}
