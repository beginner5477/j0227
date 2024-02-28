package T3_control;

import java.util.Scanner;

//점수가 90이상이면 a 80 이상이면 b 70이상이면 c 60이상이면 d 60미만이면 f로 출력
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요:");
		score = sc.nextInt();
		char res;
		if(score >= 90) {
			res = 'A';
		}
		else if(score >= 80) {
			res = 'B';
		}
		else if(score >= 70) {
			res = 'C';
		}
		else if(score >= 60) {
			res = 'D';
		}
		else {
			res = 'F';
		}
		System.out.println("당신의 점수는 " + score + " 학점은 " + res + "입니다.");
		
		sc.close();
	}
}
