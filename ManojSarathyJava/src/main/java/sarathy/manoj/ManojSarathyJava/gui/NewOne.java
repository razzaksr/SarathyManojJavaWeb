package sarathy.manoj.ManojSarathyJava.gui;

import javax.swing.JFrame;

public class NewOne extends JFrame 
{
	public NewOne()
	{
		setSize(300, 200);
		setTitle("First Title");
	}
	public static void main(String[] args) 
	{
		NewOne one=new NewOne();
		one.setVisible(true);
	}
}
