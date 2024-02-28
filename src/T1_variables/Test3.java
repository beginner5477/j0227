package T1_variables;

//정수형 타입 예제
public class Test3 {
	public static void main(String[] args) {
		byte bb1 = 127, bb2;
		// byte타입의 수치표현 범위: -128 ~ 127
		bb2 = -128;
		System.out.println("bb1 = " + bb1);
		System.out.println("bb2 = " + bb2);
		System.out.println();
		short ss1 = 128, ss2 = -129;
		System.out.println("ss1 = " + ss1);
		System.out.println("ss2 = " + ss2);
		int ii1 = 33000;
		System.out.println("ii1 = " + ii1);
		int ii2 = 2100000000;
		System.out.println("ii2 = " + ii2);
		long ll1 = 3200000000L;
		System.out.println("ll1 = " + ll1);
		char cc1 = 'A';
		System.out.println("cc1 = " + cc1);
		int cc2 = 'A';
		System.out.println("cc2 = " + cc2);
		int cc3 = 'a';
		System.out.println("cc3 = " + cc3);
		char cc4 = '한';
		System.out.println("cc4 = " + cc4);
		int cc5 = '한';
		System.out.println("cc5 = " + cc5);
		char cc6 = '\u0041';
		System.out.println("cc6 = " + cc6);
	}

}
