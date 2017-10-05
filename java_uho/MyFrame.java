import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
	Container c;
	JButton tombol;
	JTextField teks;
	//JColorChooser j;
	
	
	MyFrame()
	{
		super("Ini Judul");
		c=getContentPane();
		tombol=new JButton("Clik Me!!");
		tombol.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String s="exit";
				String s1="Exit";
				String s2="EXIT";
				teks.getText();
				if((teks.getText()).equals(s)||(teks.getText()).equals(s1)||(teks.getText()).equals(s2))
				{
					System.exit(0);
				}else{
					System.out.println(teks.getText());
				}
			}
		});
		//j=new JColorChooser();
		teks=new JTextField(25);
		c.setLayout(new FlowLayout());
		c.add(tombol);
		c.add(teks);
		//c.add(j);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		new MyFrame();
	}
}