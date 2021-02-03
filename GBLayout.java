import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GBLayout extends JFrame
{
	public GBLayout()
	{
		this.setTitle("GridBag Layout Example");
		this.setBounds(100,100,600,300);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JButton btn1 = new JButton("button 1");
		JButton btn2 = new JButton("button 2");
		
		btn1.setPreferredSize(new Dimension(130,50));
		btn2.setPreferredSize(new Dimension(80,80));
		
		gbc.gridwidth=5;
		gbc.gridx=0;
		gbc.gridy=0;
		add(btn1,gbc);
		
		gbc.gridx=2;
		gbc.gridy=1;
		add(btn2,gbc);
		
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		GBLayout gb = new GBLayout();
	}
}
