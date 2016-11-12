import java.util.Scanner;
import java.lang.String;
public class myclass {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("请输入数字");
		int a;//接收数字
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		if (a<10000&&a>0) 
		{
			String c;
			c = Integer.toString(a);//类型强转
//			c = String.valueOf(a); //类型强转方法二
//			c = a + "";//类型强转方法三
			int l;//字符串长度
			l = c.length();
			System.out.println("数字的位数是："+l);
			int bnum = a;
			int s = 0;//倒置数字
			int mod;//余数
			while (bnum!=0)
			{
				mod = bnum % 10;
				s= s *10 + mod;
				bnum = bnum / 10;
			}
			if (s == a)
			{
				System.out.println("是回文数");
			}
			else
			{
				System.out.println("不是回文数");
			}
		}
		else
		{
			
		}
		scanner.close();
		return;
	}

}
