import java.util.Scanner;


public class Year
{
	public void leapYear() 
	{
		Scanner scanner = new Scanner(System.in);
		System.err.println("请输入年份");
		int year = scanner.nextInt();
		if ((year%4 == 0)&&(year%100 != 0)||(year%400 == 0))
		{
			System.out.println("本年是闰年");
		}
		else 
		{
		System.out.println("本年不是闰年");
			
		}
	}

}
