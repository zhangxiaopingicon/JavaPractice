import java.util.Scanner;
public class Encryption 
{
	public void encry() 
	{
<<<<<<< HEAD
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
=======
		//寮傛垨鍔犲瘑
		System.out.println("璇疯緭鍏ュ瓧绗︿覆锛�");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();	
        	char[]array=string.toCharArray();//鑾峰彇瀛楃鏁扮粍  
       	 	for(int i=0;i<array.length;i++)//閬嶅巻瀛楃鏁扮粍  
        	{  
            		array[i]=(char)(array[i] ^ 20140908);//瀵规瘡涓暟缁勫厓绱犺繘琛屽紓鎴栬繍绠楋紝寮傛垨鐨勫�煎彲浠ヨ嚜宸遍�夋嫨  
       		 }  
        	System.out.println("鍔犲瘑鎴栬�呰В瀵嗙粨鏋滃涓嬶細");  
        	System.out.println(new String(array));//杈撳嚭鍔犲瘑鎴栬�呰В瀵嗙粨鏋� 
>>>>>>> 654426f2676de07366f6080087d5e1e7ffbfd16c
		scanner.close();
		
	}

}
