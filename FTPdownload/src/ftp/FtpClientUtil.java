package ftp;
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.io.PrintWriter;  
import java.net.ConnectException;  
import org.apache.commons.net.PrintCommandListener;  
import org.apache.commons.net.ftp.FTP;  
import org.apache.commons.net.ftp.FTPClient;  
import org.apache.commons.net.ftp.FTPReply;  
 
public class FtpClientUtil {  
    /** 
     * ftp��������ַ 
     */  
    private  String server;  
    /** 
     * �˿� 
     */  
    private  int port;  
    /** 
     * �û��� 
     */  
    private  String username;  
    /** 
     *  
     */  
    private  String password;  
      
    public FtpClientUtil () {  
        server = "localhost";  
        port = 21;  
        username = "kun";  
        password = "111111";  
    }  
      
    public FtpClientUtil(String server, int port, String username,  
            String password) {  
        this.server = server;  
        this.port = port;  
        this.username = username;  
        this.password = password;  
    }  
    /**�ϴ��ļ� 
     * @param remoteFileName Զ���ļ����� 
     * @param locaFileName �����ļ����� 
     */  
    public void upload(String remoteFileName,String locaFileName){  
        FTPClient ftp=null;   
        try {  
            ftp = new FTPClient();  
            ftp.addProtocolCommandListener( new PrintCommandListener( new PrintWriter( System.out ), true ) );  
            //����ftp������  
            connect( ftp );  
            //��������  
            setProperty( ftp );  
            //�ϴ��ļ�  
            upload( ftp, remoteFileName, locaFileName );  
            //�˳�  
            logout( ftp );  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally {  
            if (ftp.isConnected()) {  
                try {  
                    ftp.disconnect();  
                } catch (IOException f) {  
                }  
            }  
        }  
          
    }  
    /**�ϴ��ļ� 
     * @param remoteFileName Զ���ļ����� 
     * @param locaFileName �����ļ����� 
     */  
    public void download(String remoteFileName,String locaFileName){  
        FTPClient ftp=null;   
        try {  
            ftp = new FTPClient();  
            ftp.addProtocolCommandListener( new PrintCommandListener( new PrintWriter( System.out ), true ) );  
            //����ftp������  
            connect( ftp );  
            //��������  
            setProperty( ftp );  
            //�����ļ�  
            download( ftp, remoteFileName, locaFileName );  
            //�˳�  
            logout( ftp );  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally {  
            if (ftp.isConnected()) {  
                try {  
                    ftp.disconnect();  
                } catch (IOException f) {  
                }  
            }  
        }  
    }  
    /**�����ļ��� 
     * @param remotePathName Զ���ļ������� 
     */  
    public void mkdir(String remotePathName) {  
        FTPClient ftp=null;   
        try {  
            ftp = new FTPClient();  
            ftp.addProtocolCommandListener( new PrintCommandListener( new PrintWriter( System.out ), true ) );  
            //����ftp������  
            connect( ftp );  
            //��������  
            setProperty( ftp );  
            //�����ļ���  
            mkdir( ftp, remotePathName);  
            //�˳�  
            logout( ftp );  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally {  
            if (ftp.isConnected()) {  
                try {  
                    ftp.disconnect();  
                } catch (IOException f) {  
                }  
            }  
        }  
    }  
    /** 
     * @param ftp 
     * @param remotePathName 
     */  
    private void mkdir(FTPClient ftp, String remotePathName) throws Exception{  
        ftp.makeDirectory(remotePathName);  
    }  
  
    /** 
     * @param ftp 
     * @param remoteFileName 
     * @param locaFileName 
     */  
    private void download(FTPClient ftp, String remoteFileName,  
            String locaFileName) throws Exception{  
        OutputStream output=null;  
        output = new FileOutputStream(locaFileName);  
        ftp.retrieveFile(remoteFileName, output);   
        output.close();  
    }  
  
    /** 
     * @param ftp 
     * @throws Exception  
     */  
    private void setProperty(FTPClient ftp) throws Exception {  
        ftp.enterLocalPassiveMode();  
        //�����ƴ���,Ĭ��ΪASCII  
        ftp.setFileType(FTP.BINARY_FILE_TYPE);  
    }  
  
    /** 
     * @param ftp 
     */  
    private void logout(FTPClient ftp) throws Exception{  
        ftp.noop();  
        ftp.logout();  
    }  
  
    /** 
     * @param ftp 
     * @param remoteFileName 
     * @param locaFileName 
     */  
    private void upload(FTPClient ftp, String remoteFileName,  
            String locaFileName) throws Exception{  
        //�ϴ�  
        InputStream input;  
  
        input = new FileInputStream(locaFileName);  
  
        ftp.storeFile(remoteFileName, input);  
  
        input.close();  
    }  
  
    /** 
     * @param ftp 
     */  
    private void connect(FTPClient ftp) throws Exception{  
        //���ӷ�����  
        ftp.connect( server, port);  
        int reply = ftp.getReplyCode();  
        //�Ƿ����ӳɹ�  
        if ( !FTPReply.isPositiveCompletion( reply ) )         {  
            throw new ConnectException( server+" �������ܾ�����" );  
        }  
        //��½  
        if (!ftp.login(username, password)) {  
             throw new ConnectException( "�û������������" );  
        }  
    }  
}  
