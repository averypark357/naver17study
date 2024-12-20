package day1219;

public class Sawon {
	/*
	 * 멤버변수	사원명 sawonName, 직급 position,
	 * 가족수 famSu
	 */
	private String sawonName;
	private String position;
	private int famSu;
	
	
	/*
	 * 디폴트 생성자
	 * 
	 * 사원명, 직급, 가족수 를 인자로 받는 생성자
	 */
	public Sawon() {
		super();
	}

	
	public Sawon(String sawonName, String position, int famSu) {
		super();
		this.sawonName = sawonName;
		this.position = position;
		this.famSu = famSu;
	}
	
	
	
	/* setter & getter method */
	public String getSawonName() {
		return sawonName;
	}


	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getFamSu() {
		return famSu;
	}


	public void setFamSu(int famSu) {
		this.famSu = famSu;
	}	
	
	/*
	 * 직급에 따라 기본급을 구하는데 부장->450, 과장->300, 대리->250, 사원->150
	 * getGibonPay()
	 */
	public int getGibonPay()
	{
		int gibon=switch(position)
				{
					case "부장"->450;
					case "과장"->300;
					case "대리"->250;
					case "사원"->150;
					default->0;
				};
		return gibon;
	}
	
	/*
	 * 직급에 따라 수당을 구하는데 부장, 과장->70, 대리->250, 사원->150
	 * getSudang()
	 */
	public int getSudang()
	{
		int sudang=switch(position) {
		case "부장","과장"->70;
		case "대리","사원"->50;
		default->0;
		};
		
		return sudang;
	}
	
	/*
	 * getGibonPay() 값을 반환 받아서 세금 5프로를 구해서 반환하는
	 * getTax()
	 */
	public int getTax()
	{
		int tax=getGibonPay()*5/100;
		return tax;
	}
	
	/*
	 * 가족수가 5인 이상이면 30 반환, 5인 미만 2인 이상은 10 반환, 나머지는 0
	 * getFamSudang()
	 */
	public int getFamSudang()
	{
		int famSudang=0;
		if(famSu>=5) famSudang=30;
		else if(famSu>=2) famSudang=10;
		else famSudang=0;
		
		return famSudang;
	}
	
	
	/*
	 * 실수령액을 구해서 반환하는 메서드 기본급+수당-세금+가족수당을 구해서 반환
	 * getNetPay()
	 */
	public int getNetPay()
	{
		return getGibonPay()+getSudang()-getTax()+getFamSudang();
	}
}
