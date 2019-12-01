package ar.TpDisenio2019.Ui.BuscarCliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class buscarCliente1 extends JFrame {
	private JTextField textField_Cliente;
	private JTextField textField_Apellido;
	private JTextField textField_TipoDocumento;
	private JTextField textField_Nombre;
	private JTextField textField_NroDocumento;
	private JTextField textField_CalleDomicilio;
	private JTextField textField_NroDomicilio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscarCliente1 frame = new buscarCliente1();
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
	public buscarCliente1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(255, 0, 51));
		
		JLabel label = new JLabel("EL ASEGURADO");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 794, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(label)
					.addContainerGap(323, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 83, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS DEL CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblNroCliente = new JLabel("Nro Cliente:");
		lblNroCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_2 = new JLabel("Apellido:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_3 = new JLabel("Tipo:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Cliente = new JTextField();
		textField_Cliente.setEditable(false);
		textField_Cliente.setColumns(10);
		
		textField_Apellido = new JTextField();
		textField_Apellido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Apellido.setEditable(false);
		textField_Apellido.setColumns(10);
		
		textField_TipoDocumento = new JTextField();
		textField_TipoDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_TipoDocumento.setEditable(false);
		textField_TipoDocumento.setColumns(10);
		
		JLabel label_4 = new JLabel("Nombre:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_5 = new JLabel("Nro Documento:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_Nombre.setEditable(false);
		textField_Nombre.setColumns(10);
		
		textField_NroDocumento = new JTextField();
		textField_NroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_NroDocumento.setEditable(false);
		textField_NroDocumento.setColumns(10);
		
		JLabel lblDomicilio = new JLabel("DOMICILIO");
		lblDomicilio.setForeground(Color.BLACK);
		lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_7 = new JLabel("Calle:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_8 = new JLabel("N\u00FAmero:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_CalleDomicilio = new JTextField();
		textField_CalleDomicilio.setEditable(false);
		textField_CalleDomicilio.setColumns(10);
		
		textField_NroDomicilio = new JTextField();
		textField_NroDomicilio.setEditable(false);
		textField_NroDomicilio.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(99)
							.addComponent(textField_CalleDomicilio, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(108)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addComponent(textField_NroDomicilio, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNroCliente, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(69)
							.addComponent(textField_Cliente, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(84)
							.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(108)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(103)
							.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(108)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(49)
							.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblDomicilio, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNroCliente))
						.addComponent(textField_Cliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3))
						.addComponent(textField_TipoDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(textField_NroDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDomicilio)
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_7))
						.addComponent(textField_CalleDomicilio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_8))
						.addComponent(textField_NroDomicilio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 743, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAceptar)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
