package Day7;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		int a[]= {10,2,34,11,9,8,13};
		
	    int	ele=11;
	    boolean status=false;

	    
	    for(int i=0; i<a.length; i++)
	    {
	    	if(ele==a[i])
	    	{
	    		System.out.println(ele+ "is found at index  "+i);
	    		status=true;
	    		break;
	    	}
	    	
	      }
	    
	      if(status==false)
	      {
	      System.out.println("Element not found");
	       }
	    	
	    }

}


