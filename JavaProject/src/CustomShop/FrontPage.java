package CustomShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

public class FrontPage extends JFrame {

	private JPanel contentPane;
	private String emailChk;
	private String dateLine;
	private String email;

	private String body;
	private String neck;

	private String hardwares;
	private String pickup;
	private String saddle;
	private String tuner;
	private String pickguard;
	private String plasticColor;
	private String hardwaresColor;
	private String hardcase;
	private String total;
	private String line;

	/*
	 * 
	 * BufferedReader read =new BufferedReader(new FileReader(toRead)); String temp
	 * = ""; while((temp = read.readLine())!= null ) { String orderDetails = temp;
	 * read.close(); }
	 */
	public void CheckOrder(String check) throws IOException {
		emailChk = check;
		File toRead = new File(Paths.get("").toAbsolutePath() + "\\Bill.txt");
		Scanner scan = new Scanner(toRead);
		int countLoop = 0;
		int countElse = 0;
		while (scan.hasNext()) {
			dateLine = scan.nextLine();
			email = scan.nextLine();
			scan.nextLine();
			body = scan.nextLine();
			neck = scan.nextLine();
			scan.nextLine();
			hardwares = scan.nextLine();
			pickup = scan.nextLine();
			saddle = scan.nextLine();
			tuner = scan.nextLine();
			pickguard = scan.nextLine();
			plasticColor = scan.nextLine();
			hardwaresColor = scan.nextLine();
			hardcase = scan.nextLine();
			total = scan.nextLine();
			line = scan.nextLine();
			countLoop++;

			if (emailChk.toLowerCase().equals(email)) {
				JOptionPane.showMessageDialog(null,
						(dateLine + "\n" + email + "\n\n" + body + "\n" + neck + "\n\n" + hardwares + "\n" + pickup
								+ "\n" + pickup + "\n" + saddle + "\n" + tuner + "\n" + pickguard + "\n" + plasticColor
								+ "\n" + hardwaresColor + "\n" + hardcase + "\n" + total + "\n" + line));

			} else {
				countElse++;

			}
			if (countLoop == countElse || scan.next().equals(""))
				JOptionPane.showMessageDialog(null, " This Email has NO Order ");

		}

		scan.close();
	}

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
				WoodworkPart woodwork = new WoodworkPart();
				woodwork.setLocation(getLocation());
				woodwork.setVisible(true);
				dispose();
			}
		});
		btnLetsBuildYour.setBounds(64, 286, 551, 68);
		contentPane.add(btnLetsBuildYour);

		JLabel lblWelcomePage = new JLabel("Welcome To PPB's Stratocaster Custom Shop");
		lblWelcomePage.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblWelcomePage.setBounds(43, 128, 598, 129);
		contentPane.add(lblWelcomePage);

		JButton btnCheckYourOrder = new JButton("Check Your Order");
		btnCheckYourOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emailChk = JOptionPane.showInputDialog(null, "Input Your Email To Check Your Order");
				while(!emailChk.endsWith("@gmail.com")) {
					emailChk = JOptionPane.showInputDialog(null, "Input Your Email To Check Your Order, with Gmail");
				}
				String check = ("email : " + emailChk);
				try {
					CheckOrder(check);

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnCheckYourOrder.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCheckYourOrder.setBounds(64, 383, 551, 68);
		contentPane.add(btnCheckYourOrder);
	}
}
