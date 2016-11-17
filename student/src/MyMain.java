import java.util.ArrayList;
import java.util.Collections;
public class MyMain 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		Student student0 = new Student("5", "a", 3);
		String s0 =student0.toString();
		list.add(s0);
		Student student1 = new Student("3", "b", 2);
		String s1 =student1.toString();
		list.add(s1);
		Student student2 = new Student("8", "c", 1);
		String s2 =student2.toString();
		list.add(s2);
		Student student3 = new Student("1", "d", 5);
		String s3 =student3.toString();
		list.add(s3);
		Student student4 = new Student("4", "e", 5);
		String s4 =student4.toString();
		list.add(s4);
		//保证每行只输出一位学生信息
		for (int i = 0; i < list.size(); i++)
		{
			if (i%1 == 0) 
			{
				System.out.println();
			}
			System.out.print(list.get(i) + ",");
		}
		//排序
		Collections.sort(list);
		System.out.println("\n排序结果");
		for (int i = 0; i < list.size(); i++)
		{
			if (i%1 == 0) 
			{
				System.out.println();
			}
			System.out.print(list.get(i) + ",");
		}
		
		
	}

}
