package Day19;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Upcasting-   Converting value from smaller ----->  larger  (automatically)

//int ---> long
//float --->

//Downcasting -  Converting value from larger ----->  smaller (need to do manually)
//long ---> int
//double ---> float


public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting-   Converting value from smaller ----->  larger  
		
//		int intvalue=100;
//		long longvalue=intvalue;
//		System.out.println(longvalue);

//		float f=10.5f;
//		double d=f;
//		System.out.println(d);
		
		
		//Downcasting -  Converting value from larger ----->  smaller (need to do manually)
		
//		long l=10000;
//		int i=(int)l;
//		System.out.println(i);
//		
//		
//		double d=125.525;
//		float f=(float)d;
//		System.out.println(f);
//		
		
		
		//example 1
//		int i=100;
//		double d=i;            //upcasting
//		System.out.println(d); 
		
		
		//example2
		double d=10.5;
		int i=(int)d;        //downcasting
		System.out.println(i);
		
		
		
		
	}

}
