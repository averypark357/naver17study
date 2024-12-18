package day1211;

public class Ex02DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 90;
		int eng = 93;
		System.out.println("합계=" + kor + eng); // String + int + int : 묵시적 형 변환에 의해서 String + int = String
		// int + int = int 이므로 먼저 계산을 해야만 한다
		System.out.println("합계=" + (kor + eng));
		
		//진법변환
		int a = 056; // 앞에 0을 붙이면 8진수로 인식
		int b = 0x12a; // 16진수로 인식
		System.out.println("a=" + a); // 8진수를 10진수로 변경하는 방법 : 5 x 8 + 6 x 8의0승 = 46 // 0승은 무조건 1
		System.out.println("b=" + b); //16진수를 10진수로 변경하는 방볍 : 1 x 16의2승 + 2 x 16의1승 + 10 x 16의0승 : 256+32+10
		
		int c = 047;
		int d = 0xa9;
		System.out.println("c=" + c); // 4 x 8 + 7 = 39
		System.out.println("d=" + d); // 10 x 16 + 9 = 169
	}

}
