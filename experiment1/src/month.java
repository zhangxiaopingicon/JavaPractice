import java.util.Scanner;


public class month 
{	
	public void judgmentSeason()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month = scanner.nextInt();
		switch (month) 
		{
		case 1:
		System.out.println("����");
			break;
		case 2:
		System.out.println("����");
			break;
		case 3:
		System.out.println("����");
			break;
		case 4:
		System.out.println("�ļ�");
			break;
		case 5:
		System.out.println("�ļ�");
			break;
		case 6:
		System.out.println("�ļ�");
			break;
		case 7:
		System.out.println("�＾");
			break;
		case 8:
		System.out.println("�＾");
			break;
		case 9:
		System.out.println("�＾");
			break;
		case 10:
		System.out.println("����");
			break;
		case 11:
		System.out.println("����");
			break;
		case 12:
		System.out.println("����");
			break;
		default:
			break;
		}
	}

}
