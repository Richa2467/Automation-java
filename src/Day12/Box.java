package Day12;

public class Box {
	
	double width,hight,depth;
	
	Box()          //1
	{
		width=0;
		hight=0;
		depth=0;
		
	}
   
	Box(double w, double h, double d)            //2
	{
		width=w;
		hight=h;
		depth=d;
		
		
	}
	Box(double len)            //2
	{
		width=hight=depth=len;
		
		
	}
	
	
	double volumn()
	{
		return width*hight*depth;
	}
	
	
}
