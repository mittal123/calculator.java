import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator1 implements ActionListener
{
Frame f;
String k[]={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};
Button b[]=new Button[15];
int c;
String s1,s2,s3,s4,s5,s6,s7,s8;
TextField tf,tf1,tf2;
 Calculator1(String s)
  {
JFrame f = new JFrame(s);
 f.setSize(400,400);
   f.setVisible(true);
tf=new TextField();
tf1=new TextField();
f.add(tf);
f.add(tf1);
tf2=new TextField();
f.add(tf2);
f.addWindowListener(new WindowEventListener());
//f.setLayout(new FlowLayout());
GridLayout fl=new GridLayout(4,4,10,20);
f.setLayout(fl);
for(int i=0;i<=14;i++)
{
  b[i]=new Button(k[i]);
Font bigFont=new Font("serif",Font.BOLD,32);
Font biFont=new Font("serif",Font.BOLD,64);
b[i].setFont(bigFont);
tf.setFont(biFont);
tf1.setFont(biFont);
tf2.setFont(biFont);
      b[i].setBounds(40*i,40,40+i,40);
    f.add(b[i]); 
b[i].addActionListener(this);
}
}
public void actionPerformed(ActionEvent e)
{
for(int i=0;i<=9;i++)
{
if(e.getSource()==b[i])
{
s3=tf.getText();
s4=k[i];
s5=s3+s4;
tf.setText(s5);
}
}
if(e.getSource()==b[10])
{
s1=tf.getText();
//tf.setText("");
tf=tf1;
c=1;
}
if(e.getSource()==b[11])
{
s1=tf.getText();
//tf.setText("");
tf=tf1;
c=2;
}
if(e.getSource()==b[12])
{
s1=tf.getText();
//tf.setText("");
tf=tf1;
c=3;
}
if(e.getSource()==b[13])
{
s1=tf.getText();
//tf.setText("");
tf=tf1;
c=4;
}
if(e.getSource()==b[14])
{
//s1=tf.getText();
s2=tf1.getText();
if(c==1)
{
int n=Integer.parseInt(s1)+Integer.parseInt(s2);
tf2.setText(String.valueOf(n));
}
}
if(e.getSource()==b[14])
{
//s1=tf.getText();
s2=tf1.getText();
if(c==2)
{
int n=Integer.parseInt(s1)-Integer.parseInt(s2);
tf2.setText(String.valueOf(n));
}
}
if(e.getSource()==b[14])
{
//s1=tf.getText();
s2=tf1.getText();
if(c==3)
{
int n=Integer.parseInt(s1)*Integer.parseInt(s2);
tf2.setText(String.valueOf(n));
}
}
if(e.getSource()==b[14])
{
//s1=tf.getText();
s2=tf1.getText();
if(c==4)
{ 
int s=Integer.parseInt(s2);
if(s!=0)
{
int n=Integer.parseInt(s1)/Integer.parseInt(s2);
tf2.setText(String.valueOf(n));
}
else
tf2.setText("Undefined");
}
}
}
class WindowEventListener extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
 public static void main(String...s)
    {
     new Calculator1("SF");
    }
}