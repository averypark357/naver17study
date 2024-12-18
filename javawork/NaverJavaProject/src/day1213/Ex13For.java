package day1213;

import java.util.Scanner;

public class Ex13For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제2
		 * 5명의 나이를 입력 후
		 * 40세 이상과 40세 미만이 각각 몇명인지 출력하고
		 * 평균 나이도 같이 출력하시오
		 * (for문 사용)
		 */
		Scanner sc = new Scanner(System.in);
		int count1 = 0, count2 = 0, sum = 0, age;
		double avg;
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i + "번째 나이 입력");
			age = sc.nextInt();
			//0~100세를 벗어나는 경우 다시 입력(인원수 제외)
			//continue : for문은 i++로 이동
			if(age <0 || age > 100)
			{
				System.out.println("다시 입력하세요");
				i--;
				continue;
			}
			sum += age;
			if(age >= 40)
				count1++;
			else
				count2++;
		}
		avg = (double)sum/5;
		
		System.out.println("40세 이상 인원수 : " + count1);
		System.out.println("40세 미만 인원수 : " + count2);
		System.out.println("평균 나이 : " + avg);
	}
	

}


// 소수점 이하 너무 많이 나오면 printf 해도 된다

//continue를 사용해서 인원수제외가 됨 (인원수 제외하고 싶을때 사용하기 - 카운트 되지 않으므로)
