package CustomShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Hardwares extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hardwares frame = new Hardwares();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hardwares() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700,550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Hardwares = new JLabel("Hardwares");
		Hardwares.setFont(new Font("Tahoma", Font.BOLD, 23));
		Hardwares.setBounds(220, 20, 147, 33);
		contentPane.add(Hardwares);
		
		JLabel lblPickUp = new JLabel("Pickups");
		lblPickUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPickUp.setBounds(109, 75, 92, 33);
		contentPane.add(lblPickUp);
		
		JComboBox cbPickUp = new JComboBox();
		cbPickUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbPickUp.setBounds(250, 75, 189, 33);
		contentPane.add(cbPickUp);
		cbPickUp.addItem("S-S-S");
		cbPickUp.addItem("H-S-S");
		cbPickUp.addItem("H-S-H");
		
		JLabel lblSaddle = new JLabel("Saddle");
		lblSaddle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSaddle.setBounds(109, 118, 92, 33);
		contentPane.add(lblSaddle);
		
		
		JComboBox cbSaddle = new JComboBox();
		cbSaddle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbSaddle.setBounds(250, 118, 189, 33);
		contentPane.add(cbSaddle);
		cbSaddle.addItem("6-Saddle Tremolo");
		cbSaddle.addItem("2-Piont Tremolo");
		cbPickUp.addItem("Floyd Rose Tremolo");
		
		JLabel lblTuner = new JLabel("Tuner");
		lblTuner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTuner.setBounds(109, 160, 92, 33);
		contentPane.add(lblTuner);
		
		JComboBox cbTuner = new JComboBox();
		cbTuner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbTuner.setBounds(250, 160, 189, 33);
		contentPane.add(cbTuner);
		cbTuner.addItem("Standard Tuners");
		cbTuner.addItem("Vintage Locking Tuner");
		cbTuner.addItem("Deluxe Locking Tuner");
		
		JLabel Accessories = new JLabel("Accessories");
		Accessories.setFont(new Font("Tahoma", Font.BOLD, 23));
		Accessories.setBounds(220, 212, 147, 33);
		contentPane.add(Accessories);
		
		JLabel lblHandSide = new JLabel("Hand Side");
		lblHandSide.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHandSide.setBounds(109, 265, 85, 33);
		contentPane.add(lblHandSide);
		
		JComboBox cbHandSide = new JComboBox();
		cbHandSide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbHandSide.setBounds(250, 265, 189, 33);
		contentPane.add(cbHandSide);
		cbHandSide.addItem("Left Handed");
		cbHandSide.addItem("Right Handed");
		
		JLabel lblPickGuard = new JLabel("Pickguard");
		lblPickGuard.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPickGuard.setBounds(109, 309, 85, 33);
		contentPane.add(lblPickGuard);
		
		JComboBox cbPickGuard = new JComboBox();
		cbPickGuard.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbPickGuard.setBounds(250, 309, 189, 33);
		contentPane.add(cbPickGuard);
		cbPickGuard.addItem("Modern Style");
		cbPickGuard.addItem("50's Vintage Style");
		cbPickGuard.addItem("1-Ply Style");
		cbPickGuard.addItem("3-Ply Style");
		
		JLabel lblPlasticColor = new JLabel("Plastic Color");
		lblPlasticColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlasticColor.setBounds(109, 351, 147, 33);
		contentPane.add(lblPlasticColor);
		
		JComboBox cbPlasticColor = new JComboBox();
		cbPlasticColor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbPlasticColor.setBounds(250, 351, 189, 33);
		contentPane.add(cbPlasticColor);
		cbPlasticColor.addItem("White");
		cbPlasticColor.addItem("Aged White");
		cbPlasticColor.addItem("Vintage White");
		cbPlasticColor.addItem("Black");
		
		JLabel lblHardwareColor = new JLabel("Hardware Color");
		lblHardwareColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHardwareColor.setBounds(109, 394, 126, 33);
		contentPane.add(lblHardwareColor);
		
		JComboBox cbHardwareColor = new JComboBox();
		cbHardwareColor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbHardwareColor.setBounds(250, 394, 189, 33);
		contentPane.add(cbHardwareColor);
		cbHardwareColor.addItem("Chrome");
		cbHardwareColor.addItem("Gold");
		cbHardwareColor.addItem("Vintage Aged");
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new Hardwares().setVisible(true);
					setVisible(false);
			}
		});
		nextButton.setBounds(585, 477, 89, 23);
		contentPane.add(nextButton);
		
		JButton PrevButton = new JButton("Previous");
		PrevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WoodworkPart().setVisible(true);
				setVisible(false);
			}
		});
		PrevButton.setBounds(10, 477, 89, 23);
		contentPane.add(PrevButton);
		
		JCheckBox chckbxHardCase = new JCheckBox("Hard Case");
		chckbxHardCase.setBounds(250, 434, 97, 23);
		contentPane.add(chckbxHardCase);
		
		

	}
}
