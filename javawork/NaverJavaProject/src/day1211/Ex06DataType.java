package day1211;

public class Ex06DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 은 기본형은 아니고 개체 타입이다.
		String str1 = "Hello";
		String str2 = new String("Happy");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("\t" + str1);
		System.out.println("\t\t" + str2);
		
		//printf 에서 문자열의 변환기호는 %s
		System.out.printf("%s\n",str1);
		System.out.printf("%30s\n",str1);
		System.out.printf("%40s\n",str1);
		System.out.printf("**%-30s**\n",str1);
		
		//문자열에서 + 연산자는 나열을 의미한다
		System.out.println(str1 + str2);
	}

}
