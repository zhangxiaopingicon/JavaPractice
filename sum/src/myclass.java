
public class myclass {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i < 100; i++) 
		{
			sum = sum + i;
			System.out.print(i+"+");
		}
		System.out.println("100"+"=");
		sum =sum + 100;
		System.out.println(sum);

	}

}
