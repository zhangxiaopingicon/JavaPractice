
public class trangle extends myshape
{
	//三角形
	public void name() 
	{
		System.out.println("这是三角形");
	}
	//默认a,h分别是底边和周长
	public int area(int a,int h)
	{
		int s;
		s = a*h/2;
		return s;
	}
	public int perimeter(int a,int b,int c)
	{
		return a+b+c;
	}

}
