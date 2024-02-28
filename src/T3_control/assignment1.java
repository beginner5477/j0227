package T3_control;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요:");
		int n1;
		String res;
		n1 = sc.nextInt();
		if((n1 % 2) == 0)
		{
			res = "짝수";
		}
		else
		{
			res = "홀수";
		}
		System.out.println(n1 + "은 " + res + "이다.");
		sc.close();
	}
}
