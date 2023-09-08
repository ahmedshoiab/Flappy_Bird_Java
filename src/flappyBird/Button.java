package flappyBird;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Button {
	JButton btnNewButton;
	private JFrame frame;


	public Button() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 686, 508);
	//	frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 btnNewButton = new JButton("Start ");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(298, 352, 129, 42);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
				FlappyBird a = null;
				a.flappyBird =new FlappyBird();
				frame.setVisible(false);
				}	
		//		JOptionPane.showMessageDialog(null, "Hello, How are you?");
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBounds(75, 38, 536, 239);
		ImageIcon img = new  ImageIcon(this.getClass().getResource("/images.jpg"));
		 frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		
	}
}
