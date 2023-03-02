package CustomShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WoodworkPart extends JFrame {

	private JPanel contentPane;
	private JTextField txtColorBody;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WoodworkPart frame = new WoodworkPart();
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
	public WoodworkPart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBodyWood = new JLabel("Body Wood");
		lblBodyWood.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBodyWood.setBounds(109, 81, 92, 33);
		contentPane.add(lblBodyWood);

		JComboBox cbBody = new JComboBox();
		cbBody.setFont(new Font("Tahoma", Font.PLAIN, 16));

		cbBody.addItem("Alder");
		cbBody.addItem("Mahogany");
		cbBody.addItem("Roaster Pine");

		cbBody.setBounds(236, 81, 189, 33);
		contentPane.add(cbBody);

		JLabel lblColorBody = new JLabel("Body Color");
		lblColorBody.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblColorBody.setBounds(109, 123, 92, 33);
		contentPane.add(lblColorBody);

		txtColorBody = new JTextField();
		txtColorBody.setBounds(236, 123, 189, 33);
		contentPane.add(txtColorBody);
		txtColorBody.setColumns(10);

		JRadioButton relicRadBtn = new JRadioButton("Relic");
		relicRadBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		relicRadBtn.setBounds(431, 136, 72, 23);
		contentPane.add(relicRadBtn);

		JLabel bodyPart = new JLabel("Body Part");
		bodyPart.setFont(new Font("Tahoma", Font.BOLD, 23));
		bodyPart.setBounds(220, 20, 147, 33);
		contentPane.add(bodyPart);

		JLabel neckPart = new JLabel("Neck Part");
		neckPart.setFont(new Font("Tahoma", Font.BOLD, 23));
		neckPart.setBounds(220, 185, 119, 33);
		contentPane.add(neckPart);

		JLabel lblNeckWood = new JLabel("Neck Wood");
		lblNeckWood.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNeckWood.setBounds(109, 240, 92, 33);
		contentPane.add(lblNeckWood);

		JComboBox cbNeck = new JComboBox();

		cbNeck.addItem("Alder");
		cbNeck.addItem("Rosewood");

		cbNeck.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbNeck.setBounds(236, 240, 189, 33);
		contentPane.add(cbNeck);

		JLabel lblShape = new JLabel("Neck Shape");
		lblShape.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblShape.setBounds(109, 282, 104, 33);
		contentPane.add(lblShape);

		JLabel lblRadius = new JLabel("Neck Radius");
		lblRadius.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRadius.setBounds(109, 324, 104, 33);
		contentPane.add(lblRadius);

		JComboBox cbNeckShape = new JComboBox();
		cbNeckShape.addItem("C Shape");
		cbNeckShape.addItem("D Shape");
		cbNeckShape.addItem("U Shape");
		cbNeckShape.addItem("V Shape");
		cbNeckShape.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbNeckShape.setBounds(236, 282, 189, 33);
		contentPane.add(cbNeckShape);

		JComboBox cbRadius = new JComboBox();
		cbRadius.addItem("7.25\" radius ");
		cbRadius.addItem("9.5\" radius ");
		cbRadius.addItem("12\" radius ");
		cbRadius.addItem("16\" radius ");
		cbRadius.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbRadius.setBounds(236, 324, 189, 33);
		contentPane.add(cbRadius);

		JLabel lblFretType = new JLabel("Fret Type");
		lblFretType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFretType.setBounds(109, 366, 92, 33);
		contentPane.add(lblFretType);

		JComboBox cbFretType = new JComboBox();
		cbFretType.setBounds(236, 366, 189, 33);
		contentPane.add(cbFretType);
		cbFretType.addItem("Narrow Tall Fret");
		cbFretType.addItem("Medium Jumbo Fret");
		cbFretType.addItem("Jumbo Fret");
		cbFretType.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtColorBody.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter the Color");
				} else {
					new Hardwares().setVisible(true);
					setVisible(false);
				}

			}
		});
		nextButton.setBounds(567, 462, 89, 23);
		contentPane.add(nextButton);

	}

}
