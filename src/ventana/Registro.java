package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import java.awt.Scrollbar;
import javax.swing.JTextArea;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(15, 41, 236, 280);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(269, 41, 186, 280);
		panel_1.setBackground(new Color(255, 153, 153));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(15, 345, 236, 120);
		panel_1_1.setBackground(new Color(255, 153, 153));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(269, 345, 186, 120);
		panel_2.setBackground(Color.CYAN);
		panel.setLayout(null);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setBounds(6, 175, 174, 23);
		chckbxNewCheckBox.setOpaque(false);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxMostrarFechaDe.setOpaque(false);
		chckbxMostrarFechaDe.setBounds(6, 217, 174, 23);
		panel_1.add(chckbxMostrarFechaDe);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos Opcionales");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 0, 120, 14);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setBounds(10, 25, 69, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Preferencias");
		lblNewLabel_1_1.setBounds(118, 25, 84, 14);
		panel_1_1.add(lblNewLabel_1_1);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(Registro.class.getResource("/ventana/boton-x.png")));
		btnNewButton.setBounds(44, 11, 105, 23);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setForeground(Color.WHITE);
		panel_2.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(Registro.class.getResource("/ventana/disco-flexible.png")));
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(SystemColor.desktop);
		btnGuardar.setBounds(44, 45, 105, 23);
		panel_2.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(Registro.class.getResource("/ventana/hogar.png")));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(SystemColor.desktop);
		btnSalir.setBounds(44, 79, 105, 23);
		panel_2.add(btnSalir);
		contentPane.setLayout(null);
		contentPane.add(panel_1_1);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar Musica", "Leer", "Deportes", "Otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(118, 39, 108, 70);
		panel_1_1.add(list);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 39, 98, 70);
		panel_1_1.add(textArea);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setBounds(49, 36, 70, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_2_1.setBounds(10, 61, 109, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Apellido Materno:");
		lblNewLabel_2_2.setBounds(10, 95, 109, 14);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_2_3.setBounds(10, 133, 133, 14);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Sexo:");
		lblNewLabel_2_4.setBounds(10, 158, 46, 14);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Nacionalidad:");
		lblNewLabel_2_5.setBounds(10, 232, 85, 14);
		panel.add(lblNewLabel_2_5);
		
		textField = new JTextField();
		textField.setBounds(121, 34, 94, 17);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 59, 94, 17);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 93, 94, 17);
		panel.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(121, 154, 109, 23);
		rdbtnNewRadioButton.setOpaque(false);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setBounds(121, 180, 109, 23);
		rdbtnNewRadioButton_1.setOpaque(false);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblDatosGenerales = new JLabel("Datos Generales");
		lblDatosGenerales.setFont(new Font("Arial", Font.BOLD, 12));
		lblDatosGenerales.setBounds(10, 0, 120, 14);
		panel.add(lblDatosGenerales);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peru", "Mexico", "España", "Colombia"}));
		comboBox.setBounds(129, 228, 86, 22);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 133, 94, 14);
		panel.add(textField_3);
		textField_3.setColumns(10);
		contentPane.add(panel_2);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Registro.class.getResource("/ventana/hombre.png")));
		lblNewLabel_3.setBounds(28, 11, 135, 157);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblPerfilDeUsuario = new JLabel("Perfil del usuario");
		lblPerfilDeUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lblPerfilDeUsuario.setBounds(6, 0, 120, 14);
		panel_1.add(lblPerfilDeUsuario);
		
		JLabel lblNewLabel_4 = new JLabel("Registro de Usuarios");
		lblNewLabel_4.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(15, 11, 186, 19);
		contentPane.add(lblNewLabel_4);
	}
}
