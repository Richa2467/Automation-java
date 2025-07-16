package Day11;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greetings g=new Greetings();
		g.m1();
		
		String s=g.m2();
		System.out.println(s);
		System.out.println(g.m2());
		
		g.m3("Ram");
		
		System.out.println(g.m4("Sita "));
		
	}

}
