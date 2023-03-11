package CustomShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Bills extends JFrame {

	private JPanel contentPane;
	private final PartData data;
	private final PartHardwares dataHW;

	public Bills(PartData data, PartHardwares dataHW) {
		this.data = data;
		this.dataHW = dataHW;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLine = new JLabel(
				"--------------------------------------------------------------------------------------");
		lblLine.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLine.setBounds(42, 50, 610, 14);
		contentPane.add(lblLine);
		
		
		JLabel lblLine_1 = new JLabel(
				"--------------------------------------------------------------------------------------");
		lblLine_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLine_1.setBounds(42, 367, 610, 14);
		contentPane.add(lblLine_1);
		
		
		JLabel lblSendthis = new JLabel("PLEASE SEND ORDER DETAILS TO SHOP EMAIL ");
		lblSendthis.setForeground(new Color(255, 99, 23));
		lblSendthis.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSendthis.setBounds(94, 11, 501, 28);
		contentPane.add(lblSendthis);

		
		JLabel lblGuitar = new JLabel( (data.isRelic()?" Relic ":" ") +
				(data.getColor().toString())+ " " + "Stratocaster " + "("+dataHW.getHandside().toString()+")");
		
		lblGuitar.setForeground(new Color(0, 0, 64));
		lblGuitar.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblGuitar.setBounds(42, 58, 610, 51);
		contentPane.add(lblGuitar);
		
		
		JLabel lblBodyPart = new JLabel("Body Part");
		lblBodyPart.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBodyPart.setBounds(42, 123, 91, 21);
		contentPane.add(lblBodyPart);
		
		JLabel lblBodyWood = new JLabel("Body Wood : " + data.getBodyWood().toString());
		lblBodyWood.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBodyWood.setBounds(42, 150, 213, 21);
		contentPane.add(lblBodyWood);
		
		JLabel lblBodyColor = new JLabel("Body Color : " + data.getColor().toString());
		lblBodyColor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBodyColor.setBounds(42, 175, 213, 21);
		contentPane.add(lblBodyColor);
		
		JLabel lblRelic = new JLabel("Relic : " + (data.isRelic()?"Relic":"-"));
		lblRelic.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRelic.setBounds(42, 200, 213, 21);
		contentPane.add(lblRelic);
		
		JLabel lblNeckPart = new JLabel("Neck Part");
		lblNeckPart.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNeckPart.setBounds(42, 232, 91, 21);
		contentPane.add(lblNeckPart);
		
		JLabel lblNeckWood = new JLabel("Neck Wood : " + data.getNeckWood().toString());
		lblNeckWood.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNeckWood.setBounds(42, 259, 213, 21);
		contentPane.add(lblNeckWood);
		
		JLabel lblNeckShape = new JLabel("Neck Shape : " + data.getNeckShape().toString());
		lblNeckShape.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNeckShape.setBounds(42, 284, 213, 21);
		contentPane.add(lblNeckShape);
		
		JLabel lblRadius = new JLabel("Radius : " + data.getNeckRadius().toString());
		lblRadius.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRadius.setBounds(42, 309, 213, 21);
		contentPane.add(lblRadius);
		
		JLabel lblFretType = new JLabel("Fret Type : " + data.getFretType().toString());
		lblFretType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFretType.setBounds(42, 334, 213, 21);
		contentPane.add(lblFretType);
		
		JLabel lblHardwares = new JLabel("Hardwares");
		lblHardwares.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblHardwares.setBounds(296, 123, 123, 21);
		contentPane.add(lblHardwares);
		
		JLabel lblPickUps = new JLabel("Pickups : " + dataHW.getPickUps().toString());
		lblPickUps.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPickUps.setBounds(296, 150, 213, 21);
		contentPane.add(lblPickUps);
		
		JLabel lblSaddle = new JLabel("Saddle : " + dataHW.getSaddle().toString());
		lblSaddle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSaddle.setBounds(296, 175, 213, 21);
		contentPane.add(lblSaddle);
		
		JLabel lblTurner = new JLabel("Turner : " + dataHW.getTuner().toString());
		lblTurner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTurner.setBounds(296, 200, 213, 21);
		contentPane.add(lblTurner);
		
		JLabel lblAccessories = new JLabel("Accessories");
		lblAccessories.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAccessories.setBounds(296, 232, 123, 21);
		contentPane.add(lblAccessories);
		
		JLabel lblPickguard = new JLabel("Pickguard : " + dataHW.getPickguard().toString());
		lblPickguard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPickguard.setBounds(296, 259, 213, 21);
		contentPane.add(lblPickguard);
		
		JLabel lblPartColor = new JLabel("Part Color : " + dataHW.getPlasticColor().toString());
		lblPartColor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPartColor.setBounds(296, 284, 213, 21);
		contentPane.add(lblPartColor);
		
		JLabel lblHardwareColor = new JLabel("Hardware Color  : " + dataHW.getHardwareColor().toString());
		lblHardwareColor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHardwareColor.setBounds(296, 309, 213, 21);
		contentPane.add(lblHardwareColor);
		
		JLabel lblHardcase = new JLabel("Hardcase : " + (dataHW.isHardCase()?"With Hardacase":"NO Hardcase"));
		lblHardcase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHardcase.setBounds(296, 334, 213, 21);
		contentPane.add(lblHardcase);
		
		JLabel lblGuitarPrice = new JLabel("Guitar : 150,000 Baht.");
		lblGuitarPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGuitarPrice.setBounds(42, 390, 260, 21);
		contentPane.add(lblGuitarPrice);
		
		JLabel lblRelicPrice = new JLabel("Relic    : "+ (data.isRelic()?"2,000 Baht.":"-"));
		lblRelicPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelicPrice.setBounds(42, 415, 260, 21);
		contentPane.add(lblRelicPrice);
		
		JLabel lblHardcasePrice = new JLabel("Hardcase : " + (dataHW.isHardCase()?"7,000 Baht.":"-"));
		lblHardcasePrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHardcasePrice.setBounds(42, 440, 260, 21);
		contentPane.add(lblHardcasePrice);
		
		int relicCost = data.isRelic()?2000:0;
		int HardcaseCost = dataHW.isHardCase()?7000:0;
		int total = 150000 + relicCost + HardcaseCost;
		
		DecimalFormat decFor = new DecimalFormat("#,###.##");
		
		JLabel lblTotal = new JLabel("Total : " + decFor.format(total));
		lblTotal.setForeground(new Color(64, 0, 128));
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTotal.setBounds(296, 392, 260, 19);
		contentPane.add(lblTotal);
		
		
		

	}
}
