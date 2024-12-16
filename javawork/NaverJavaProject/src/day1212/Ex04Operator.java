package day1212;

public class Ex04Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//관계연산자(>, <, >=, <=, ==, !=), 논리연산자(&&, ||, !) => 결과 값은 무조건 boolean(true/false)
		int kor = 89, eng = 100, mat = 89;
		boolean f = false;
		
		System.out.println(kor>eng); //false
		System.out.println(kor<eng); //true
		System.out.println(kor==mat); //true
		System.out.println(kor!=mat); //false
		System.out.println(kor>eng && eng>mat); //false : false && true : 1번째 조건이 false일 경우 두번째 조건은 비교하지 않는다
		System.out.println(eng); //100
		System.out.println(kor>eng || eng>mat); //true : false || true : 1번째 조건이 true일 경우 두번째 조건은 비교하지 않는다
		System.out.println(eng); //1 증가 되있음
		System.out.println(!(kor>eng)); //true
		System.out.println(!f); //true
	}

}
