public class MyMain 
{
	public static void main(String[] args) 
	{
		//ͨ����չThread���������߳�
		MutliThread m1 = new MutliThread("Window1");
		MutliThread m2 = new MutliThread("Window2");
		MutliThread m3 = new MutliThread("Window3");
		m1.start();
		m2.start();
		m3.start();
		//ͨ��ʵ��runnable�ӿ����������߳�
		MutliThread1 n1 = new MutliThread1("W1");
		MutliThread1 n2 = new MutliThread1("W2");
		MutliThread1 n3 = new MutliThread1("W3");
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n2);
		Thread t3 = new Thread(n3);
		t1.start();
		t2.start();
		t3.start();
		
		

	}
}