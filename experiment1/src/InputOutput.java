import java.util.Scanner;
public class InputOutput
{
	public void inputOutput() 
	{
		//数据的输入
		System.out.println("请输入数字");
		double a;//用来接收数字
		double sum = 0;
		double average;
		int i = 0;//用来计数
		Scanner scanner = new Scanner(System.in);
		//默认以空格结束
		while (scanner.next()!=" ")
		{
			a = scanner.nextDouble();
			sum = sum + a;
			i = i + 1;
		}
		average = sum / i;
		System.out.println(average);
		System.out.println(sum);
		scanner.close();
	
		
	}	
}
