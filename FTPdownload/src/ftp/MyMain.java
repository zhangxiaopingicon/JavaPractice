package ftp;
public class MyMain 
{
	public static void main(String[] args) 
	{
		//上传文件  
        upload();  
        //下载文件  
        download();  
        //创建文件夹  
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


