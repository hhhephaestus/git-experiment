package _01;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class lifegame extends JFrame
{
	private static map MAP = new map();
	
	public lifegame()
	{		
		getContentPane().add(MAP);
	}
	
    public static void main(String[] args) 
    {
    	lifegame frame = new lifegame();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 850);
        frame.setTitle("Game of Life");
        frame.setVisible(true);
        frame.setResizable(false);
        
        MAP.run();
    }	
}
