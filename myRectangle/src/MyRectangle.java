
public class MyRectangle 
{
	int xUp;
	int yUp;
	int xDown;
	int yDown;
	public MyRectangle() 
	{
		
	}
	public  MyRectangle(int a,int b,int c,int d)
	{
		int xUp = a;
		int yUp = b;
		int xDown = c;
		int yDown = d;
		System.out.println(xUp+","+yUp+","+xDown+","+yDown);
	}	
	public int getW() 
	{
		return xDown - xUp;
	}
	public int getH()
	{
		return yUp - yDown;
	}
	public int area()
	{
		int x;
		int y;
		x = xDown - xUp;
		y = yUp - yDown; 
		return x * y;
	}
	public String name() 
	{
		int w;
		int h;
		int ar;
		w = getW();
		h = getH();
		ar = area();
		String wString;
		String hString;
		String arString;
		wString = Integer.toString(w);
		hString = Integer.toString(h);
		arString = Integer.toString(ar);
		return wString+","+hString+","+arString;
	}


}

















