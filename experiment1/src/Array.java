import java.util.ArrayList;
import java.util.Scanner;


public class Array 
{
	public void aboutArray()
	{	System.out.println("请输入数组，");
		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (scanner.hasNext()) 
        {
            int number = scanner.nextInt();
            if (number == -1) 
            {
                break;
            } 
            else 
            {
                a.add(number);
            }
        }
        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }
		System.out.println("数组长度："+a.size());
	}
}
