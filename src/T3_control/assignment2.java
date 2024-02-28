package T3_control;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("첫번째수를 입력해주세요:");
		n1 = sc.nextInt();
		System.out.print("두번째수를 입력해주세요:");
		n2 = sc.nextInt();
		int largeNum, smallNum;
		if(n1 > n2)
		{
			largeNum = n1;
			smallNum = n2;
		}
		else if(n1 == n2)
		{
			largeNum = n1;
			smallNum = n1;
		}
		else
		{
			largeNum = n2;
			smallNum = n1;
		}
		if(largeNum == smallNum)
		{
			System.out.println("두수는 같습니다.");
		}
		else
		{
			System.out.println("큰수는 " + largeNum + "이고 작은수는 " + smallNum + "입니다.");

		}
		sc.close();
	}
}
