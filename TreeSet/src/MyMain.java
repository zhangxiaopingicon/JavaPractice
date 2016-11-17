import java.util.Iterator;
import java.util.TreeSet;

public class MyMain
{
	public static void main(String[] args)
	{
		
		TreeSet <Student> treeSet = new TreeSet <Student> ();
		Student student0 = new Student("5", "a", 36);
		Student student1 = new Student("3", "b", 28);
		Student student2 = new Student("8", "c", 71);
		Student student3 = new Student("1", "d", 50);
		Student student4 = new Student("4", "e", 84);
		treeSet.add(student0);
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		//±éÀúÁ´±í
        Iterator<Student> it = treeSet.iterator();
        while (it.hasNext()) 
        {
           System.out.println(it.next());
        }
		
		
		
		
	}

}
