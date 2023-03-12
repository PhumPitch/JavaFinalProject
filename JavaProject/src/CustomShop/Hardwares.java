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
	private final PartData data;
	private JComboBox cbPickUp;
	private JComboBox cbSaddle;
	private JComboBox cbTuner;
	private JComboBox cbHandSide;
	private JComboBox cbPickGuard;
	private JComboBox cbPlasticColor;
	private JComboBox cbHardwareColor;
	private JCheckBox chckbxHardCase;

	public Hardwares(PartData data) {
		this.data = data;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
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
		cbSaddle.addItem("2-Point Tremolo");
		cbSaddle.addItem("Floyd Rose Tremolo");

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
		cbHandSide.addItem("Right-Handed");
		cbHandSide.addItem("Left-Handed");

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

		JCheckBox chckbxHardCase = new JCheckBox("Hard Case");
		chckbxHardCase.setBounds(250, 434, 97, 23);
		contentPane.add(chckbxHardCase);

		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null,"Are you sure for this information ?");
				if (confirm == 0) {
				PartHardwares dataHW = new PartHardwares();
				dataHW.setPickUps(cbPickUp.getSelectedItem().toString());
				dataHW.setSaddle(cbSaddle.getSelectedItem().toString());
				dataHW.setTuner(cbTuner.getSelectedItem().toString());
				dataHW.setHandside(cbHandSide.getSelectedItem().toString());
				dataHW.setPickguard(cbPickGuard.getSelectedItem().toString());
				dataHW.setPlasticColor(cbPlasticColor.getSelectedItem().toString());
				dataHW.setHardwareColor(cbHardwareColor.getSelectedItem().toString());
				dataHW.setHardCase(chckbxHardCase.isSelected());
				Bills bill = new Bills(data, dataHW);
				bill.setLocation(getLocation());
				bill.setVisible(true);
				
				setVisible(false);
				dispose();
				}
				
			}
		});
		nextButton.setBounds(585, 477, 89, 23);
		contentPane.add(nextButton);

		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WoodworkPart woodwork = new WoodworkPart();
				woodwork.setCbBody(data.getBodyWood());
				woodwork.setTxtColorBody(data.getColor());
				woodwork.setCbNeck(data.getNeckWood());
				woodwork.setCbNeckShape(data.getNeckShape());
				woodwork.setCbRadius(data.getNeckRadius());
				woodwork.setRelicRadBtn(data.isRelic());
				woodwork.setCbFretType(data.getFretType());
				woodwork.setLocation(getLocation());
				woodwork.setVisible(true);
				dispose();
			}
		});
		BackButton.setBounds(10, 477, 89, 23);
		contentPane.add(BackButton);

	}

	public void setCbPickUp(String cbPickUp) {
		this.cbPickUp.setSelectedItem(cbPickUp);
	}

	public void setCbSaddle(String cbSaddle) {
		this.cbSaddle.setSelectedItem(cbSaddle);
	}

	public void setCbTuner(String cbTuner) {
		this.cbTuner.setSelectedItem(cbSaddle);
	}

	public void setCbHandSide(String cbHandSide) {
		this.cbHandSide.setSelectedItem(cbHandSide);
	}

	public void setCbPickGuard(String cbPickGuard) {
		this.cbPickGuard.setSelectedItem(cbPickGuard);
	}

	public void setCbPlasticColor(String cbPlasticColor) {
		this.cbPlasticColor.setSelectedItem(cbPlasticColor);
	}

	public void setCbHardwareColor(String cbHardwareColor) {
		this.cbHardwareColor.setSelectedItem(cbHardwareColor);
	}

	public void setChckbxHardCase(boolean chckbxHardCase) {
		this.chckbxHardCase.setSelected(chckbxHardCase);;
	}
}
