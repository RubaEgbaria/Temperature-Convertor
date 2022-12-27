package myGUI ;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
class GUI extends JFrame implements ActionListener
{
    public JTextField C,F,K,c;  
	private JLabel b1,b2,b3,b4,b,lc,lF,lC,lK;
    private JButton calc,clear;
    public Graphics t ; 
    
	public GUI() 
	{
		  setLayout(new FlowLayout ());
		  b = new JLabel(" WELCOME TO MY TEMPERATURE CONVERTOR :) ");
		  b.setForeground(Color.pink);
		  add(b);
		  // The main code..
		  setTitle("Temperature Convertor");
	      setSize(200,300);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	      JPanel p1 = new JPanel (new FlowLayout (FlowLayout.RIGHT));
	      JPanel p2 = new JPanel (new FlowLayout (FlowLayout.LEFT));
	    // field..   
	    c = new JTextField("0",15);
        C = new JTextField("0",15);
        K = new JTextField("0",15);
        F = new JTextField("0",15); 
        // labels..
        lc = new JLabel ( "                 ");
        lF = new JLabel ( "                 ");
        lC = new JLabel ( "                 ");
        lK = new JLabel ( "                 ");
        b1 = new JLabel("CELSIUS");     b1.setForeground(Color.magenta);
        b2 = new JLabel("Fahrenheit");  b2.setForeground(Color.gray);
        b3 = new JLabel("Celsius");     b3.setForeground(Color.magenta);
        b4 = new JLabel("Kelvin");      b4.setForeground(Color.gray);
        // Buttons ..
        calc = new JButton("Calculate");  calc.addActionListener(this);   
        clear = new JButton("Clear it");  clear.addActionListener(this);  
        // Just trying to show it better 
        
        // add it all to the window ..
        p2.add(b1);
        p2.add(c);
        p2.add(b2);  
        p2.add(F);
        p2.add(b3); 
        p2.add(C);
        p2.add(b4);
        p2.add(K);
        // buttons 
        p1.add(calc);
        p1.add(clear);
        // panels ..  
        p2.add(p1);
        add(p2);
        // let the window be nicer 
        pack();
        System.out.println("Constructor is called");
        setVisible(true);
	}// the end of the main constructor .. 
	
	// the most important function in this code .. 
	public void actionPerformed ( ActionEvent e)
	{
		double z_c = Double.parseDouble(c.getText());
		
		// the important one .. 
		
		if (e.getSource() == calc ) 
			{
			JOptionPane.showMessageDialog(null, "You clicked the Calculater button .");
	        calc.setForeground(Color.magenta);
			c.setText((z_c)+ "       ");
			K.setText((z_c + 273.15) + "       ");
			C.setText((z_c)+ "       ");
			F.setText((z_c * 1.80) + 32.00 + "       ");
		} // if 
		else if (e.getSource() == clear ) 
		{
			JOptionPane.showMessageDialog(null, "You clicked the Clear button.");
			clear.setForeground(Color.magenta);
			c.setText( 0 + "       ");
			K.setText( 0 + "       ");
			C.setText( 0 + "       ");
			F.setText( 0 + "       ");
		} // else 
		else 
		{
		JOptionPane.showMessageDialog( null,  " oops nothing to click on .. just I wanted to use it .");
		}
} // the end of the most important function ... 
}// the end of the general class 
public class myGUI  
{ 
public static void main (String [] args) 
{
GUI c = new GUI () ; 
System.out.println(" HI ") ;
	}

}