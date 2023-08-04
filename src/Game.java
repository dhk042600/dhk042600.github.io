import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Game Menu");
		System.out.println("1.가위\t2.바위\t3.보\t9.종료");
		System.out.println("-----");
		System.out.println("입력하세요!!!");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		// computer가 만든 난수 값
		int com = (int)(Math.random()*3+1);
		
		// 승패 판단하기

		System.out.println("User: " + user);
		System.out.println("Com: " + com);
		
		//1. 비길경우
		
		if((user == com)) {
			System.out.println("비겼습니다");
			
			
		} else if (( user==1 && com==3) || (user==2 && com ==1) || (user==3 && com ==2)) {
			System.out.println("이겼습니다");
		}
		else {
			System.out.println("졌습니다");
		}
		
		//2. 내가 이길 경우
		
		
		
		//3. 그외 내가 질경우
		
	}

}
