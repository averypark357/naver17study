package day1218;

class Car
{
	static String carCompony = "현대";
	
	private String carName;
	private int carPrice;
	
	public static void setCarCompony(String carCompony)
	{
		//static 메서드에서는 static 변수만이 접근 가능하다
		Car.carCompony = carCompony;
	}
	//setter method
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	
	public void setCarPrice(int carPrice)
	{
		this.carPrice = carPrice;
	}
	
	//getter method
	public String getCarName()
	{
		return carName; //this는 생략 가능
	}
	
	public int getCarPrice()
	{
		return carPrice;
	}
	//두가지 한꺼번에 변경 할 경우 호출
	public void setData(String carName, int carPrice)
	{
		this.setCarName(carName);
		this.setCarPrice(carPrice);
	}
}
public class Ex09Object {
	
	public static void writeCarInfo(Car myCar)
	{
		System.out.println("자동차명 : " + myCar.getCarName());
		System.out.println("가 격 : " + myCar.getCarPrice());
		System.out.println("=".repeat(30));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재 자동차회사명: " + Car.carCompony);
		Car.setCarCompony("삼성");
		System.out.println("변경된 자동차 회사명: " + Car.carCompony);
		
		Car car1 = new Car();
		car1.setCarName("그랜져");
		car1.setCarPrice(3900);
		
		Car car2 = new Car();
		car2.setData("소나타", 3200);
		
		Car car3 = new Car();
		car3.setCarName("Mini");
		car3.setCarPrice(5000);
		
//		System.out.println("car1 자동차명 : " + car1.getCarName());
//		System.out.println("car1 가격 : " + car1.getCarPrice());
//		System.out.println("=".repeat(30));
//		System.out.println("car2 자동차명 : " + car2.getCarName());
//		System.out.println("car2 가격 : " + car2.getCarPrice());
		
		writeCarInfo(car1);
		writeCarInfo(car2);
		writeCarInfo(car3);
	}

}
