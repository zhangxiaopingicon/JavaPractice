@SuppressWarnings("rawtypes")//����ʾ����
public class Student implements Comparable
{
	String number;
	String name;
	int mark;
	public Student ()
	{
		
	}
	public Student(String num,String na,int ma)
	{
		number = num;
		name = na;
		mark = ma;
	}
	public String toString() 
	{
		String s;
		s = "ѧ�ţ�"+number+","+"������"+name+","+"�ɼ���"+mark;
		return s;
	}
	
	public int compareTo(Object object)
	{
		Student ss = (Student)object;
		int result = mark<ss.mark?1:(mark == ss.mark?0:-1);
		if (result == 0) 
		{
			result = name.compareTo(ss.name);
		}
		return result;
	}
	

}
