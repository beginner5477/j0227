package T3_control;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("숫자를 입력해주세요:");
		n1 = sc.nextInt();
		String judge2, judge3, judge5;
		
		if((n1 % 2) == 0)
		{
			judge2 = "맞다.";
		}
		else
		{
			judge2 = "아니다.";
		}
		if((n1 % 3) == 0)
		{
			judge3 = "맞다.";
		}
		else
		{
			judge3 = "아니다.";
		}
		if((n1 % 5) == 0)
		{
			judge5 = "맞다.";
		}
		else
		{
			judge5 = "아니다.";
		}
		System.out.println(n1 + "은 " + "2의 배수가 " + judge2);
		System.out.println(n1 + "은 " + "3의 배수가 " + judge3);
		System.out.println(n1 + "은 " + "5의 배수가 " + judge5);
		sc.close();
	}
}
