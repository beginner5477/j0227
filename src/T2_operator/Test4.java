package T2_operator;

//3항 연산자 = 조건식? 참 : 거짓
public class Test4 {
	public static void main(String[] args) {
		//점수가 90점 이상이면 'A',점수가 80점 이상이면 'B',점수가 70점 이상이면 'C', 점수가 60점 이상이면 'D',60점 미만은 'F'학점으로 처리하세요
		char res;
		int score = 55;
		
		res = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
		System.out.println("점수는 " + score +", 학점은 " + res + "입니다.");
		
	}
}
