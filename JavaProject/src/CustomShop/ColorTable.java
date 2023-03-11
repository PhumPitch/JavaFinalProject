package CustomShop;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorTable extends JFrame {

	private JPanel contentPane;

	public ColorTable() {
		
		setBounds(100, 100, 750, 950);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		

		ImageIcon imgcolor = new ImageIcon(this.getClass().getResource("/ColorRow.png"));
		setContentPane(contentPane);

		JLabel lblColorImg = new JLabel(imgcolor);
		lblColorImg.setBounds(30, 24, 681, 887);
		contentPane.add(lblColorImg);

		
	}
}
