import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateCount
{
	public void countDate() throws ParseException 
	{
		//时间转换类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("1931-9-18");//解析一个包含日期的字符串
        Date date2 = sdf.parse("1945-8-15");
        //将转换的两个时间对象转换成Calendard对象
        Calendar can1 = Calendar.getInstance();//需要的时候再初始化
        can1.setTime(date1);
        Calendar can2 = Calendar.getInstance();
        can2.setTime(date2);
        //拿出两个年份
        int year1 = can1.get(Calendar.YEAR);
        int year2 = can2.get(Calendar.YEAR);
        //天数
        int days = 0;
        Calendar can = null;
        //如果can1 < can2
        //减去小的时间在这一年已经过了的天数
        //加上大的时间已过的天数
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
            //获取小的时间当前年的总天数
            days += can.getActualMaximum(Calendar.DAY_OF_YEAR);
            //再计算下一年。
            can.add(Calendar.YEAR, 1);
        }
        System.out.println("天数差："+days);
    } 
	

}
