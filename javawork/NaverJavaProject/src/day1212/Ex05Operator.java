package day1212;

public class Ex05Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건(삼항)연산자 조건식 1? 참일때 값 : 거짓일때 값
		//조건이 여러개인 경우
		//조건식 1? 참일때 값 : 조건식 2? 참일때 값 : 조건식 3? 참일때 값 : 거짓일때 값
		int x, y, max;
		x = 5;
		y = 13;
		
		max = x > y ? x : y;
		System.out.println("max=" + max);
		
		int z = 20;
		max = x > y && x > z ? x : y > x && y > z ? y : z;
		System.out.println("max=" + max);
		
		int score = 90;
		char grade;
		//수식을 구현 : 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D', 나머지는 'F'
		
		grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
		
		System.out.println(score + "점은 " + grade + "학점입니다");
		
		//점수가 90 이상이면 Good 나머지는 Try 출력
		System.out.println(score + "점수는 " + (score >= 90 ? "Good!!" : "Try!!"));
		
	}

}
