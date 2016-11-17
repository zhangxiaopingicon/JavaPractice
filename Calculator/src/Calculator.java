import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame
{
    private String front = "", behind = ""; //分别用于记录加减乘除运算符之前,之后输入的内容
    private String op; //用于记录运算符
    private String re;//用于存储运算结果的字符串格式
    private boolean flag = false; //用于记录是否按下了运算符
    private boolean flag1 = false;//用于判断是否输入了点运算符
    private double result;//用于存储运算结果
    private boolean flag2 = false;//用于判断是否输入了数字
    private boolean flag3 = false;//用于判断是否按下了等号运算符
	//实例化面板对象，承接各种JTextField
	JPanel contentPaneTxt = new JPanel(new GridLayout(2, 1, 3, 3));
	//实例化面板对象，承接各种button
	JPanel contentPaneBtn = new JPanel(new GridLayout(5, 4, 3, 3));
    //定义输入框
    JTextField txtshow = new JTextField("0");
    //结果显示框
    JTextField txtResult = new JTextField(" ");
    String str[]={"C","+/-","←","+","7","8","9","-","4","5","6","*","1","2","3","/",".","0","%","=",};
    public Calculator ()
    {
    	super("计算器");
    	//将文本框添加给面板contentPaneBtn
    	contentPaneTxt.add(txtshow);
    	contentPaneTxt.add(txtResult);
    	JButton btn[]; //声明按钮数组
        btn=new JButton[str.length];//创建按钮数组
        //循环定义按钮，并添加到面板中
        for(int i=0;i<str.length;i++)
        {
        	btn[i]=new JButton(str[i]);
        	contentPaneBtn.add(btn[i]);
        }
        this.setLayout(new BorderLayout());
        this.add(contentPaneTxt,BorderLayout.CENTER);
        this.add(contentPaneBtn,BorderLayout.SOUTH);        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//让窗体居中显示
//        this.setSize(500, 800);
//        this.setResizable(false);
//    	Container container = this.getContentPane();
//    	container.setLayout(null);
//    	container.add(contentPaneTxt);
//    	container.add(contentPaneBtn);
//    	contentPaneTxt.setBounds(0,0,400,80);
//    	contentPaneBtn.setBounds(0, 80, 400, 350);
////    	container.setBounds(0, 0, 500, 800);
//    	//container.validate();
        //添加监听事件
        //清零
        btn[0].addActionListener(new btnBeginActionAdapter(this));
        //回退
        btn[2].addActionListener(new btnCancelActionAdapter(this));
        //数字0-9
        btn[17].addActionListener(new btnZeroActionAdapter(this));
        btn[12].addActionListener(new btnZeroActionAdapter(this));
        btn[13].addActionListener(new btnZeroActionAdapter(this));
        btn[14].addActionListener(new btnZeroActionAdapter(this));
        btn[8].addActionListener(new btnZeroActionAdapter(this));
        btn[9].addActionListener(new btnZeroActionAdapter(this));
        btn[10].addActionListener(new btnZeroActionAdapter(this));
        btn[4].addActionListener(new btnZeroActionAdapter(this));
        btn[5].addActionListener(new btnZeroActionAdapter(this));
        btn[6].addActionListener(new btnZeroActionAdapter(this));
        //"+/-"
        btn[1].addActionListener(new btnMinusActionAdapter(this));
        //点号
        btn[16].addActionListener(new btnPointActionAdapter(this));
        //等号
        btn[19].addActionListener(new btnEqualActionAdapter(this));
        //加减乘除
        btn[3].addActionListener(new btnIncreaseActionAdapter(this));
        btn[7].addActionListener(new btnIncreaseActionAdapter(this));
        btn[11].addActionListener(new btnIncreaseActionAdapter(this));
        btn[15].addActionListener(new btnIncreaseActionAdapter(this));
        

    }

    //退格事件处理方法
    public void btnCancel_actionPerformed(ActionEvent e) 
    {
    	String str=txtshow.getText();
        if(str.length() == 1)
        {//如文本框中只剩下最后一个字符,将文本框内容置为0
        	txtshow.setText("0");
        }
        if(str.length()>1)
        {
            str=str.substring(0,str.length()-1);
            txtshow.setText(str);
        }
	}
    //取反运算符
    public void btnMinus_actionPerformed(ActionEvent e) 
    {
    	if(txtshow.getText().equals("0"))
    	{	//如果文本框内容为0
    		txtshow.setText(txtshow.getText());
        }
    	//indexOf()的用法：返回字符中indexof（string）中字串string在父串中首次出现的位置
    	else if(txtshow.getText().indexOf("-")>=0)
    	{	//若文本框中含有负号
            String a=txtshow.getText().replaceAll("-","");
            txtshow.setText(a);
        }
    	else if(flag)
    	{
    		txtshow.setText("0");
        }
    	else
    	{
    		txtshow.setText("-"+txtshow.getText());
        }
	} 
   //清零
    public void btnBegin_actionPerformed(ActionEvent e)
    {
        flag=false;
        flag1=false;
        flag2=false;
        flag3=false;
        front="";
        behind="";
        re="";
        txtshow.setText("0");
        txtResult.setText("");
	}
    //点号
    public void btnPoint_actionPerformed(ActionEvent e) 
    {
    	int num=txtshow.getText().indexOf(".");
        if(num<0 && !flag)
        	txtshow.setText(txtshow.getText()+e.getActionCommand());
        if(flag)
            flag1=true;
	}
    //等号
    public void btnEqual_actionPerformed(ActionEvent e)
    {
    	if(!flag3)//未曾按下等于运算符
            behind = txtshow.getText();
        else
        {
          front = re;
        }
        try 
        {
            double a1 = Double.parseDouble(front);
            double b1 = Double.parseDouble(behind);
            if (op == "+") 
            {
                result = a1 + b1;
            } 
            else if (op == "-")
            {
                result = a1 - b1;
            }
            else if (op == "*") 
            {
                result = a1 * b1;
            } 
            else
            {
                result = a1 / b1;
            }
            Double r = new Double(result);
            re = r.toString(result);
            txtResult.setText(re);
            } 
        catch (ArithmeticException ce)
        {
        	txtResult.setText("除数不能为零");
        } 
        catch (Exception ee)
        {
        }
        if (!flag3)
           flag3 = true;
	}
    //加减乘除
    public void btnIncrease_actionPerformed(ActionEvent e) 
    {
    	if(flag3)
    	{
            op = e.getActionCommand(); //得到刚刚按下的运算符
            front = txtshow.getText(); //记录加减乘除运算符之前输入的内容
        }
        else if (flag2) 
        {
            ActionEvent ee = new ActionEvent("qq", 1, "pp");
            btnEqual_actionPerformed(ee);
            op = e.getActionCommand(); //得到刚刚按下的运算符
            front = re;
            flag2 = false;
        } 
        else
        {
            front = txtshow.getText(); //记录加减乘除运算符之前输入的内容
            op = e.getActionCommand(); //得到刚刚按下的运算符
        }
        flag3=false;
        flag = true; //记录已经按下了加减乘除运算符的其中一个
        txtshow.setText(txtshow.getText()+op);

	}
    //
    public void btnZero_actionPerformed(ActionEvent e)
    {
    	if (flag) 
    	{ //如果刚刚按下了运算符
    		txtshow.setText("");
 
            if (flag1)
            {//判断之前是否输入了点运算符
            	txtshow.setText("0." + e.getActionCommand());
                flag1 = false;
            } 
            else 
            {
            	txtshow.setText(txtshow.getText()+e.getActionCommand());
            }
            flag2 = true;
        } 
    	else 
    	{
            int num = txtshow.getText().indexOf(".");
            if (num < 0 && !txtshow.getText().equals("0")) 
            {
            	txtshow.setText(txtshow.getText() + e.getActionCommand());
            } 
            else if (num < 0 && txtshow.getText().equals("0"))
            {
            	txtshow.setText(e.getActionCommand());
            }
            else if (num >= 0 && txtshow.getText().equals("0")) 
            {
            	txtshow.setText("0." + e.getActionCommand());
            } 
            else if (num >= 0 && !txtshow.getText().equals("0")) 
            {
            	txtshow.setText(txtshow.getText() + e.getActionCommand());
            }
        }
        flag = false;
        flag3=false;
	}
    


}
//"←"类
class btnCancelActionAdapter implements ActionListener
{
	private Calculator adaptee;
	btnCancelActionAdapter(Calculator adaptee) 
	{
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e)
	{
		adaptee.btnCancel_actionPerformed(e);
	}
}
//"+/-"类
class btnMinusActionAdapter implements ActionListener
{
	private Calculator adaptee;
	btnMinusActionAdapter(Calculator adaptee)
	{
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e)
	{
		adaptee.btnMinus_actionPerformed(e);
	}
}
//清零
class btnBeginActionAdapter implements ActionListener
{
	private Calculator adaptee;
	btnBeginActionAdapter(Calculator adaptee)
	{
		this.adaptee = adaptee;
	}
	public void actionPerformed(ActionEvent e) 
	{
	    adaptee.btnBegin_actionPerformed(e);
	}
}
//点号
class btnPointActionAdapter implements ActionListener 
{
	private Calculator adaptee;
	btnPointActionAdapter(Calculator adaptee)
	{
        this.adaptee = adaptee;
    }
    public void actionPerformed(ActionEvent e) 
    {
        adaptee.btnPoint_actionPerformed(e);
    }
}
//等号
class btnEqualActionAdapter implements ActionListener
{
	private Calculator adaptee;
	btnEqualActionAdapter(Calculator adaptee) 
	{
        this.adaptee = adaptee;
    }
    public void actionPerformed(ActionEvent e) 
    {
        adaptee.btnEqual_actionPerformed(e);
    }
}
//加减乘数
class btnIncreaseActionAdapter implements ActionListener
{
    private Calculator adaptee;
    btnIncreaseActionAdapter(Calculator adaptee)
    {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e)
    {
        adaptee.btnIncrease_actionPerformed(e);
    }
}
class btnZeroActionAdapter implements ActionListener 
{
    private Calculator adaptee;
    btnZeroActionAdapter(Calculator adaptee) 
    {
        this.adaptee = adaptee;
    }
    public void actionPerformed(ActionEvent e) 
    {
        adaptee.btnZero_actionPerformed(e);
    }
}

