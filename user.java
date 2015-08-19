import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo16 implements ActionListener
{
Frame f;
Button b1,b2;
int x,y,z;
TextField t1;
JPasswordField t2;
Label l1,l2;
demo16()
	{
	f=new Frame();
	f.setSize(300,300);
	//f.setBackground(Color.red);
	f.setLayout(null);
	b1=new Button("ok");
	b1.setBounds(30,110,20,20);
	b2=new Button("cancel");
	b2.setBounds(60,110,60,20);
	f.add(b1);
	f.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	l1=new Label("user name");
	l1.setBounds(30,50,70,20);
	f.add(l1);
	l2=new Label("password");
	l2.setBounds(30,80,60,20);
	f.add(l2);
	t1=new TextField();
	t1.setBounds(110,50,50,20);
	f.add(t1);
	t2=new JPasswordField();
	t2.setBounds(100,80,50,20);
	f.add(t2);
	f.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
	{
	Object ob;
	ob=e.getSource();
	if(ob==b1)
		{
		String s=t2.getText();
		if(s.equals("root"))
			{
			f.setVisible(false);
			demo14 f1=new demo14();
			}
		}
	}
public static void main(String z[])
	{
	demo16 ob=new demo16();
	}
}