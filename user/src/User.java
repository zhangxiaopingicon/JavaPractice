import java.util.Scanner;


public class User
{
	String userName = "000";
	private String password = "000";
	private String newPassword;
	static int userNumber;
	public User()
	{
		
	}
	public User(String user)
	{
		
	}
	public User(String user,String password)
	{
		
	}
	public String getAndSetPassword()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		newPassword = sc.next();
		sc.close();
		return newPassword;
	}
	public String information() 
	{
		String infor;
		infor ="�û���:"+userName+"ԭ���룺"+password+"�����룺"+newPassword;
		System.out.println(infor);
		return infor;
	}
}










