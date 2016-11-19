import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateCount
{
	public void countDate() throws ParseException 
	{
		//ʱ��ת����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("1931-9-18");//����һ���������ڵ��ַ���
        Date date2 = sdf.parse("1945-8-15");
        //��ת��������ʱ�����ת����Calendard����
        Calendar can1 = Calendar.getInstance();//��Ҫ��ʱ���ٳ�ʼ��
        can1.setTime(date1);
        Calendar can2 = Calendar.getInstance();
        can2.setTime(date2);
        //�ó��������
        int year1 = can1.get(Calendar.YEAR);
        int year2 = can2.get(Calendar.YEAR);
        //����
        int days = 0;
        Calendar can = null;
        //���can1 < can2
        //��ȥС��ʱ������һ���Ѿ����˵�����
        //���ϴ��ʱ���ѹ�������
        if(can1.before(can2)){
            days -= can1.get(Calendar.DAY_OF_YEAR);
            days += can2.get(Calendar.DAY_OF_YEAR);
            can = can1;
        }else{
            days -= can2.get(Calendar.DAY_OF_YEAR);
            days += can1.get(Calendar.DAY_OF_YEAR);
            can = can2;
        }
        for (int i = 0; i < Math.abs(year2-year1); i++) {
            //��ȡС��ʱ�䵱ǰ���������
            days += can.getActualMaximum(Calendar.DAY_OF_YEAR);
            //�ټ�����һ�ꡣ
            can.add(Calendar.YEAR, 1);
        }
        System.out.println("�����"+days);
    } 
	

}
