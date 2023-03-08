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
	private JComboBox cbBody;
	private JRadioButton relicRadBtn;
	private JComboBox cbFretType;
	private JComboBox cbRadius;
	private JComboBox cbNeck;
	private JComboBox cbNeckShape;

	public WoodworkPart() {
		PartData data = new PartData();
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

		this.cbBody = new JComboBox();
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

		this.txtColorBody = new JTextField();
		txtColorBody.setBounds(236, 123, 189, 33);
		contentPane.add(txtColorBody);
		txtColorBody.setColumns(10);

		this.relicRadBtn = new JRadioButton("Relic");
		relicRadBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		relicRadBtn.setBounds(431, 136, 72, 23);
		contentPane.add(relicRadBtn);

		JButton ShowColor = new JButton("Show Color");
		ShowColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ColorTable().setVisible(true);
			}
		});
		ShowColor.setBounds(431, 166, 92, 23);
		contentPane.add(ShowColor);

		JLabel bodyPart = new JLabel("Body Part");
		bodyPart.setFont(new Font("Tahoma", Font.BOLD, 23));
		bodyPart.setBounds(220, 20, 147, 33);
		contentPane.add(bodyPart);

		JLabel neckPart = new JLabel("Neck Part");
		neckPart.setFont(new Font("Tahoma", Font.BOLD, 23));
		neckPart.setBounds(220, 207, 119, 33);
		contentPane.add(neckPart);

		JLabel lblNeckWood = new JLabel("Neck Wood");
		lblNeckWood.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNeckWood.setBounds(109, 267, 92, 33);
		contentPane.add(lblNeckWood);

		this.cbNeck = new JComboBox();
		cbNeck.addItem("Alder");
		cbNeck.addItem("Rosewood");

		cbNeck.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbNeck.setBounds(236, 267, 189, 33);
		contentPane.add(cbNeck);

		JLabel lblShape = new JLabel("Neck Shape");
		lblShape.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblShape.setBounds(109, 309, 104, 33);
		contentPane.add(lblShape);

		JLabel lblRadius = new JLabel("Neck Radius");
		lblRadius.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRadius.setBounds(109, 351, 104, 33);
		contentPane.add(lblRadius);

		this.cbNeckShape = new JComboBox();
		cbNeckShape.addItem("C Shape");
		cbNeckShape.addItem("D Shape");
		cbNeckShape.addItem("U Shape");
		cbNeckShape.addItem("V Shape");
		cbNeckShape.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbNeckShape.setBounds(236, 309, 189, 33);
		contentPane.add(cbNeckShape);

		this.cbRadius = new JComboBox();
		cbRadius.addItem("7.25\" radius ");
		cbRadius.addItem("9.5\" radius ");
		cbRadius.addItem("12\" radius ");
		cbRadius.addItem("16\" radius ");
		cbRadius.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbRadius.setBounds(236, 351, 189, 33);
		contentPane.add(cbRadius);

		JLabel lblFretType = new JLabel("Fret Type");
		lblFretType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFretType.setBounds(109, 393, 92, 33);
		contentPane.add(lblFretType);

		this.cbFretType = new JComboBox();
		cbFretType.setBounds(236, 393, 189, 33);
		contentPane.add(cbFretType);
		cbFretType.addItem("Narrow Tall Fret");
		cbFretType.addItem("Medium Jumbo Fret");
		cbFretType.addItem("Jumbo Fret");
		cbFretType.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.setBodyWood(cbBody.getSelectedItem().toString());
				data.setColor(txtColorBody.getText());
				data.setRelic(relicRadBtn.isSelected());
				data.setNeckWood(cbNeck.getSelectedItem().toString());
				data.setNeckShape(cbNeckShape.getSelectedItem().toString());
				data.setNeckRadius(cbRadius.getSelectedItem().toString());
				data.setFretType(cbFretType.getSelectedItem().toString());
				if (txtColorBody.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter the Color");
				} else {
					new Hardwares(data).setVisible(true);
					setVisible(false);
					dispose();
				}
			}
		});
		nextButton.setBounds(585, 477, 89, 23);
		contentPane.add(nextButton);

	}

	public void setTxtColorBody(String txtColorBody) {
		this.txtColorBody.setText(txtColorBody);
	}

	public void setCbBody(String cbBody) {
		this.cbBody.setSelectedItem(cbBody);
	}

	public void setRelicRadBtn(boolean relicRadBtn) {
		this.relicRadBtn.setSelected(relicRadBtn);
	}

	public void setCbFretType(String cbFretType) {
		this.cbFretType.setSelectedItem(cbFretType);
	}

	public void setCbRadius(String cbRadius) {
		this.cbRadius.setSelectedItem(cbRadius);
	}

	public void setCbNeck(String cbNeck) {
		this.cbNeck.setSelectedItem(cbNeck);
	}

	public void setCbNeckShape(String cbNeckShape) {
		this.cbNeckShape.setSelectedItem(cbNeckShape);
	}
}
