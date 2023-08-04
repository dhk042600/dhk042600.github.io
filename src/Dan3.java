

import java.util.Scanner;

public class Dan3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);// 사용자가 키보드로 데이터를 입력할 수 있게 하는 객체
		
		int selectNo=1;// 선택번호를 저장하는 변수1
	
		int money = 0;// 금액을 저장하는 변수
		
		int balance = 0;// 통장 잔액을 저장하는 변수
		
		while(true) { // while 문의 조건식이 true면 무한 반복
			
			System.out.println("-------------------------------------");
			
			System.out.println("   1. 예금 | 2. 출금 | 3. 조회 | 4. 종료"   );
		
			System.out.println("-------------------------------------");
		
			System.out.print("선택>");
			
		
			selectNo = s.nextInt();// 선택을 입력할 수 있게 커서 생성(키보드로 선택번호 입력)
			
			if(selectNo==1) { // 선택(selecNo)이 1이면
				System.out.print("예금액>");
				
				money = s.nextInt();
				
				balance += money;// balance = balance(통장잔액) + money(금액); 
			
			}else if(selectNo==2) {// 선택(selecNo)이 2이면
				
				System.out.print("출금액>");
				
				money = s.nextInt();
								
				balance -= money;// balance = balance(통장잔액) - money(금액);
				
			}else if(selectNo==3) {// 선택(selecNo)이 3이면
				
				System.out.println("조회액>"+balance);// balance(통장잔액)을 보여주면 됨.
			
			}else if(selectNo==4) {// 선택(selecNo)이 4이면
				
				System.out.println("프로그램 종료");

				break;
			}else {
				System.out.println("1~4 중 하나만 선택하세요.1");
			}							
		}	 
	}
}