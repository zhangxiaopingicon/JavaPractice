import java.util.Scanner;
public class Encryption 
{
	public void encry() 
	{
		//������
		System.out.println("�������ַ�����");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();	
        char[]array=string.toCharArray();//��ȡ�ַ�����  
        for(int i=0;i<array.length;i++)//�����ַ�����  
        {  
            array[i]=(char)(array[i] ^ 20140908);//��ÿ������Ԫ�ؽ���������㣬����ֵ�����Լ�ѡ��  
        }  
        System.out.println("���ܻ��߽��ܽ�����£�");  
        System.out.println(new String(array));//������ܻ��߽��ܽ�� 
		scanner.close();
		
	}

}
