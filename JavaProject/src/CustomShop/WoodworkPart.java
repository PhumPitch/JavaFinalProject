package CustomShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

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
		setBounds(100, 100, 636, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWoodBody = new JLabel("Wood Body");
		lblWoodBody.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWoodBody.setBounds(109, 69, 92, 33);
		contentPane.add(lblWoodBody);
		
		JComboBox cbBody = new JComboBox();
		cbBody.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		cbBody.addItem("Alder");
		cbBody.addItem("Mahogany");
		cbBody.addItem("Roaster Pine");
		
		cbBody.setBounds(236, 70, 160, 33);
		contentPane.add(cbBody);
		
		JLabel lblColorBody = new JLabel("Color Body");
		lblColorBody.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblColorBody.setBounds(109, 112, 92, 33);
		contentPane.add(lblColorBody);
		
		txtColorBody = new JTextField();
		txtColorBody.setBounds(236, 112, 160, 33);
		contentPane.add(txtColorBody);
		txtColorBody.setColumns(10);
		
		JLabel bodyPart = new JLabel("Body Part");
		bodyPart.setFont(new Font("Tahoma", Font.BOLD, 23));
		bodyPart.setBounds(212, 20, 147, 33);
		contentPane.add(bodyPart);
		
		JLabel neckPart = new JLabel("Neck Part");
		neckPart.setFont(new Font("Tahoma", Font.BOLD, 23));
		neckPart.setBounds(212, 161, 147, 33);
		contentPane.add(neckPart);
		
		JLabel lblNeckBody = new JLabel("Neck Body");
		lblNeckBody.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNeckBody.setBounds(109, 210, 92, 33);
		contentPane.add(lblNeckBody);
		
		JComboBox cbNeck = new JComboBox();
		
		cbNeck.addItem("Alder");
		cbNeck.addItem("Rosewood");
		
		cbNeck.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbNeck.setBounds(236, 211, 160, 33);
		contentPane.add(cbNeck);
		
		JLabel lblShape = new JLabel("Neck Shape");
		lblShape.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblShape.setBounds(109, 253, 104, 33);
		contentPane.add(lblShape);
		
		JLabel lblRadius = new JLabel("Neck Radius");
		lblRadius.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRadius.setBounds(109, 297, 104, 33);
		contentPane.add(lblRadius);
		
		JComboBox cbNeckShape = new JComboBox();
		cbNeckShape.addItem("C Shape");
		cbNeckShape.addItem("D Shape");
		cbNeckShape.addItem("U Shape");
		cbNeckShape.addItem("V Shape");
		cbNeckShape.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbNeckShape.setBounds(236, 254, 160, 33);
		contentPane.add(cbNeckShape);
		
		
		JComboBox cbRadius = new JComboBox();
		cbRadius.addItem("7.25\" radius ");
		cbRadius.addItem("9.5\" radius ");
		cbRadius.addItem("12\" radius ");
		cbRadius.addItem("16\" radius ");
		cbRadius.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbRadius.setBounds(236, 297, 160, 33);
		contentPane.add(cbRadius);
	}
}
