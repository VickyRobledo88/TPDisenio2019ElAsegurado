package ar.TpDisenio2019.Ui.BuscarCliente;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;


import javax.swing.LayoutStyle.ComponentPlacement;


import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import ar.TpDisenio2019.DTO.DTOCliente;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.ListaDesplegable.GestorListasDesplegables;
import ar.TpDisenio2019.Utilitario.KeyAdapterModificado;
import ar.TpDisenio2019.Utilitario.Validaciones;


import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class buscarCliente extends JFrame {

	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField apellidoCliente;
	private JTextField nombreCliente;
	private JTextField docCliente;
    
	private String tipoDeDocumento;
    List<DTOTipodedocumento>  dtoListaTipoDocumento = new ArrayList<DTOTipodedocumento>();
	protected Validaciones validaciones;
	private int numeroCliente;
	
	
	public buscarCliente() {
		

		
		try {
			
			 setTitle("Buscar DTOCliente");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 800, 730);
			setLocationRelativeTo(null);
			contentPane = new JPanel();
			contentPane.setForeground(Color.WHITE);
			contentPane.setBackground(UIManager.getColor("CheckBox.background"));
			contentPane.setToolTipText("");
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBounds(5, 309, 774, 377);
			
			JScrollPane scrollPane = new JScrollPane();
			
			JLabel lblSeleccioneUnCliente = new JLabel("Seleccione un Cliente");
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btnAceptar)
					{
						buscarCliente1 b = new buscarCliente1();
						b.setVisible(true);
						b.setResizable(false);
						b.setLocationRelativeTo(null);
						hide();
					}
				}
			});
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					hide();
				}
			});
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
			GroupLayout gl_panel_3 = new GroupLayout(panel_3);
			gl_panel_3.setHorizontalGroup(
				gl_panel_3.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_3.createSequentialGroup()
								.addContainerGap()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
								.addContainerGap(572, Short.MAX_VALUE)
								.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
								.addGap(27)
								.addComponent(lblSeleccioneUnCliente)))
						.addContainerGap())
			);
			gl_panel_3.setVerticalGroup(
				gl_panel_3.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel_3.createSequentialGroup()
						.addGap(21)
						.addComponent(lblSeleccioneUnCliente)
						.addGap(18)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGap(24))
			);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
					"Nro Cliente", "Apellido", "Nombre", "Tipo", "Nro Documento"
				}
			));
			scrollPane.setViewportView(table);
			panel_3.setLayout(gl_panel_3);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(5, 94, 774, 211);
			panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			
			JPanel panel_5 = new JPanel();
			panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TITULAR DEL SEGURO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			
			JLabel lblNroCliente = new JLabel("Nro de Cliente:");
			lblNroCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
			
			JLabel label = new JLabel("Nombre");
			label.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
			JLabel label_1 = new JLabel("Apellido");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
			JLabel lblNroDocumento = new JLabel("Nro Documento");
			lblNroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
			JLabel lblTipo = new JLabel("Tipo");
			lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
			JLabel labelAclaraciónSobreApellido = new JLabel("Sólo caracteres válidos para apellido (máximo 50)");
			labelAclaraciónSobreApellido.setFont(new Font("Tahoma", Font.PLAIN, 10));
			labelAclaraciónSobreApellido.setForeground(Color.RED);
			labelAclaraciónSobreApellido.setVisible(false);
			
			JLabel labelAclaraciónSobreNombres = new JLabel("Sólo caracteres válidos para nombres (máximo 50)");
			labelAclaraciónSobreNombres.setFont(new Font("Tahoma", Font.PLAIN, 10));
			labelAclaraciónSobreNombres.setForeground(Color.RED);
			labelAclaraciónSobreNombres.setVisible(false);
			
			MaskFormatter mascara = new MaskFormatter("##-########");
			mascara.setPlaceholderCharacter( ' ');
			
			JFormattedTextField nroCliente= new JFormattedTextField(mascara);
			nroCliente.setColumns(10);
			
			

			
			//********
			nombreCliente = new JTextField();
			nombreCliente.setColumns(10);
			
			apellidoCliente = new JTextField();
			apellidoCliente.setColumns(10);
			
			docCliente = new JTextField();
			docCliente.setColumns(10);
			
			
					
			//**********nombreCliente
			
			nombreCliente.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent arg0)
				{
					String nombres = nombreCliente.getText();
					
					if(nombres.length() > 0)
					{				
						if(Validaciones.validarApellidoONombre(nombres) == false)
						{
							labelAclaraciónSobreNombres.setVisible(true);
						}
					}
				}
				
				public void focusGained(FocusEvent arg0)
				{
					labelAclaraciónSobreNombres.setVisible(false);
				}
			});
			
			nombreCliente.addKeyListener(new KeyAdapterModificado());
			
			nombreCliente.addKeyListener(new KeyAdapter()
			{
				public void keyReleased(KeyEvent arg0)
				{
					String texto = nombreCliente.getText();
					nombreCliente.setText(texto.toUpperCase());
				}
				
			});
		
			//***********apellidoCliente
		apellidoCliente.addFocusListener(new FocusAdapter()
			{
				public void focusLost(FocusEvent arg0)
				{
					String apellido = apellidoCliente.getText();
					
					if(apellido.length() > 0)
					{			
						if(Validaciones.validarApellidoONombre(apellido) == false)
						{
							
							labelAclaraciónSobreApellido.setVisible(true);
						}
					}
				}
				
				public void focusGained(FocusEvent arg0)
				{
					labelAclaraciónSobreApellido.setVisible(false);
				}
			});
			
			apellidoCliente.addKeyListener(new KeyAdapterModificado());
			
			apellidoCliente.addKeyListener(new KeyAdapter()
			{
				public void keyReleased(KeyEvent arg0)
				{
					String texto = apellidoCliente.getText();
					apellidoCliente.setText(texto.toUpperCase());
				}
				
			});
			
			
			
			//************comboBoxTipoDocumento
			
			
			JComboBox <String> comboBoxTipoDocumento = new JComboBox <String>();
				
			 dtoListaTipoDocumento= GestorListasDesplegables.buscarDtosTipoDeDocumento();
		
			for(DTOTipodedocumento tipo :  dtoListaTipoDocumento) 
			
				comboBoxTipoDocumento .addItem(tipo.getNombre().toString());
			
			//****************		
			
			
			
			
			
			//*******************
		
			
			comboBoxTipoDocumento.setBackground(Color.WHITE);
			GroupLayout gl_panel_5 = new GroupLayout(panel_5);
			gl_panel_5.setHorizontalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNroCliente)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(46)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_5.createSequentialGroup()
								.addComponent(label)
								.addGap(18)
								.addComponent(nombreCliente, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
								.addGap(52)
								.addComponent(lblTipo)
								.addGap(39)
								.addComponent(comboBoxTipoDocumento, 0, 217, Short.MAX_VALUE))
							.addGroup(gl_panel_5.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
									.addComponent(labelAclaraciónSobreApellido)								.addGroup(gl_panel_5.createSequentialGroup()
										.addComponent(label_1)
										.addGap(18)
										.addComponent(apellidoCliente, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
										.addGap(79)
										.addComponent(lblNroDocumento)
										.addGap(18)
										.addComponent(docCliente, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
									.addComponent(labelAclaraciónSobreNombres))))
						.addContainerGap())
			);
			gl_panel_5.setVerticalGroup(
				gl_panel_5.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel_5.createSequentialGroup()
						.addContainerGap(29, Short.MAX_VALUE)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
							.addComponent(comboBoxTipoDocumento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(nombreCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblTipo)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNroCliente)
								.addComponent(nroCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(7)
						.addComponent(labelAclaraciónSobreNombres)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(docCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNroDocumento))
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(apellidoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1)))
						.addGap(11)
						.addComponent(labelAclaraciónSobreApellido))
			);
			panel_5.setLayout(gl_panel_5);
			
			JButton btnBuscar = new JButton("Buscar");
			
			
			btnBuscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					String numCliente= nroCliente.getText();	
					String Pais=numCliente.substring(0, 2);
					String cuerpoNumero =numCliente.substring(4, 11);
					String clienteNumero= Pais + cuerpoNumero;
					
					int numeroCliente = Integer.parseInt(clienteNumero);
					
					String nombres = nombreCliente.getText();
					if(nombres.length() > 0)
					{	
						if(Validaciones.validarApellidoONombre(nombres) == false)
						{
						
							labelAclaraciónSobreNombres.setVisible(true);
						}
					}
					
					//*****
					String apellido =apellidoCliente.getText();
					
					if(apellido.length() > 0)
					{	
						if(Validaciones.validarApellidoONombre(apellido) == false)
						{
							
							labelAclaraciónSobreApellido.setVisible(true);
						}
							
					}
					
								
			tipoDeDocumento = comboBoxTipoDocumento.getSelectedItem().toString();		
			
			
			
				}
			});
			
			
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
							.addComponent(btnBuscar))
						.addContainerGap())
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap(20, Short.MAX_VALUE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnBuscar)
						.addContainerGap())
			);
			panel_1.setLayout(gl_panel_1);
			contentPane.setLayout(null);
			contentPane.add(panel_3);
			contentPane.add(panel_1);
			
			JPanel panel = new JPanel();
			panel.setToolTipText("");
			panel.setBackground(new Color(255, 0, 51));
			panel.setBounds(0, 0, 784, 83);
			contentPane.add(panel);
			
			JLabel label_2 = new JLabel("EL ASEGURADO");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			label_2.setBackground(Color.WHITE);
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGap(0, 774, Short.MAX_VALUE)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(314)
						.addComponent(label_2)
						.addContainerGap(299, Short.MAX_VALUE))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGap(0, 83, Short.MAX_VALUE)
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap(29, Short.MAX_VALUE)
						.addComponent(label_2)
						.addGap(25))
			);
			panel.setLayout(gl_panel);
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block	e1.printStackTrace();
		}
		
		
		
	}
}
