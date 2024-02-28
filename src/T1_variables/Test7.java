package T1_variables;

//자동 타입변환 묵시적 타입변환
public class Test7 {
	public static void main(String[] args) {
		int n1 = 100;
		double n2 = 3.14;
		n1 = n1 + 200;
		System.out.println("n1 = " + n1);
		//n1 = n1 + n2;
		n2 = n1 + n2; //double 형으로 자동변환
		System.out.println("n2 = " + n2);
		double result;
		result = n1 + n2;
		System.out.println("result = " + result);
		result = n1 + n1;
		System.out.println("result = " + result);

		int atom;
		atom = 1 + 2;
		System.out.println("atom = " + atom);
		char cc1 = 'A';
		int res2 = cc1 + 1;
		System.out.println("res2 = " + res2);
		System.out.printf("res2 = %d\n", res2);
		System.out.printf("res2 = %c", res2);
		String ss1 = "안녕하세요!";
		System.out.println("ss1 = " + ss1);
		System.out.printf("ss1 = %s\n", ss1);
		double dd1 = 3.141592;
		System.out.println("dd1 = " + dd1);
		System.out.printf("dd1 = %.2f\n", dd1);
		System.out.printf("dd1 = %6.2f\n", dd1);
	}

}
