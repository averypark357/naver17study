package day1217;

public class Ex09ArrayAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []datas= {12,34,54,20,33,59,41,44,27,21};
		System.out.println("인원수:"+datas.length);
		
		
		
		
		
		int []age = new int[5];
		
		for(int i=0; i<datas.length; i++)
		{
			//연령별 인원수 구하기
			//10대일 경우 0번지 증가, 20대일 경우 1번지 증가...
			age[datas[i]/10-1]++;
		}
		
		for(int i=0; i<age.length; i++)
		{
			System.out.println((i+1) * 10 + "대:" + age[i] + "명");
		}
	}

}
