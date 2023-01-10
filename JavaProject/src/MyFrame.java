import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	MyFrame() {
		this.setTitle("Study TNI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(420,420);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("src\\logo.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.black);
			
	}

}
