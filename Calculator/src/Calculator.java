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
    private String front = "", behind = ""; //�ֱ����ڼ�¼�Ӽ��˳������֮ǰ,֮�����������
    private String op; //���ڼ�¼�����
    private String re;//���ڴ洢���������ַ�����ʽ
    private boolean flag = false; //���ڼ�¼�Ƿ����������
    private boolean flag1 = false;//�����ж��Ƿ������˵������
    private double result;//���ڴ洢������
    private boolean flag2 = false;//�����ж��Ƿ�����������
    private boolean flag3 = false;//�����ж��Ƿ����˵Ⱥ������
	//ʵ���������󣬳нӸ���JTextField
	JPanel contentPaneTxt = new JPanel(new GridLayout(2, 1, 3, 3));
	//ʵ���������󣬳нӸ���button
	JPanel contentPaneBtn = new JPanel(new GridLayout(5, 4, 3, 3));
    //���������
    JTextField txtshow = new JTextField("0");
    //�����ʾ��
    JTextField txtResult = new JTextField(" ");
    String str[]={"C","+/-","��","+","7","8","9","-","4","5","6","*","1","2","3","/",".","0","%","=",};
    public Calculator ()
    {
    	super("������");
    	//���ı�����Ӹ����contentPaneBtn
    	contentPaneTxt.add(txtshow);
    	contentPaneTxt.add(txtResult);
    	JButton btn[]; //������ť����
        btn=new JButton[str.length];//������ť����
        //ѭ�����尴ť������ӵ������
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
        this.setLocationRelativeTo(null);//�ô��������ʾ
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
        //��Ӽ����¼�
        //����
        btn[0].addActionListener(new btnBeginActionAdapter(this));
        //����
        btn[2].addActionListener(new btnCancelActionAdapter(this));
        //����0-9
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
        //���
        btn[16].addActionListener(new btnPointActionAdapter(this));
        //�Ⱥ�
        btn[19].addActionListener(new btnEqualActionAdapter(this));
        //�Ӽ��˳�
        btn[3].addActionListener(new btnIncreaseActionAdapter(this));
        btn[7].addActionListener(new btnIncreaseActionAdapter(this));
        btn[11].addActionListener(new btnIncreaseActionAdapter(this));
        btn[15].addActionListener(new btnIncreaseActionAdapter(this));
        

    }

    //�˸��¼�������
    public void btnCancel_actionPerformed(ActionEvent e) 
    {
    	String str=txtshow.getText();
        if(str.length() == 1)
        {//���ı�����ֻʣ�����һ���ַ�,���ı���������Ϊ0
        	txtshow.setText("0");
        }
        if(str.length()>1)
        {
            str=str.substring(0,str.length()-1);
            txtshow.setText(str);
        }
	}
    //ȡ�������
    public void btnMinus_actionPerformed(ActionEvent e) 
    {
    	if(txtshow.getText().equals("0"))
    	{	//����ı�������Ϊ0
    		txtshow.setText(txtshow.getText());
        }
    	//indexOf()���÷��������ַ���indexof��string�����ִ�string�ڸ������״γ��ֵ�λ��
    	else if(txtshow.getText().indexOf("-")>=0)
    	{	//���ı����к��и���
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
   //����
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
    //���
    public void btnPoint_actionPerformed(ActionEvent e) 
    {
    	int num=txtshow.getText().indexOf(".");
        if(num<0 && !flag)
        	txtshow.setText(txtshow.getText()+e.getActionCommand());
        if(flag)
            flag1=true;
	}
    //�Ⱥ�
    public void btnEqual_actionPerformed(ActionEvent e)
    {
    	if(!flag3)//δ�����µ��������
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
        	txtResult.setText("��������Ϊ��");
        } 
        catch (Exception ee)
        {
        }
        if (!flag3)
           flag3 = true;
	}
    //�Ӽ��˳�
    public void btnIncrease_actionPerformed(ActionEvent e) 
    {
    	if(flag3)
    	{
            op = e.getActionCommand(); //�õ��ոհ��µ������
            front = txtshow.getText(); //��¼�Ӽ��˳������֮ǰ���������
        }
        else if (flag2) 
        {
            ActionEvent ee = new ActionEvent("qq", 1, "pp");
            btnEqual_actionPerformed(ee);
            op = e.getActionCommand(); //�õ��ոհ��µ������
            front = re;
            flag2 = false;
        } 
        else
        {
            front = txtshow.getText(); //��¼�Ӽ��˳������֮ǰ���������
            op = e.getActionCommand(); //�õ��ոհ��µ������
        }
        flag3=false;
        flag = true; //��¼�Ѿ������˼Ӽ��˳������������һ��
        txtshow.setText(txtshow.getText()+op);

	}
    //
    public void btnZero_actionPerformed(ActionEvent e)
    {
    	if (flag) 
    	{ //����ոհ����������
    		txtshow.setText("");
 
            if (flag1)
            {//�ж�֮ǰ�Ƿ������˵������
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
//"��"��
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
//"+/-"��
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
//����
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
//���
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
//�Ⱥ�
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
//�Ӽ�����
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

