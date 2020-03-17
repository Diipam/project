import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
class Converter extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3;
	JTextField t1,t2;
	JButton b0,b1,b2,b3,b4,b5,b6;
	Converter(){
		setSize(600,600);
		l=new JLabel("CURRENCY CONVERTER");
		l.setBounds(210,30,150,60);
		l3=new JLabel("u");
		l3.setBounds(600,610,80,10);
		l1=new JLabel("NepaleseRupees");
		l1.setBounds(130,120,150,20);
		l2=new JLabel("ConvertedCurrency");
		l2.setBounds(300,120,150,20);
		t1=new JTextField("");
		t1.setBounds(130,140,100,30);
		t2=new JTextField("");
		t2.setBounds(300,140,100,30);
		b0=new JButton("Reset");
		b0.setBounds(230,220,100,30);
		b1=new JButton("Indian");
		b1.setBounds(160,270,110,50);
		b2=new JButton("USD");
		b2.setBounds(300,270,110,50);
		b3=new JButton("Canadian Dollar");
		b3.setBounds(160,340,110,50);
		b4=new JButton("SA Rand");
		b4.setBounds(300,340,110,50);
		b5=new JButton("Yuan");
		b5.setBounds(160,420,110,50);
		b6=new JButton("Yen");
		b6.setBounds(300,420,110,50);
		add(l);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(l3);
		setVisible(true);
		setLayout(null);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(t1.getText());
		double b=0.0;
		if(e.getSource()==b1){
			b=a*0.63;
		}
		if(e.getSource()==b2){
			b=a*0.00854;
		}
		if(e.getSource()==b3){
			b=a*0.012;
		}
		if(e.getSource()==b4){
			b=a*0.13;
		}
		if(e.getSource()==b5){
			b=a*0.059;
		}
		if(e.getSource()==b6){
			b=a*0.88;
		}
		String res=String.valueOf(b);
		t2.setText(res);
		if(e.getSource()==b0){
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String[] args){
		Converter c = new Converter();
	}


}