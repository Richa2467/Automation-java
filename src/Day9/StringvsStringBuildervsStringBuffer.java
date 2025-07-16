package Day9;

public class StringvsStringBuildervsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String - immutable
		
//		String s="welcome";
//		s.concat("to java");
//		System.out.println(s);         //immutable, can not change origional value of s
		
		
		//StringBuffer  -mutable
		
		
//		StringBuffer s=new StringBuffer("welcome");
//		s.append("to java");
//		System.out.println(s);
		
		
		//StringBuilder - mutable
		StringBuilder s=new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s);
		

	}

}
