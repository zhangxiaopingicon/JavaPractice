import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileAndContentsCopy
{
	//fileFromΪҪ���Ƶ��ļ�·�����ļ�����fileToΪ���Ƶ�Ŀ���ַ
	public void copyFile(String fileFrom, String fileTo)
	{
		try
		{
			File file1 = new File(fileFrom);
			File file2 = new File(fileTo);
			InputStream is = new BufferedInputStream(new FileInputStream(file1));
			OutputStream os = new BufferedOutputStream(new FileOutputStream(file2));
			is.available();
			byte byteArray[] = new byte[1024];//��С�ɵ�
			int count = -1;
			while((count = is.read(byteArray)) != -1)
			{
				os.write(byteArray, 0, count);
			}
			os.flush();
			is.close();
			os.close();
			System.out.println("�ɹ������ļ�");
		}
		catch (Exception e)
		{
			System.out.println("�ļ�����ʧ��ԭ������" + e);
		}
	}
}
