package day1217;

import java.util.Scanner;

public class Ex11ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []member = {"강호동", "김태희", "손미나", "이지혜",
				"송중기", "김사랑", "손석구", "박미나", "강리나", "김신"};
		String searchName;
		boolean find;
		Scanner sc = new Scanner(System.in);
		/*
		 * 이름을 입력하면 몇번째에 있는지 출력
		 * 없을 경우 "해당 이름은 없습니다"
		 * 반복적으로 검색하다가 종료하고 싶으면 "종료"
		 */
		while(true)
		{
			find = false; //입력 값을 찾았을 경우 true로 변겅
			System.out.print("검색할 이름은(종료:종료)?");
			searchName = sc.nextLine();
			if(searchName.equals("종료")) {
				System.out.println("프로그램 종료!!!");
				break;
		}
			
		for(int i=0; i<member.length; i++)
		{
			if(searchName.equals(member[i]))
			{
				find=true;
				System.out.println((i+1) + "번째에 있습니다");
				break;
			}
		}
		//못 찾았을 경우
		if(!find) { //!find 를 find==false 이렇게 써도 됨
			System.out.println("해당 이름은 없습니다");
			}
		
		}
	}
}
