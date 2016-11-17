import java.util.Hashtable;
public class MyMain 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Hashtable mytable = new Hashtable();
		Student student0 = new Student("5", "a", 3);
		String s0 = student0.toString();
		mytable.put("5", s0);//存放键-值对
		Student student1 = new Student("3", "b", 2);
		String s1 =student1.toString();
		mytable.put("3", s1);
		Student student2 = new Student("8", "c", 1);
		String s2 =student2.toString();
		mytable.put("8", s2);
		Student student3 = new Student("1", "d", 5);
		String s3 =student3.toString();
		mytable.put("1", s3);
		Student student4 = new Student("4", "e", 5);
		String s4 =student4.toString();
		mytable.put("4", s4);
		System.out.println("结果如下：");
		//保证每行只输出一位学生信息
		String string0 = (String) mytable.get("5");
		String string1 = (String) mytable.get("3");
		String string2 = (String) mytable.get("8");
		String string3 = (String) mytable.get("1");
		String string4 = (String) mytable.get("4");
		System.out.println(string0);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);

		//完全搞不懂为什么
//		Iterator it = mytable.iterator();
//
//		while (it.hasNext()) {
//		    Integer key = (Integer)it.next();
//		    
//		System.out.println(key);
//		}
		//或者是
//		String str=mytable.get(1);//为毛get方法里的参数不能是int型，你到底要我怎样？？？
		
		
		
	}

}
