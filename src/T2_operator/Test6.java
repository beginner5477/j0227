package T2_operator;

import java.util.Scanner;

//점수가 60점이상은 합격 점수가 60점 미만은 불합격으로 처리하는 프로그램
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("점수를 입력하세요:");
		su = sc.nextInt();
		String res;
		res = (su >= 60) ? "합격" : "불합격";
		System.out.println("점수는 " + su + " 당신은 " + res + "입니다.");
		
		sc.close();
	}
}
