//ͨ��ʵ��runnable�ӿ����������߳�
public class MutliThread1 implements Runnable
{
	private int ticket = 10;
	private String name;
	MutliThread1(String name)
	{
		this.name = name;
	}
	public void run()
	{
		while (ticket>0)
		{
			System.out.println(ticket--+"is saled by "+name);
		}
	}
}
