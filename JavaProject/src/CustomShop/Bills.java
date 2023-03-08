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

public class Bills extends JFrame {

	private JPanel contentPane;
	private final PartData data;
	public Bills(PartData data) {
		this.data = data;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBills = new JLabel("Order Detials");
		lblBills.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblBills.setBounds(251, 28, 185, 28);
		contentPane.add(lblBills);
		
		JLabel lblLine = new JLabel("--------------------------------------------------------------------------------------");
		lblLine.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLine.setBounds(42, 77, 610, 14);
		contentPane.add(lblLine);
		
		JLabel lblLine_1 = new JLabel("--------------------------------------------------------------------------------------");
		lblLine_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLine_1.setBounds(42, 374, 610, 14);
		contentPane.add(lblLine_1);
		
	}
}
