package ftp;
public class MyMain 
{
	public static void main(String[] args) 
	{
		//�ϴ��ļ�  
        upload();  
        //�����ļ�  
        download();  
        //�����ļ���  
        mkdir(); 
	}
    private static void mkdir() {  
    	FtpClientUtil clientUtil=new FtpClientUtil();  
        clientUtil.mkdir("test");  
    }  
    private static void download() {  
        String remoteFileName="./111.txt";  
        String locaFileName="G:\\test\\txt\\3333.txt";  
        FtpClientUtil clientUtil=new FtpClientUtil();  
        clientUtil.download(remoteFileName, locaFileName);  
    }  
    private static void upload() {  
        String remoteFileName="./111.txt";  
        String locaFileName="G:\\test\\txt\\aaa.txt";  
        FtpClientUtil clientUtil=new FtpClientUtil();  
        clientUtil.upload(remoteFileName, locaFileName);  
    }  
}  


