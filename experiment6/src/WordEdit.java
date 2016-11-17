import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;


public class WordEdit extends JFrame
{
	//jtextpane 这个组件就相当于富文本框，可以插入图片，html代码等。jtextarea是纯文本域
	JTextPane textPane = new JTextPane();
	JLabel statusBar = new JLabel();//状态栏
	JFileChooser fileChooser = new JFileChooser();//文本选择器
	public  WordEdit() 
	{
		super("文本编辑器");//表示要调用父类的方法
		//Action数组，调用各种操作命令
		Action[] actions =  //Action数组,各种操作命令
	            {
	                new NewAction(),//新建
	                new OpenAction(),//打开
	                new SaveAction(),//保存
	                new CutAction(),//剪切
	                new CopyAction(),//拷贝
	                new PasteAction(),//粘贴
	                new AboutAction(),//关于
	                new ExitAction(),//退出
	                new DelectAction(),//删除
	                new NewSaveAction(),//另保存
	                new kaiAction(),//楷体
	                new heiAction(),//黑体
	                new smallFontSize(),//小号字
	                new bigFontSize()//大号字
	            };
		setJMenuBar(createJMenuBar(actions));
		Container container = getContentPane();
		container.add(createtJToolBar(actions),BorderLayout.NORTH);//增加工具栏
		container.add(textPane,BorderLayout.CENTER);//增加文本框
		container.add(statusBar,BorderLayout.SOUTH);//增加状态栏
		setSize(330,200);//设置窗口尺寸
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出程序
		
				
	}
	//创建菜单栏
	private JMenuBar createJMenuBar(Action[] actions)
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("文件");
		JMenu menuEdit = new JMenu("编辑");
		JMenu menuAbout = new JMenu("帮助");
		JMenu menuForm = new JMenu("格式");
		JMenu fontMenu=new JMenu("字体");
		JMenu wordSizeMenu=new JMenu("字号");
		wordSizeMenu.add(new JMenuItem(actions[12]));
		wordSizeMenu.add(new JMenuItem(actions[13]));
		fontMenu.add(new JMenuItem(actions[10]));
		fontMenu.add(new JMenuItem(actions[11]));
		menuFile.add(new JMenuItem(actions[0])); //增加新菜单项
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
	//创建工具条
	private JToolBar createtJToolBar(Action[] actions) 
	{
		JToolBar toolBar = new JToolBar();
		for (int i = 0; i < actions.length; i++)
		{
			JButton bt = new JButton(actions[i]); //实例化新的按钮
			bt.setRequestFocusEnabled(false);
			toolBar.add(bt);
		}
		return toolBar;
	}
	//新建文件命令
	class NewAction extends AbstractAction
	{
		public NewAction()
		{
			super("新建");
		}
		public void actionPerformed(ActionEvent e) 
		{
			//显示打开文件对话框
            textPane.setDocument(new DefaultStyledDocument()); //清空文档
        }
	}
	//打开文件命令
	class OpenAction extends AbstractAction
	{
		public OpenAction() 
		{
			super("打开");
		}
		public void actionPerformed(ActionEvent e)
		{
			//显示打开文件对话框
			int i = fileChooser.showOpenDialog(WordEdit.this);
			if (i==JFileChooser.APPROVE_OPTION)//点击对话框的打开按钮
			{
				File f = fileChooser.getSelectedFile();//得到选择的文件
				try 
				{
					InputStream is = new FileInputStream(f);//得到文件输入流
					textPane.read(is, "d");//读入文件到文本框
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		}
	}
	//保存命令
	class SaveAction extends AbstractAction
	{
		public SaveAction() 
		{
			super("保存");
		}
		public void actionPerformed(ActionEvent e)
		{
			int i = fileChooser.showSaveDialog(WordEdit.this);
			if (i == JFileChooser.APPROVE_OPTION)//点击对话框的保存按钮
			{
				File f = fileChooser.getSelectedFile();//得到选择的文件
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
	//另保存命令
	class NewSaveAction extends AbstractAction
	{
		public NewSaveAction() 
		{
			super("另存");
		}
		public void actionPerformed(ActionEvent e)
		{
			int i = fileChooser.showSaveDialog(WordEdit.this);
			if (i == JFileChooser.APPROVE_OPTION)//点击对话框的保存按钮
			{
				File f = fileChooser.getSelectedFile();//得到选择的文件
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
	//退出
	class ExitAction extends AbstractAction
	{
		public ExitAction()
		{
			super("退出");
		}
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	//剪切
	class CutAction extends AbstractAction
	{
		public CutAction()
		{
			super("剪切");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.cut();
		}
	}
	//拷贝
	class CopyAction extends AbstractAction
	{
		public CopyAction()
		{
			super("拷贝");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.copy();
		}
	}
	//粘贴
	class PasteAction extends AbstractAction
	{
		public PasteAction()
		{
			super("粘贴");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.paste();
		}
	}
	//删除
		class DelectAction extends AbstractAction
		{
			public DelectAction()
			{
				super("删除");
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
	//关于
	class AboutAction extends AbstractAction
	{
		public AboutAction()
		{
			super("关于");
		}
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(WordEdit.this,"文本编辑");
		}
	}
	//字体
	class FontAction extends AbstractAction
	{
		public FontAction()
		{
			super("字体");
		}
		public void actionPerformed(ActionEvent e)
		{

		}
	}
	//楷体
	class kaiAction extends AbstractAction
	{
		public kaiAction()
		{
			super("楷体");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font("楷体", Font.PLAIN ,textPane.getFont().getSize()) );//普通文字

		}
	}
	//黑体
	class heiAction extends AbstractAction
	{
		public heiAction()
		{
			super("黑体");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font("黑体", Font.PLAIN ,textPane.getFont().getSize()) );//普通文字

		}
	}
	//小号
	class smallFontSize extends AbstractAction
	{
		public smallFontSize()
		{
			super("小号");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font(textPane.getFont().getFontName(), Font.PLAIN ,20));//普通文字

		}
	}
	//大号
	class bigFontSize extends AbstractAction
	{
		public bigFontSize()
		{
			super("大号");
		}
		public void actionPerformed(ActionEvent e)
		{
			textPane.setFont(new Font(textPane.getFont().getFontName(), Font.PLAIN ,60));//普通文字

		}
	}


}
