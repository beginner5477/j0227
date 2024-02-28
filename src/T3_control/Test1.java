package T3_control;

import java.util.Scanner;

//점수가 60점이상이면 합격 60점미만이면 불합격 출력 프로그램
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요:");
		score = sc.nextInt();
		String res;
		if(score >= 60)
		{
			res = "합격";
		}
		else
		{
			res = "불합격";
		}
		System.out.println("당신 점수는 " + score + "이고 " + res + "입니다.");
		sc.close();
	}
}
