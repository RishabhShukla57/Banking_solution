import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class demo14 implements ActionListener
{
Frame f;
JMenuBar b;
JMenu m1,m2,m3,m4,m5;
JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;
JDesktopPane p;
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
	catch(Exception m)
		{
		JOptionPane.showMessageDialog(null,m,"bcc",1);
		}
}
demo14()
	{
	f=new Frame();
	f.setSize(1000,700);
	//f.setBackground(Color.red);
	f.setLayout(null);
	b=new JMenuBar();
	b.setBounds(5,30,995,20);
	b.setBackground(Color.red);
	f.add(b);
	m1=new JMenu("customer");
	b.add(m1);
	m2=new JMenu("transaction");
	b.add(m2);
	m3=new JMenu("loan");
	b.add(m3);
	m4=new JMenu("about");
	b.add(m4);
	m5=new JMenu("exit");
	b.add(m5);
	i1=new JMenuItem("new");
	m1.add(i1);
	i2=new JMenuItem("modify");
	m1.add(i2);
	i3=new JMenuItem("delete");
	m1.add(i3);
	i4=new JMenuItem("information");
	m1.add(i4);
	i5=new JMenuItem("deposite");
	m2.add(i5);
	i6=new JMenuItem("withdrawl");
	m2.add(i6);
	i7=new JMenuItem("balance");
	m2.add(i7);
	i8=new JMenuItem("money transfer");
	m2.add(i8);
	i9=new JMenuItem("payment");
	m3.add(i9);
	i10=new JMenuItem("education");
	m3.add(i10);
	i11=new JMenuItem("vehicle");
	m3.add(i11);
	i12=new JMenuItem("bank");
	m4.add(i12);
	i13=new JMenuItem("project");
	m4.add(i13);
	i14=new JMenuItem("exit");
	m5.add(i14);
	i1.addActionListener(this);
	i2.addActionListener(this);
	i3.addActionListener(this);
	i4.addActionListener(this);
	i5.addActionListener(this);
	i6.addActionListener(this);
	i7.addActionListener(this);
	i8.addActionListener(this);
	i9.addActionListener(this);
	i10.addActionListener(this);
	i11.addActionListener(this);
	i12.addActionListener(this);
	i13.addActionListener(this);
	i14.addActionListener(this);
	p=new JDesktopPane();
	p.setBounds(5,50,995,650);
	p.setBackground(Color.red);
	f.add(p);
	f.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
	{
	Object ob;
	ob=e.getSource();
	if(ob==i1)
		{
		JInternalFrame if1=new JInternalFrame("title",true,true,true,true);
		if1.setBounds(0,0,995,650);
		p.add(if1);
		demo13 w1=new demo13();
		if1.add(w1);	
		if1.setVisible(true);
		}
	if(ob==i2)
		{
/*		JInternalFrame if2=new JInternalFrame("title",true,true,true,true);
		if2.setBounds(0,0,995,650);
		p.add(if2);
		demo19 w1=new demo19();
		if2.add(w1);	
		if2.setVisible(true);
*/		}
	if(ob==i3)
		{
		JInternalFrame if3=new JInternalFrame("title",true,true,true,true);
		if3.setBounds(0,0,995,650);
		p.add(if3);
		if3.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no.","bcc",1));
		try
			{
			st.executeUpdate("delete from account where acc_no="+s+"");
			JOptionPane.showMessageDialog(null,"account deleted","bcc",1);
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		}
	if(ob==i4)
		{
		JInternalFrame if4=new JInternalFrame("title",true,true,true,true);
		if4.setBounds(0,0,995,650);
		p.add(if4);
		if4.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no.","bcc",1));
		try
			{
			rs=st.executeQuery("select *from account where acc_no="+s+"");
			while(rs.next())
				{
				int s1=Integer.parseInt(rs.getString("balance"));
				JOptionPane.showMessageDialog(null,"balance="+s1,"bcc",1);
				}
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		}
	if(ob==i5)
		{
		int s1=0;
		JInternalFrame if5=new JInternalFrame("title",true,true,true,true);
		if5.setBounds(0,0,995,650);
		p.add(if5);
		if5.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no.","bcc",1));
		int amt=Integer.parseInt(JOptionPane.showInputDialog(null,"enter amount to be deposited","bcc",1));
		try
			{
			rs=st.executeQuery("select *from account where acc_no="+s+"");
			while(rs.next())
				{
				s1=Integer.parseInt(rs.getString("balance"));
				//JOptionPane.showMessageDialog(null,"balance="+s1,"bcc",1);
				}
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		s1=s1+amt;
		//System.out.print(s1+"\n");
		try
			{
			st.executeUpdate("update account set balance="+s1+" where acc_no="+s+"");
			JOptionPane.showMessageDialog(null,"money deposited","bcc",1);
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		}
	if(ob==i6)
		{
		int s1=0;
		JInternalFrame if6=new JInternalFrame("title",true,true,true,true);
		if6.setBounds(0,0,995,650);
		p.add(if6);
		if6.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no.","bcc",1));
		int amt=Integer.parseInt(JOptionPane.showInputDialog(null,"enter amount to be withdrawn","bcc",1));
		try
			{
			rs=st.executeQuery("select *from account where acc_no="+s+"");
			while(rs.next())
				{
				s1=Integer.parseInt(rs.getString("balance"));
				}
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		s1=s1-amt;
		if(s1<0)
			{
			JOptionPane.showMessageDialog(null,"invalid amount","bcc",1);
			}
		else
			{
			//System.out.print(s1+"\n");
			
		try
			{
			st.executeUpdate("update account set balance="+s1+" where acc_no="+s+"");
			JOptionPane.showMessageDialog(null,"money withdrawn","bcc",1);
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
                        }
		}
	if(ob==i7)
		{
		int s1=0;
		JInternalFrame if7=new JInternalFrame("title",true,true,true,true);
		if7.setBounds(0,0,995,650);
		p.add(if7);
		if7.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no.","bcc",1));
		try
			{
			rs=st.executeQuery("select *from account where acc_no="+s+"");
			while(rs.next())
				{
				s1=Integer.parseInt(rs.getString("balance"));
				JOptionPane.showMessageDialog(null,"balance="+s1,"bcc",1);
				}
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		}
	if(ob==i8)
		{
		int s1=0,amt1=0,s3=0;
		JInternalFrame if8=new JInternalFrame("title",true,true,true,true);
		if8.setBounds(0,0,995,650);
		p.add(if8);
		if8.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no. from which money is to be transfered","bcc",1));
		int amt=Integer.parseInt(JOptionPane.showInputDialog(null,"enter amount to be withdrawn","bcc",1));
		try
			{
			rs=st.executeQuery("select *from account where acc_no="+s+"");
			while(rs.next())
				{
				s1=Integer.parseInt(rs.getString("balance"));
				}
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		s1=s1-amt;
		if(s1<0)
			{
			JOptionPane.showMessageDialog(null,"low balance","bcc",1);
			}
		else
			{
			int s2=Integer.parseInt(JOptionPane.showInputDialog(null,"enter account no. to which money is to be transffered","bcc",1));
			//amt1=Integer.parseInt(JOptionPane.showInputDialog(null,"enter amount to be deposited","bcc",1));
			try
				{
				rs=st.executeQuery("select *from account where acc_no="+s2+"");
				while(rs.next())
					{
					s3=Integer.parseInt(rs.getString("balance"));
					//JOptionPane.showMessageDialog(null,"balance="+s1,"bcc",1);
					}
				}
			catch(Exception l)
				{
				JOptionPane.showMessageDialog(null,l,"bcc",1);
				}
			s3=s3+amt;
			//System.out.print(s3+"\n");
			//System.out.print(s1+"\n");
			try
				{
				st.executeUpdate("update account set balance="+s1+" where acc_no="+s+"");
				//JOptionPane.showMessageDialog(null,"money transferred","bcc",1);
				}
			catch(Exception l)
				{
				JOptionPane.showMessageDialog(null,l,"bcc",1);
				}
			try
				{
				st.executeUpdate("update account set balance="+s3+" where acc_no="+s2+"");
				JOptionPane.showMessageDialog(null,"money transferred","bcc",1);
				}
			catch(Exception l)
				{
				JOptionPane.showMessageDialog(null,l,"bcc",1);
				}
			}
		}	
	if(ob==i9)
		{
                int s1=0;
		JInternalFrame if9=new JInternalFrame("title",true,true,true,true);
		if9.setBounds(0,0,995,650);
		p.add(if9);
		if9.setVisible(true);
		int s=Integer.parseInt(JOptionPane.showInputDialog(null,"enter loan no.","bcc",1));
		int amt=Integer.parseInt(JOptionPane.showInputDialog(null,"enter amount to be repayed","bcc",1));
		try
			{
			rs=st.executeQuery("select *from payment where loan_no="+s+"");
			while(rs.next())
				{
				s1=Integer.parseInt(rs.getString("amount"));
				//JOptionPane.showMessageDialog(null,"balance="+s1,"bcc",1);
				}
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		s1=s1+amt;
		//System.out.print(s1+"\n");
		try
			{
			st.executeUpdate("update payment set amount="+s1+" where loan_no="+s+"");
			JOptionPane.showMessageDialog(null,"money deposited","bcc",1);
			}
		catch(Exception l)
			{
			JOptionPane.showMessageDialog(null,l,"bcc",1);
			}
		}
	if(ob==i10)
		{
		JInternalFrame if10=new JInternalFrame("title",true,true,true,true);
		if10.setBounds(0,0,995,650);
		p.add(if10);
		demo12 w3=new demo12();
		if10.add(w3);
		if10.setVisible(true);
		}
	if(ob==i11)
		{
		JInternalFrame if11=new JInternalFrame("title",true,true,true,true);
		if11.setBounds(0,0,995,650);
		p.add(if11);
		demo17 w4=new demo17();
		if11.add(w4);
		if11.setVisible(true);
		}
	if(ob==i12)
		{
		JInternalFrame if12=new JInternalFrame("title",true,true,true,true);
		if12.setBounds(0,0,995,650);
		p.add(if12);
		if12.setVisible(true);
		}
	if(ob==i13)
		{
		JInternalFrame if13=new JInternalFrame("title",true,true,true,true);
		if13.setBounds(0,0,995,650);
		p.add(if13);
		if13.setVisible(true);
		}
	if(ob==i14)
		{
		JInternalFrame if14=new JInternalFrame("title",true,true,true,true);
		if14.setBounds(0,0,995,650);
		p.add(if14);
		if14.setVisible(true);
		System.exit(0);
		}
	}
public static void main(String z[])
	{
	demo14 ob=new demo14();
	}
}