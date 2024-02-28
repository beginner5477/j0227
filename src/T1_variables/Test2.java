package T1_variables;

public class Test2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 010;
		int n3 = 0x10;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3 + "\n");
		
		int num = 10;
		String binaryNum = Integer.toBinaryString(num); // 10진수를 2진수로 변환하는 메소드
		String octaNum = Integer.toOctalString(num); // 10진수를 8진수로 변환하는 메소드
		String hexNum = Integer.toHexString(num); // 10진수를 16진수로 변환하는 메소드
		
		System.out.println("10진수 num = " + num);
		System.out.println("2진수 binaryNum = " + binaryNum);
		System.out.println("8진수 octaNum = " + octaNum);
		System.out.println("16진수 hexNum = " + hexNum);
		
	}

}
