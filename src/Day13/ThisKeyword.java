package Day13;

public class ThisKeyword {
	int x,y;                       //class variables/instance variable.
	
	ThisKeyword(int x, int y)
	{
		this.x=x;                  //local variable.
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword th=new ThisKeyword(11,12);
		th.display();
		

	}

}
