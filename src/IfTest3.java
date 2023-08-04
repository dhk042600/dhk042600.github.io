import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1: 0부터 9사이의 정수를 입력받아
		// 짝수, 홀수를 판단하는 코드를 작성하시오
		// 단, if 문으로 작성하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0부터 9사이의 정수입력하기");
		
		int n = scan.nextInt();
		
		if((n %2 !=0)) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}

}
