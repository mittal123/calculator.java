import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
Frame f;
Button b1,b2,b3;
TextField tf,tf1,tf2,tf3,tf4;
 Calculator(String s)
  {
   f = new Frame(s);
    b1=new Button("Sum");
    b2=new Button("Multiply");
    b3=new Button("Difference");
   b3.addActionListener(this);
   b1.addActionListener(this);
   b2.addActionListener(this);
   tf=new TextField();
    tf1=new TextField();
    tf2=new TextField();
tf3=new TextField();
tf4=new TextField();
f.addWindowListener(new WindowEventListener());
 f.add(tf);
     f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(tf4);
    f.add(b1);
     f.add(b2);
     f.add(b3);
    f.setSize(400,400);
   f.setVisible(true);
   f.setLayout(new FlowLayout());
 }
public void actionPerformed(ActionEvent e)
{
String s1=tf.getText();
String s2=tf1.getText();
int n1=Integer.parseInt(s1);
int n2=Integer.parseInt(s2);
int n3=n1+n2;
String z=String.valueOf(n3);
String s3=tf.getText();
String s4=tf1.getText();
int n4=Integer.parseInt(s3);
int n5=Integer.parseInt(s4);
int n6=n4*n5;
String a=String.valueOf(n6);
String s5=tf.getText();
String s6=tf1.getText();
int n7=Integer.parseInt(s5);
int n8=Integer.parseInt(s6);
int n9=n7-n8;
String c=String.valueOf(n9);
if(e.getSource()==b1)
tf2.setText(z);                                                                                     
if(e.getSource()==b2)
tf3.setText(a);
if(e.getSource()==b3)
tf4.setText(c);
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
     new Calculator("FF");
    }
}