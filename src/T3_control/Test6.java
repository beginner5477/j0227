package T3_control;

import java.util.Scanner;
//입력받은수가 양수인지 음수인지 0인지 판별하쇼
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("숫자를 입력하세요 =>");
		n1 = sc.nextInt();
		String jud;
		if(n1 > 0)
		{
			jud = "양수";
		}
		else if(n1 == 0)
		{
			jud = "0";
		}
		else
		{
			jud = "음수";
		}
		System.out.println(n1 + "은 " + jud + "입니다.");
	}
}
