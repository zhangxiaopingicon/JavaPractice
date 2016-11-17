public class myclass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	 	double a = fibonacci(99);
	 	double b = fibonacci(100);
	 	double c = a/b;
	 	System.out.println(c);
	 	return;
	}
	public static int fibonacci (int n)
	{
		if (n<=2)
		{
			return 1;
		}
		else
		{
			return fibonacci (n-1)+fibonacci (n-2);
		}
	}

}
