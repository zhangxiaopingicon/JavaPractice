
public class rectangle extends myshape
{

	//长方形
	public void name() 
	{
		System.out.println("这是长方形");
	}
	public int area(int a,int b)
	{
		return a*b;
	}
	public int perimeter(int a,int b)
	{
		int c;
		c = (a+b)*2;
		return c;
	}
}
