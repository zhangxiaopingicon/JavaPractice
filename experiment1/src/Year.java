import java.util.Scanner;


public class Year
{
	public void leapYear() 
	{
		Scanner scanner = new Scanner(System.in);
		System.err.println("���������");
		int year = scanner.nextInt();
		if ((year%4 == 0)&&(year%100 != 0)||(year%400 == 0))
		{
			System.out.println("����������");
		}
		else 
		{
		System.out.println("���겻������");
			
		}
	}

}
