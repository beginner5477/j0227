package T2_operator;

//점수가 60점이상은 합격 점수가 60점 미만은 불합격으로 처리하는 프로그램
public class Test5 {
	public static void main(String[] args) {
		int score = 100; 
		String res;
		res = (score >= 60) ? "합격" : "불합격";
		System.out.println("점수는 " + score + " 당신은 " + res + "입니다.");
	}
}
