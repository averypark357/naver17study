package day1219;
/*
 * 생성자란?
 * 1. 객체 생성시 자동 호출
 * 2. return 타입이 없다 (형식 [접근지정자] 클래스명)
 * 3. 오버로딩(Overloading:중복함수)이 가능하다
 * 4. 생성자에서는 주로 멤버 변수 초기화를 담당한다
 */
class Apple
{
	Apple()
	{
		System.out.println("디폴트 생성자");
	}
	
	Apple(String name)
	{
		System.out.println(name + "를 인자로 받음");
	}
	
	Apple(int age)
	{
		System.out.println(age + "을 인자로 받음");
	}
	
	Apple(String name, int age)
	{
		System.out.println(name + "과 " + age + "을 인자로 받음");
	}
}
/////////////////////////////////////////////
public class Ex03Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple(); //생성자 자동 호출
		Apple a2 = new Apple("강씨");
		Apple a3 = new Apple(40);
		Apple a4 = new Apple("빨강", 23);
		
	}

}
