package day1216;

import java.util.Random;

public class Ex01Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 난수를 구하는 방법이 2가지가 있다
		 * 1. Math.random()            // 첫번째를 더 많이 쓴다, 자바스크랩트에서 많이 사용
		 * 2. Random
		 */
		System.out.println("Math.random() 은 0.0 보다 크거나 같고 1.0 보다 작은 난수 발생");
		for(int i=1; i<=5; i++)
		{
			System.out.println(Math.random());
		}
		
		System.out.println("0~9 사이의 난수를 구하는 방법");
		for(int i=1; i<=5; i++)
		{
			int n = (int)(Math.random() * 10);
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("0~99 사이의 난수를 구하는 방법");
		for(int i=1; i<=5; i++)
		{
			int n = (int)(Math.random() * 100);
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("1~10 사이의 난수를 구하는 방법");
		for(int i=1; i<=5; i++)
		{
			int n = (int)(Math.random() * 10)+1;
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("Random 클래스를 이용해서 난수 구하기");
		Random r = new Random();
		System.out.println();
		System.out.println("0~9까지의 난수 구하기");
		for(int i=1; i<=5; i++)
		{
			int n = r.nextInt(10);
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("1~10까지의 난수 구하기");
		for(int i=1; i<=5; i++)
		{
			int n = r.nextInt(10)+1;
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("A~Z(65~90) 까지의 난수 구하기");
		for(int i=1; i<=5; i++)
		{
			int n = r.nextInt(26)+65;
			System.out.print((char)n + " ");
		}
		System.out.println();
	}

}


//int로 형번환하면 소수점 이하 절삭 됨
// random은 class라 new로 호출해서 사용해야됨
// new로 생성된 변수가 인스턴스 변수
// new로 생성하지 않고도 호출할 수 있는것 class