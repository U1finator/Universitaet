package vierGewinnt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameUI extends JFrame 
{
	private static final long serialVersionUID = 1L;

	private Game g;
	
	private JPanel mypanel;
	private JPanel buttonpanel;
	
	public GameUI(Game g)
	{
		super();
		this.g=g;

		updatePanel();
		
		GridLayout gl = new GridLayout(0,g.sizeX);
		buttonpanel = new JPanel();
		buttonpanel.setLayout(gl);
		for (int i=0;i<g.sizeX;i++)
		{
			JButton b = new JButton(""+(i+1));
			final int p = i;
			final GameUI t = this;
			b.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					g.setCoin(p);
					t.updatePanel();
					t.check4Winner();
				}
			});
			buttonpanel.add(b);
		}
		this.add(buttonpanel, BorderLayout.NORTH);
		
		this.setSize(250,250);
		this.setLocation(300,300);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	protected void check4Winner()
	{
		int r = g.isWinner();
		
		if (r!=0)
		{
			remove(mypanel);
			JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			JLabel l = new JLabel("Spieler " + r+ " hat gewonnen!");
			l.setHorizontalAlignment(SwingConstants.CENTER);
			l.setFont(new Font("Calibri",Font.PLAIN, 14));
			p.add(l);
			add(p,BorderLayout.CENTER);
			validate();
		}		
	}
	
	protected void updatePanel()
	{
		if (mypanel != null) 
			this.remove(mypanel);
		GridLayout gl = new GridLayout(g.sizeY,g.sizeX);
		
		mypanel = new JPanel();
		mypanel.setLayout(gl);
		
		for (int y=g.sizeY-1;y>=0;y--)
		{
			for (int x=0;x<g.sizeX;x++)
			{
				JPanel p = new JPanel();
				switch (g.getXY(x, y))
				{
					case 0->p.setBackground(Color.white);
					case 1->p.setBackground(Color.blue);
					case 2->p.setBackground(Color.red);
				}
				mypanel.add(p);				
			}
		}	
		add(mypanel,BorderLayout.CENTER);
	    validate();
	}
	
	public static void main(String[] args) 
	{
		Game g = new Game();
		
		new GameUI(g);
	}
}