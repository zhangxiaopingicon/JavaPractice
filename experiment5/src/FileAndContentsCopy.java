import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileAndContentsCopy
{
	//fileFrom为要复制的文件路径及文件名，fileTo为复制的目标地址
	public void copyFile(String fileFrom, String fileTo)
	{
		try
		{
			File file1 = new File(fileFrom);
			File file2 = new File(fileTo);
			InputStream is = new BufferedInputStream(new FileInputStream(file1));
			OutputStream os = new BufferedOutputStream(new FileOutputStream(file2));
			is.available();
			byte byteArray[] = new byte[1024];//大小可调
			int count = -1;
			while((count = is.read(byteArray)) != -1)
			{
				os.write(byteArray, 0, count);
			}
			os.flush();
			is.close();
			os.close();
			System.out.println("成功复制文件");
		}
		catch (Exception e)
		{
			System.out.println("文件复制失败原因如下" + e);
		}
	}
}
