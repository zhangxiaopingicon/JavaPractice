import java.util.Scanner;
public class Encryption 
{
	public void encry() 
	{
<<<<<<< HEAD
		//Òì»ò¼ÓÃÜ
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();	
        char[]array=string.toCharArray();//»ñÈ¡×Ö·ûÊý×é  
        for(int i=0;i<array.length;i++)//±éÀú×Ö·ûÊý×é  
        {  
            array[i]=(char)(array[i] ^ 20140908);//¶ÔÃ¿¸öÊý×éÔªËØ½øÐÐÒì»òÔËËã£¬Òì»òµÄÖµ¿ÉÒÔ×Ô¼ºÑ¡Ôñ  
        }  
        System.out.println("¼ÓÃÜ»òÕß½âÃÜ½á¹ûÈçÏÂ£º");  
        System.out.println(new String(array));//Êä³ö¼ÓÃÜ»òÕß½âÃÜ½á¹û 
=======
		//å¼‚æˆ–åŠ å¯†
		System.out.println("è¯·è¾“å…¥å­—ç¬¦ä¸²ï¼š");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();	
        	char[]array=string.toCharArray();//èŽ·å–å­—ç¬¦æ•°ç»„  
       	 	for(int i=0;i<array.length;i++)//éåŽ†å­—ç¬¦æ•°ç»„  
        	{  
            		array[i]=(char)(array[i] ^ 20140908);//å¯¹æ¯ä¸ªæ•°ç»„å…ƒç´ è¿›è¡Œå¼‚æˆ–è¿ç®—ï¼Œå¼‚æˆ–çš„å€¼å¯ä»¥è‡ªå·±é€‰æ‹©  
       		 }  
        	System.out.println("åŠ å¯†æˆ–è€…è§£å¯†ç»“æžœå¦‚ä¸‹ï¼š");  
        	System.out.println(new String(array));//è¾“å‡ºåŠ å¯†æˆ–è€…è§£å¯†ç»“æžœ 
>>>>>>> 654426f2676de07366f6080087d5e1e7ffbfd16c
		scanner.close();
		
	}

}
