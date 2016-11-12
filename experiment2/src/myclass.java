
public class myclass
{

	public static void main(String[] args)
	{
		rectangle re = new rectangle();
		re.name();
		int a1 = re.area(1,2);
		System.out.println("长方形的面积是"+a1);
		int p1 = re.perimeter(1, 2);
		System.out.println("长方形的周长是"+p1);
		trangle tr = new trangle();
		tr.name();
		int a2 = tr.area(3, 4);
		System.out.println("三角形的面积是"+a2);
		int p2 = tr.perimeter(3, 4, 5);
		System.out.println("三角形的周长是"+p2);
	}

}
