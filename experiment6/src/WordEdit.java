import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;


public class WordEdit extends JFrame
{
	//jtextpane ���������൱�ڸ��ı��򣬿��Բ���ͼƬ��html����ȡ�jtextarea�Ǵ��ı���
	JTextPane textPane = new JTextPane();
	JLabel statusBar = new JLabel();//״̬��
	JFileChooser fileChooser = new JFileChooser();//�ı�ѡ����
	public  WordEdit() 
	{
		super("�ı��༭��");//��ʾҪ���ø���ķ���
		//Action���飬���ø��ֲ�������
		Action[] actions =  //Action����,���ֲ�������
	            {
	                new NewAction(),//�½�
	                new OpenAction(),//��
	                new SaveAction(),//����
	                new CutAction(),//����
	                new CopyAction(),//����
	                new PasteAction(),//ճ��
	                new AboutAction(),//����
	                new ExitAction(),//�˳�
	                new DelectAction(),//ɾ��
	                new NewSaveAction(),//����
	                new kaiAction(),//����
	                new heiAction(),//����
	                new smallFontSize(),//С����
	                new bigFontSize()//�����
	            };
		setJMenuBar(createJMenuBar(actions));
		Container container = getContentPane();
		container.add(createtJToolBar(actions),BorderLayout.NORTH);//���ӹ�����
		container.add(textPane,BorderLayout.CENTER);//�����ı���
		container.add(statusBar,BorderLayout.SOUTH);//����״̬��
		setSize(330,200);//���ô��ڳߴ�
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�����
		
				
	}
	//�����˵���
	private JMenuBar createJMenuBar(Action[] actions)
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("�ļ�");
		JMenu menuEdit = new JMenu("�༭");
		JMenu menuAbout = new JMenu("����");
		JMenu menuForm = new JMenu("��ʽ");
		JMenu fontMenu=new JMenu("����");
		JMenu wordSizeMenu=new JMenu("�ֺ�");
		wordSizeMenu.add(new JMenuItem(actions[12]));
		wordSizeMenu.add(new JMenuItem(actions[13]));
		fontMenu.add(new JMenuItem(actions[10]));
		fontMenu.add(new JMenuItem(actions[11]));
		menuFile.add(new JMenuItem(actions[0])); //�����²˵���
	    menuFile.add(new JMenuItem(actions[1]));
	    menuFile.add(new JMenuItem(actions[2]));
	    menuFile.add(new JMenuItem(actions[9]));
	    menuFile.add(new JMenuItem(actions[7]));
	    menuEdit.add(new JMenuItem(actions[3]));
	    menuEdit.add(new JMenuItem(actions[4]));
	    menuEdit.add(new JMenuItem(actions[5]));
	    menuEdit.add(new JMenuItem(actions[8]));
	    menuAbout.add(new JMenuItem(actions[6]));
	    menuForm.add(fontMenu);
	    menuForm.add(wordSizeMenu);
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuAbout);
		menuBar.add(menuForm);
		
		return menuBar;
	}
	//����������
	private JToolBar createtJToolBar(Action[] actions) 
	{
		JToolBar toolBar = new JToolBar();
		for (int i = 0; i < actions.length; i++)
		{
			JButton bt = new JButton(actions[i]); //ʵ�����µİ�ť
			bt.setRequestFocusEnabled(false);
			toolBar.add(bt);
		}
		return toolBar;
	}
	//�½��ļ�����
	class NewAction extends AbstractAction
	{
		public NewAction()
		{
			super("�½�");
		}
		public void actionPerformed(ActionEvent e) 
		{
			//��ʾ���ļ��Ի���
            textPane.setDocument(new DefaultStyledDocument()); //����ĵ�
        }
	}
	//���ļ�����
	class OpenAction extends AbstractAction
	{
		public OpenAction() 
		{
			super("��");
		}
		public void actionPerformed(ActionEvent e)
		{
			//��ʾ���ļ��Ի���
			int i = fileChooser.showOpenDialog(WordEdit.this);
			if (i==JFileChooser.APPROVE_OPTION)//����Ի���Ĵ򿪰�ť
			{
				File f = fileChooser.getSelectedFile();//�õ�ѡ����ļ�
				try 
				{
					InputStream is = new FileInputStream(f);//�õ��ļ�������
					textPane.read(is, "d");//�����ļ����ı���
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		}
	}
	//��������
	class SaveAction extends AbstractAction
	{
		public SaveAction() 
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{
			int i = fileChooser.showSaveDialog(WordEdit.this);
			if (i == JFileChooser.APPROVE_OPTION)//����Ի���ı��水ť
			{
				File f = fileChooser.getSelectedFile();//�õ�ѡ����ļ�
				try 
				{
					FileOutputStream out = new FileOutputStream(f);
					out.write(textPane.getText().getBytes());
					out.close();
				} 
				catch (Exception ex) 
				{
					ex.printStackTrace();
				}
			}
		}
	}
	//��������
	class NewSaveAction extends AbstractAction
	{
		public NewSaveAction() 
		{
			super("���");
		}
		public void actionPerformed(ActionEvent e)
		{
			int i = fileChooser.showSaveDialog(WordEdit.this);
			if (i == JFileChooser.APPROVE_OPTION)//����Ի���ı��水ť
			{
				File f = fileChooser.getSelectedFile();//�õ�ѡ����ļ�
				try 
				{
					FileOutputStream out = new FileOutputStream(f);
					out.write(textPane.getText().getBytes());
					out.close();
				} 
				catch (Exception ex) 
				{
					ex.printStackTrace();
				}
			}
		}
	}
	//�˳�
	class ExitAction extends AbstractAction
	{
		public ExitAction()
		{
			super("�˳�");
		}
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	//����
	class CutAction extends AbstractAction
	{
		public CutAction()
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.cut();
		}
	}
	//����
	class CopyAction extends AbstractAction
	{
		public CopyAction()
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.copy();
		}
	}
	//ճ��
	class PasteAction extends AbstractAction
	{
		public PasteAction()
		{
			super("ճ��");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.paste();
		}
	}
	//ɾ��
		class DelectAction extends AbstractAction
		{
			public DelectAction()
			{
				super("ɾ��");
			}
			public void actionPerformed(ActionEvent e)
			{
				StringBuffer tmp = new StringBuffer (textPane.getText());
				int start = textPane.getSelectionStart(); 
				int len = textPane.getSelectedText().length(); 
				tmp.delete( start , start+len); 
				textPane.setText(tmp.toString());

			}
		}
	//����
	class AboutAction extends AbstractAction
	{
		public AboutAction()
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(WordEdit.this,"�ı��༭");
		}
	}
	//����
	class FontAction extends AbstractAction
	{
		public FontAction()
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	//����
	class kaiAction extends AbstractAction
	{
		public kaiAction()
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font("����", Font.PLAIN ,textPane.getFont().getSize()) );//��ͨ����

		}
	}
	//����
	class heiAction extends AbstractAction
	{
		public heiAction()
		{
			super("����");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font("����", Font.PLAIN ,textPane.getFont().getSize()) );//��ͨ����

		}
	}
	//С��
	class smallFontSize extends AbstractAction
	{
		public smallFontSize()
		{
			super("С��");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font(textPane.getFont().getFontName(), Font.PLAIN ,20));//��ͨ����

		}
	}
	//���
	class bigFontSize extends AbstractAction
	{
		public bigFontSize()
		{
			super("���");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font(textPane.getFont().getFontName(), Font.PLAIN ,60));//��ͨ����

		}
	}


}
