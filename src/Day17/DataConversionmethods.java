package Day17;

public class DataConversionmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String---->int
		
//		String s="welcome";                    //can not convert to int
		
//		String s1="14";
//		String s2="12";
//		
//	System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	
	
	
	//String ---->double
		String s1="14";
		String s2="12";
    System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));	



    //String ----->Boolean
       String s="WELCOME";
    System.out.println(Boolean.parseBoolean(s));
    
    //String ----> char           not [possible.
    
    
    //int,double,bool,char  ---------> String
    int a=10;
    double d=10.5;
    char c='A';
    boolean bool=true;
    
    
    
    System.out.println(String.valueOf(a));
    System.out.println(String.valueOf(d));
    System.out.println(String.valueOf(c));
    System.out.println(String.valueOf(bool));
    
    
    

	}

}
