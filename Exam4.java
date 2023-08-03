
public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charCode = 'A'; //65
		int charCode2 = 10;
		double charCode3 = 160 ;
		
		if((65<=charCode) && (charCode<=90)) // 65 이상 이고 90이하 라면
			System.out.println("대문자이군요"); 
		
		if((15<=charCode2) || (charCode3<=160)) // 15세이상 160이하 라면
			System.out.println("놀이기구 탑승가능 이군요");
		
		if(charCode2 % 2 == 0 ) System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		
		//3항 연산자로 해결하기
		boolean k;
		k = (charCode2 % 2) == 0;
		System.out.println(k ? "짝수": "홀수");
		
	}

}
