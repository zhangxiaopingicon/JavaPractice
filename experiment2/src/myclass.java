
public class myclass
{

	public static void main(String[] args)
	{
		rectangle re = new rectangle();
		re.name();
		int a1 = re.area(1,2);
		System.out.println("�����ε������"+a1);
		int p1 = re.perimeter(1, 2);
		System.out.println("�����ε��ܳ���"+p1);
		trangle tr = new trangle();
		tr.name();
		int a2 = tr.area(3, 4);
		System.out.println("�����ε������"+a2);
		int p2 = tr.perimeter(3, 4, 5);
		System.out.println("�����ε��ܳ���"+p2);
	}

}
