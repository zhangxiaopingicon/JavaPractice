import java.util.Scanner;
public class InputOutput
{
	public void inputOutput() 
	{
		//���ݵ�����
		System.out.println("����������");
		double a;//������������
		double sum = 0;
		double average;
		int i = 0;//��������
		Scanner scanner = new Scanner(System.in);
		//Ĭ���Կո����
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
