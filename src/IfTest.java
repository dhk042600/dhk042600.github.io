import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 83;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력:");
		
		score = scan.nextInt();
		
		// 90점 이상이면 합격을 출력하기...
		if(score >= 90) {
		System.out.println("A");
		
		} else if(score >=80) {
			System.out.println("B");
		} else if(score >=70) {
			System.out.println("C");
		} else if(score >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
