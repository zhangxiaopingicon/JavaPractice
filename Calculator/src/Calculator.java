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
    	JFrame contentfFrame = new JFrame("������");//����
    	contentfFrame.setLayout(null);
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
        contentPaneTxt = (JPanel)getContentPane();
        contentPaneBtn = (JPanel)getContentPane();
        
        contentfFrame.add(contentPaneTxt);
        contentfFrame.add(contentPaneBtn);
        contentfFrame.setVisible(true);
        contentfFrame.setBackground(Color.red);
        contentfFrame.setSize(new Dimension(400, 300));
        contentfFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentfFrame.setLocationRelativeTo(null);//�ô��������ʾ
    }
}