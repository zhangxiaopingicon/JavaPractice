import java.util.Scanner;
public class numberInputAndOutput 
{
	public void sumAndAverage()
	{
		System.out.println("请输入数字");
		Scanner scanner = new Scanner(System.in);
		double sum = 0;//求和
		double number = 0;//输入的数据
		double average = 0;//平均值
		int i = 0;//计数
		while (scanner.hasNextDouble()) 
		{
			number = scanner.nextDouble();
			sum = sum + number;
			i = i + 1;
		}
		average = sum / i;
		System.out.println("和是："+sum);
		System.out.println("平均数是："+average);
	}
	
}
