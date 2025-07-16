package Day19;

public class TypeCastingObject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ex-1
//		Object o= new String("Welcome");
//		StringBuffer s=(StringBuffer) o;      //Rule1- yes   Rule2- yes   Rule3-failed
		
		//Ex-2
//		String s=new String("welcome");      //Rule 1- failed.
//		StringBuffer sb=(StringBuffer) s;
		
		//Ex-3
//		Object o=new String("welcome");
//		StringBuffer sb=(StringBuffer) o;      //Rule 1- yes, Rule 2- yes, Rule 3-failed.
		
		//Ex-4
//	    Object o=new String("welcome");
//	    StringBuffer sb=(String) o;            //Rule 1 - yes, Rule 2- not valid.
		
		
//		//Ex-5
//		String s=new String("welcome");
//		StringBuffer sb=(String) s;           //Rule 1-yes, Rule 2- failed.
		
		
		//Ex-6
//		Object o=new String("welcome");
//		StringBuffer sb=(StringBuffer) o;        //Rule 1 - yes, Rule 2- yes, Rule 3- invalid
		
		//Ex-7
		Object o=new String("welcome");
		String s=(String) o;                  //Rule 1 - yes, Rule 2-yes,     Rule 3-yes.
		
		System.out.println(s);
		
		
		
		
		
		

	}

}
