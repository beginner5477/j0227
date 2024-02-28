package T1_variables;

//강제타입변환 (casting)한다
public class Test8 {
	public static void main(String[] args) {
		double n1 = 3.14;
		int res;
		// res = n1; 더블을 인트에 넣으려고 하니까 
		// 강제형변환
		res = (int) n1;
		System.out.println("res = " + res);
		
		short ss1 = 10, ss2;
		int ii1 = 100;
		ii1 = ss1;
		ss1 = (short) ii1;
		System.out.println("ss1 = " + ss1);
		int su = 1000000;
		System.out.println("su = " + su);
		
		ss2 = (short) su;
		System.out.println("ss2 = " + ss2);

	}

}
