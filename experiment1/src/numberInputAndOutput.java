import java.util.Scanner;
public class numberInputAndOutput 
{
	public void sumAndAverage()
	{
		System.out.println("����������");
		Scanner scanner = new Scanner(System.in);
		double sum = 0;//���
		double number = 0;//���������
		double average = 0;//ƽ��ֵ
		int i = 0;//����
		while (scanner.hasNextDouble()) 
		{
			number = scanner.nextDouble();
			sum = sum + number;
			i = i + 1;
		}
		average = sum / i;
		System.out.println("���ǣ�"+sum);
		System.out.println("ƽ�����ǣ�"+average);
	}
	
}
