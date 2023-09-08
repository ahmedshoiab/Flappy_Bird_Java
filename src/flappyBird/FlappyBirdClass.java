package flappyBird;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;

public class FlappyBirdClass extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public FlappyBirdClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 723, 538);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lblNewLabel = new JLabel(" ");
		
		lblNewLabel.setIcon(new  ImageIcon(getClass().getResource("/Pics.png")));
		lblNewLabel.setBounds(21, 40, 641, 340);
		frame.getContentPane().setLayout(null);
	     frame.getContentPane().add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(21, 408, 648, 33);
		frame.getContentPane().add(progressBar);
		
		for(int i=0;i<101;i++)
		{
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			progressBar.setValue(i);
		}
		if(progressBar.getValue()>99)
		{
			
			new Button();
			frame.setVisible(false);
			
		}
		
	}
}
