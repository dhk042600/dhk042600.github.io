public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//난수 생성.... 0.0 <= Math.random() < 1.0
		// 1~6 까지의 난수 생성하기..
		int n = (int)(Math.random()*3)+1;
				System.out.println(n);
				
				switch (n) {
				case 1:
					System.out.println("1번 ㅋㅋㅋ");
					break;
				case 2:
					System.out.println("2번 ㅋㅋㅋ");
					break;
				case 3:
					System.out.println("3번 ㅋㅋㅋ");
					break;
				case 4:
					System.out.println("4번 ㅋㅋㅋ");
					break;
				case 5:
					System.out.println("5번 ㅋㅋㅋ");
					break;
				case 6:
					System.out.println("6번 ㅋㅋㅋ");
					break;
				default:
					System.out.println("해당되는 값이 존재하지 않습니다.");
				    break;
				}
	}

}
