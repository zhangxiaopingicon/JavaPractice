//ͨ����չThread���������߳�
public class MutliThread extends Thread
{
	//ÿ���̶߳���10����Ʊ
	private int ticket = 10;
	MutliThread(String name)
	{
		super(name);//���õĸ���Ĵ������Ĺ��췽��
	}
	public void run()
	{
		while (ticket>0)
		{
			System.out.println(ticket--+"is saled by "+Thread.currentThread().getName());
		}
	}
}
