import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class demo13 extends JPanel implements ActionListener 
{
Button b1,b2,b3;
int x,y,z,balance;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
TextField t16,t17;
TextArea a;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
Label l17,l18;
Connection con;
Statement st;
ResultSet rs;
{
	try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank","root","root");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		JOptionPane.showMessageDialog(null,"connection Successful","bcc",0);
		}
	catch(Exception e)
		{
		JOptionPane.showMessageDialog(null,e,"bcc",1);
		}
}
demo13()
	{
	setSize(600,500);
	Color c=new Color(240,240,240);
	setBackground(c);
	setLayout(null);
	b1=new Button("add");
	b1.setBounds(90,420,30,20);
	b2=new Button("clear");
	b2.setBounds(150,420,40,20);
	b3=new Button("cancel");
	b3.setBounds(220,420,50,20);
	add(b1);
	add(b2);
	add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	l1=new Label("Name of Applicant:");
	l1.setBounds(30,50,110,20);
	add(l1);
	l2=new Label("street");
	l2.setBounds(30,80,30,20);
	add(l2);
	l3=new Label("city:");
	l3.setBounds(130,80,60,20);
	add(l3);
	l4=new Label("state:");
	l4.setBounds(260,80,30,20);
	add(l4);
	l5=new Label("Residential Address:");
	l5.setBounds(30,110,120,20);
	add(l5);
	l6=new Label("customer id:");
	l6.setBounds(30,180,120,20);
	add(l6);
	l7=new Label("type:");
	l7.setBounds(30,210,70,20);
	add(l7);
	l8=new Label("account no.");
	l8.setBounds(170,210,80,20);
	add(l8);
	l9=new Label("Tel No(Res)");
	l9.setBounds(30,240,70,20);
	add(l9);
	l10=new Label("Mobile");
	l10.setBounds(170,240,40,20);
	add(l10);
	l11=new Label("Applicable Interest Rate");
	l11.setBounds(30,270,140,20);
	add(l11);
	l12=new Label("Overdraftlimit:");
	l12.setBounds(30,300,70,20);
	add(l12);
	l13=new Label("draftintrate");
	l13.setBounds(170,300,70,20);
	add(l13);
	l14=new Label("Age(Years)");
	l14.setBounds(30,330,70,20);
	add(l14);
	l15=new Label("Mobile No.");
	l15.setBounds(170,330,70,20);
	add(l15);
	l16=new Label("Email*");
	l16.setBounds(30,360,40,20);
	add(l16);
	l17=new Label("Tel No.");
	l17.setBounds(140,360,40,20);
	add(l17);
	l18=new Label("Please Select Nearest SBI Loan Sales Team:");
	l18.setBounds(30,390,250,20);
	add(l18);
	t1=new TextField();
	t1.setBounds(150,50,50,20);
	add(t1);
	t2=new TextField();
	t2.setBounds(70,80,50,20);
	add(t2);
	t3=new TextField();
	t3.setBounds(200,80,50,20);
	add(t3);
	t4=new TextField();
	t4.setBounds(300,80,50,20);
	add(t4);
	t5=new TextField();
	t5.setBounds(160,180,50,20);
	add(t5);
	t6=new TextField();
	t6.setBounds(110,210,50,20);
	add(t6);
	t7=new TextField();
	t7.setBounds(260,210,50,20);
	add(t7);
	t8=new TextField();
	t8.setBounds(110,240,50,20);
	add(t8);
	t9=new TextField();
	t9.setBounds(220,240,50,20);
	add(t9);
	t10=new TextField();
	t10.setBounds(180,270,50,20);
	add(t10);
	t11=new TextField();
	t11.setBounds(110,300,50,20);
	add(t11);
	t12=new TextField();
	t12.setBounds(250,300,50,20);
	add(t12);
	t13=new TextField();
	t13.setBounds(110,330,50,20);
	add(t13);
	t14=new TextField();
	t14.setBounds(250,330,50,20);
	add(t14);
	t15=new TextField();
	t15.setBounds(80,360,50,20);
	add(t15);
	t16=new TextField();
	t16.setBounds(190,360,50,20);
	add(t16);
	t17=new TextField();
	t17.setBounds(290,390,50,20);
	add(t17);
	a=new TextArea();
	a.setBounds(160,110,150,60);
	add(a);
	y=0;
	t1.setEnabled(false);
	t2.setEnabled(false);
	t3.setEnabled(false);
	t4.setEnabled(false);
	t5.setEnabled(false);
	t6.setEnabled(false);
	t7.setEnabled(false);
	t8.setEnabled(false);
	t9.setEnabled(false);
	t10.setEnabled(false);
	t11.setEnabled(false);
	t12.setEnabled(false);
	t13.setEnabled(false);
	t14.setEnabled(false);
	t15.setEnabled(false);
	t16.setEnabled(false);
	t17.setEnabled(false);
	a.setEnabled(false);
	setVisible(true);
	}
public void actionPerformed(ActionEvent e)
	{
	Object ob;
	ob=e.getSource();
	if(ob==b1)
		{
		if(y==0)
			{
			t1.setEnabled(true);
			t2.setEnabled(true);
			t3.setEnabled(true);
			t4.setEnabled(true);
			t5.setEnabled(true);
			t6.setEnabled(true);
			t7.setEnabled(true);
			t8.setEnabled(true);
			t9.setEnabled(true);
			t10.setEnabled(true);
			t11.setEnabled(true);
			t12.setEnabled(true);
			t13.setEnabled(true);
			t14.setEnabled(true);
			t15.setEnabled(true);
			t16.setEnabled(true);
			t17.setEnabled(true);
			a.setEnabled(true);
			}
		if(y!=0)
			{
			try
				{
				String g1,g2,g3,g4,txt;
				int g17,g7,g8,g5,g6,g10,g11,g12,balance;
				g1=t1.getText();
				g2=t2.getText();
				g3=t3.getText();
				g4=t4.getText();
				txt=a.getText();
				g7=Integer.parseInt(t7.getText());
				g8=Integer.parseInt(t8.getText());
				g5=Integer.parseInt(t5.getText());
				g10=Integer.parseInt(t10.getText());
				g11=Integer.parseInt(t11.getText());
				g12=Integer.parseInt(t12.getText());
				g6=Integer.parseInt(t6.getText());
				g17=Integer.parseInt(t17.getText());
				balance=0;
				st.execute("insert into customer values("+g5+",'"+g1+"','"+txt+"','"+g2+"','"+g3+"','"+g4+"',"+g8+")");
				st.execute("insert into account values("+g17+","+g7+","+balance+","+g5+")");
                                JOptionPane.showMessageDialog(null,"DATA ENTERED","bcc",1);
                                }
			catch(Exception g)
				{
				JOptionPane.showMessageDialog(null,g,"bcc",1);
				}
			}
		y=y+1;
		}
	if(ob==b3)
		{
		System.exit(0);
		}
	}
public static void main(String z[])
	{
	demo13 ob=new demo13();
	}
}