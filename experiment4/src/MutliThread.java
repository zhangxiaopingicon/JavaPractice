//通过扩展Thread类来创建线程
public class MutliThread extends Thread
{
	//每个线程都有10张门票
	private int ticket = 10;
	MutliThread(String name)
	{
		super(name);//调用的父类的带参数的构造方法
	}
	public void run()
	{
		while (ticket>0)
		{
			System.out.println(ticket--+"is saled by "+Thread.currentThread().getName());
		}
	}
}
