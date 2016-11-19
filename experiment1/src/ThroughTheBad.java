
public class ThroughTheBad
{
	public void circular()
	{
		System.out.println("forÑ­»µ¾ÙÀı");
		for (int i = 0; i <3; i++) 
		{
			System.out.println(i);
		}
		System.out.println("whileÑ­»µ¾ÙÀı");
		int n = 1;
		while (n < 3&& n>0)
		{
			System.out.println(n);
			n++;
		}
		System.out.println("do...whileÑ­»µ¾ÙÀı");
		int m = 1;
		do 
		{
			System.out.println(m);
			m++;
		} 
		while (n < 3&& n>0);
	}

}
