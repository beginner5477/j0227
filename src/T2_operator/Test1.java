package T2_operator;

public class Test1 {
	public static void main(String[] args) {
		int n1 = 0;
		n1 = n1 + 1;
		System.out.println("2.n1 = " + n1);
		n1 += 1;
		System.out.println("3.n1 = " + n1);
		++n1;
		System.out.println("4.n1 = " + n1);
		n1++;
		System.out.println("5.n1 = " + n1);
		System.out.println("=============================================");
		int res = 0;
		res = n1;
		System.out.println("6.n1 = " + n1 + ", res = " + res);
		res = ++n1 + 10;
		System.out.println("7.n1 = " + n1 + ", res = " + res);
		res = n1++ + 10;
		System.out.println("8.n1 = " + n1 + ", res = " + res);
		res = --n1 + 10;
		System.out.println("9.n1 = " + n1 + ", res = " + res);
		res = n1-- + 10;
		System.out.println("10.n1 = " + n1 + ", res = " + res);
		res = ++n1 + n1-- + 10;
		System.out.println("11.n1 = " + n1 + ", res = " + res);
		
	}
}
