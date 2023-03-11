package CustomShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class FrontPage extends JFrame {

	private JPanel contentPane;
	public FrontPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLetsBuildYour = new JButton("Let's Build Your Own Stratocaster Guitar !");
		btnLetsBuildYour.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLetsBuildYour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WoodworkPart().setVisible(true);
				dispose();
			}
		});
		btnLetsBuildYour.setBounds(65, 313, 551, 68);
		contentPane.add(btnLetsBuildYour);
		
		JLabel lblWelcomePage = new JLabel("Welcome To PPB's Stratocaster Custom Shop");
		lblWelcomePage.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblWelcomePage.setBounds(43, 128, 598, 129);
		contentPane.add(lblWelcomePage);
	}

}
