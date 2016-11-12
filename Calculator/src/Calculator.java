import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator extends JFrame
{
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
    	JFrame contentfFrame = new JFrame("计算器");//窗体
    	contentfFrame.setLayout(null);
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
        contentPaneTxt = (JPanel)getContentPane();
        contentPaneBtn = (JPanel)getContentPane();
        
        contentfFrame.add(contentPaneTxt);
        contentfFrame.add(contentPaneBtn);
        contentfFrame.setVisible(true);
        contentfFrame.setBackground(Color.red);
        contentfFrame.setSize(new Dimension(400, 300));
        contentfFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentfFrame.setLocationRelativeTo(null);//让窗体居中显示
    }
}