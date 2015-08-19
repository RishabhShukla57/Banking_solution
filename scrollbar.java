import java.awt.*;
import java.awt.event.*;
class demo5 implements AdjustmentListener
{
Frame f;
int p,q,r;
Panel p1;
Scrollbar s1,s2,s3;
demo5()
	{
	f=new Frame();
	f.setSize(300,300);
	//f.setBackground(Color.red);
	f.setLayout(null);
	s1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	s1.setBackground(Color.red);
	s1.setBounds(30,35,20,255);
	s2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	s2.setBackground(Color.green);
	s2.setBounds(60,35,20,255);
	s3=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	s3.setBackground(Color.blue);
	s3.setBounds(90,35,20,255);
	f.add(s1);
	f.add(s2);
	f.add(s3);
	s1.addAdjustmentListener(this);
	s2.addAdjustmentListener(this);
	s3.addAdjustmentListener(this);
	p1=new Panel();
	p1.setBounds(120,35,170,255);
	f.add(p1);
	f.setVisible(true);
	}
public void adjustmentValueChanged(AdjustmentEvent e)
	{
	Object ob=e.getSource();
	int p,q,r;
	p=s1.getValue();
	q=s2.getValue();
	r=s3.getValue();
	Color c=new Color(p,q,r);
	p1.setBackground(c);
	}
public static void main(String z[])
	{
	demo5 ob=new demo5();
	}
}