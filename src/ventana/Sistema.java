package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Sistema extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	static Sistema sistema = new Sistema();;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					sistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sistema() {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(null);
		
		JMenu cuenta = new JMenu("Cuenta");
		menuBar.add(cuenta);
		
		JMenu usuarios = new JMenu("Usuarios");
		menuBar.add(usuarios);
		
		JMenu ayuda = new JMenu("Ayuda");
		menuBar.add(ayuda);
		
		JMenuItem login = new JMenuItem("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				login(sistema);
			}
		});
		
		cuenta.add(login);
		

		JMenuItem registro = new JMenuItem("Registro");
		registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				registro(sistema);
			}
		});
		cuenta.add(registro);
		
		JMenuItem recuperacion = new JMenuItem("Recuperación de cuenta");
		recuperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				recuperacion(sistema);
			}
		});
		
		cuenta.add(recuperacion);
		
		JMenuItem alta = new JMenuItem("Alta");
		alta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				alta(sistema);
			}
		});
		
		usuarios.add(alta);
		
		JMenuItem baja = new JMenuItem("Baja");
		baja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				baja(sistema);
			}
		});
		
		usuarios.add(baja);
		
		JMenuItem consultar = new JMenuItem("Consultar");
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				consultar(sistema);
			}
		});
		usuarios.add(consultar);
		
		JMenuItem crearUsuario = new JMenuItem("¿Cómo crear un usuario?");
		crearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				crearUsuario(sistema);
			}
		});
		
		ayuda.add(crearUsuario);
		
		JMenuItem accederSistema = new JMenuItem("¿Cómo acceder al sistema?");
		accederSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				accederSistema(sistema);
			}
		});
		ayuda.add(accederSistema);
		
		JMenuItem olvideContraseña = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		olvideContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(contentPane);
				contentPane.repaint();
				contentPane.revalidate();
				
				olvideContraseña(sistema);
			}
		});
		ayuda.add(olvideContraseña);
		
		setJMenuBar(menuBar);
		
		this.login(sistema);
	}
	
	public void login(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 390);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 434, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Crear usuario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel);
				contentPane.repaint();
				contentPane.revalidate();
				
				registro(frame);
			}
		});
		btnNewButton.setBounds(148, 284, 114, 32);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 18));
		lblNewLabel.setBounds(121, 100, 129, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(121, 125, 158, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Contraseña:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial", Font.ITALIC, 18));
		lblUsuario.setBounds(121, 168, 129, 14);
		panel.add(lblUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 187, 158, 32);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Iniciar Sesión");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(121, 11, 141, 32);
		panel.add(lblNewLabel_1);
	}
	
	public void registro(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Crear usuario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(panel);
				contentPane.repaint();
				contentPane.revalidate();
				
				login(frame);
			}
		});
		btnNewButton.setBounds(157, 455, 112, 32);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel.setBounds(38, 54, 129, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(35, 79, 189, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Apellido paterno:");
		lblUsuario.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblUsuario.setBounds(38, 110, 158, 23);
		panel.add(lblUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(38, 140, 186, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Registro");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(167, 11, 102, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido materno:");
		lblApellidoMaterno.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblApellidoMaterno.setBounds(38, 161, 158, 23);
		panel.add(lblApellidoMaterno);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(38, 195, 186, 20);
		panel.add(passwordField_1);
		
		JButton btnNewButton_1 = new JButton("Crear usuario");
		btnNewButton_1.setBounds(157, 538, 102, 32);
		panel.add(btnNewButton_1);
		
		JLabel lblNombre = new JLabel("Correo electronico:");
		lblNombre.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNombre.setBounds(41, 226, 183, 14);
		panel.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(38, 251, 186, 20);
		panel.add(textField_1);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblContrasea.setBounds(41, 289, 158, 14);
		panel.add(lblContrasea);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(41, 312, 183, 20);
		panel.add(passwordField_2);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar Contraseña:");
		lblConfirmarContrasea.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblConfirmarContrasea.setBounds(41, 344, 183, 14);
		panel.add(lblConfirmarContrasea);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(41, 367, 183, 20);
		panel.add(passwordField_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceptar Terminos y Condiciones");
		chckbxNewCheckBox.setBounds(38, 405, 245, 23);
		chckbxNewCheckBox.setOpaque(false);
		panel.add(chckbxNewCheckBox);
	}
	
	public void recuperacion(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(202, 121, 204));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Recuperación de cuenta");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(85, 22, 275, 35);
		panel.add(lblNewLabel_2);
	}
	
	public void alta(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 213, 108));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Alta",0);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(85, 22, 275, 35);
		panel.add(lblNewLabel_2);
	}
	
	public void baja(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(217, 215, 117));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Baja",0);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(85, 22, 275, 35);
		panel.add(lblNewLabel_2);
	}
	
	public void consultar(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 96, 124));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Consultar",0);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(85, 22, 275, 35);
		panel.add(lblNewLabel_2);
	}
	
	public void crearUsuario(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(164, 166, 170));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("¿Cómo crear un usuario?");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(85, 22, 326, 35);
		panel.add(lblNewLabel_2);
	}
	
	public void accederSistema(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 163, 84));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("¿Cómo acceder al sistema?");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(61, 24, 336, 35);
		panel.add(lblNewLabel_2);
	}
	
	public void olvideContraseña(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 228, 225));
		panel.setBounds(0, 0, 434, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(38, 25, 386, 35);
		panel.add(lblNewLabel_2);
	}
	
}