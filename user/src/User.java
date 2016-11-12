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
		System.out.println("请输入新密码");
		newPassword = sc.next();
		sc.close();
		return newPassword;
	}
	public String information() 
	{
		String infor;
		infor ="用户名:"+userName+"原密码："+password+"新密码："+newPassword;
		System.out.println(infor);
		return infor;
	}
}










