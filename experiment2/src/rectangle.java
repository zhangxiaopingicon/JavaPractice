
public class rectangle extends myshape
{

	//������
	public void name() 
	{
		System.out.println("���ǳ�����");
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
