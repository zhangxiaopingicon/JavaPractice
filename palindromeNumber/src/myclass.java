import java.util.Scanner;
import java.lang.String;
public class myclass {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("����������");
		int a;//��������
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		if (a<10000&&a>0) 
		{
			String c;
			c = Integer.toString(a);//����ǿת
//			c = String.valueOf(a); //����ǿת������
//			c = a + "";//����ǿת������
			int l;//�ַ�������
			l = c.length();
			System.out.println("���ֵ�λ���ǣ�"+l);
			int bnum = a;
			int s = 0;//��������
			int mod;//����
			while (bnum!=0)
			{
				mod = bnum % 10;
				s= s *10 + mod;
				bnum = bnum / 10;
			}
			if (s == a)
			{
				System.out.println("�ǻ�����");
			}
			else
			{
				System.out.println("���ǻ�����");
			}
		}
		else
		{
			
		}
		scanner.close();
		return;
	}

}
