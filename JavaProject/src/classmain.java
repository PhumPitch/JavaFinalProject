import java.awt.Color;

import javax.swing.*;



public class classmain {

	public static void main(String[] args) {
		  
		ImageIcon image = new ImageIcon("src//logo.png");
		
		JLabel label = new JLabel();
		label.setText("Hey Jude");
		label.setForeground(Color.blue);
		// label.setIcon(image);
		
		JFrame frame = new JFrame();
		frame.setTitle("Study TNI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.add(label);
		
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.white);
	 
		//MyFrame myFrame = new MyFrame();
		
	}

}
