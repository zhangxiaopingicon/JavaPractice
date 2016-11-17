public class MyMain
{
	public static void main(String[] args) 
	{
	    FileDlt hfc = new FileDlt(); 
	    //将要删除的文件的地址
	    String path = "D:\\Abc\\124";  
	    boolean result = hfc.DeleteFolder(path);  
	    System.out.println(result);  

		
		
	}

}
