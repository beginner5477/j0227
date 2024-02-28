package T2_operator;

import java.util.Scanner;

//90점이상은 a 80점이상은 b 70점이상은 c 60점이상은 d 60점미만은 f 학점 출력 프로그램
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요:");
		score = sc.nextInt();
		char res;
		res = (score >= 90) ? 'A' : (score >= 80) ? 'B': (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
		System.out.println("점수는 " + score + " 학점은 " + res + "입니다.");
		sc.close();
	}

}
