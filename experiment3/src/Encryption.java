import java.util.Scanner;
public class Encryption 
{
	public void encry() 
	{
		//异或加密
		System.out.println("请输入字符串：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();	
        	char[]array=string.toCharArray();//获取字符数组  
       	 	for(int i=0;i<array.length;i++)//遍历字符数组  
        	{  
            		array[i]=(char)(array[i] ^ 20140908);//对每个数组元素进行异或运算，异或的值可以自己选择  
       		 }  
        	System.out.println("加密或者解密结果如下：");  
        	System.out.println(new String(array));//输出加密或者解密结果 
		scanner.close();
		
	}

}
