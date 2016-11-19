public class MyMain 
{
	public static void main(String[] args) 
	{
		//通过扩展Thread类来创建线程
		MutliThread m1 = new MutliThread("通过扩展Thread类来创建线程"+"Window1");
		MutliThread m2 = new MutliThread("通过扩展Thread类来创建线程"+"Window2");
		MutliThread m3 = new MutliThread("通过扩展Thread类来创建线程"+"Window3");
		m1.start();
		m2.start();
		m3.start();
		//通过实现runnable接口来创建多线程
		MutliThread1 n1 = new MutliThread1("通过实现runnable接口来创建多线程"+"W1");
		MutliThread1 n2 = new MutliThread1("通过实现runnable接口来创建多线程"+"W2");
		MutliThread1 n3 = new MutliThread1("通过实现runnable接口来创建多线程"+"W3");
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n2);
		Thread t3 = new Thread(n3);
		t1.start();
		t2.start();
		t3.start();
		
		

	}
}