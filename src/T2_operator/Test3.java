package T2_operator;

//3항 연산자 = 조건식? 참 : 거짓
public class Test3 {
	public static void main(String[] args) {
		//점수가 90점 이상이면 'A', 90점 미만은 'B'학점으로 처리하세요
		char res;
		int score = 75;
		
		res = (score >= 90) ? 'A' : 'B';
		System.out.println("점수는 " + score +", 학점은 " + res + "입니다.");
		
	}
}
