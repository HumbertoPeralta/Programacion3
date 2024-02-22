package ventana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setTitle("Ventanota");
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true);
		
		this.setLayout(null);
		
		this.componentes();
	}
	
	public void componentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setLocation(0,0);
		login.setLayout(null);
		login.setBackground(Color.magenta);
		
		JLabel titulo = new JLabel("Bienvenido!!",SwingConstants.CENTER);
		titulo.setFont(new Font("Agency FB", Font.BOLD,20));
		titulo.setBackground(Color.gray);
		titulo.setLocation(100,10);
		titulo.setSize(200,40);
		titulo.setOpaque(true);
		login.add(titulo);
		
		JLabel correo = new JLabel("Correo electronico: ");
		correo.setFont(new Font("Agency FB", Font.BOLD,15));
		correo.setBackground(Color.gray);
		correo.setLocation(10,70);
		correo.setSize(180,30);
		correo.setOpaque(true);
		login.add(correo);
		
		JTextField correo_ingreso = new JTextField();
		correo_ingreso.setBounds(10, 120, 180, 30);
		this.add(correo_ingreso);
		
		JLabel contrasena = new JLabel("Contraseña: ");
		contrasena.setFont(new Font("Agency FB", Font.BOLD,15));
		contrasena.setBackground(Color.gray);
		contrasena.setLocation(10,170);
		contrasena.setSize(180,30);
		contrasena.setOpaque(true);
		login.add(contrasena);  
		
		JPasswordField contrasena_ingreso = new JPasswordField();
		contrasena_ingreso.setBounds(10, 220, 180, 30);
		contrasena_ingreso.setBackground(Color.white);
		contrasena_ingreso.setOpaque(true);
		this.add(contrasena_ingreso);
		
		JButton acceder= new JButton("ACCEDER");
		acceder.setBounds(10,270,180,30);
		this.add(acceder);
		
		this.add(login);
		this.repaint();
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(this.getWidth()/2,0);
		registro.setLayout(null);
		registro.setBackground(Color.cyan);
		
		JLabel tituloR = new JLabel("Registro",SwingConstants.CENTER);
		tituloR.setFont(new Font("Agency FB", Font.BOLD,30));
		tituloR.setBackground(Color.white);
		tituloR.setLocation(100,10);
		tituloR.setSize(200,40);
		tituloR.setOpaque(false);
		registro.add(tituloR);
		
		JLabel nombreT = new JLabel("Nombre Completo: ");
		nombreT.setFont(new Font("Agency FB", Font.BOLD,20));
		nombreT.setBackground(Color.white);
		nombreT.setLocation(10,70);
		nombreT.setSize(150,30);
		nombreT.setOpaque(false);
		registro.add(nombreT);
		
		JTextField nombre = new JTextField();
		nombre.setBounds(10, 110, 180, 30);
		registro.add(nombre);
		
		JLabel edad = new JLabel("¿Cuantos años tienes? ");
		edad.setFont(new Font("Agency FB", Font.BOLD,20));
		edad.setBackground(Color.white);
		edad.setLocation(10,145);
		edad.setSize(150,30);
		edad.setOpaque(false);
		registro.add(edad);
		
		JRadioButton edad1= new JRadioButton ("menos de 12");
		edad1.setBounds(10, 180, 180, 30);
		registro.add(edad1);
		
		JRadioButton edad2= new JRadioButton ("12 a 17");
		edad2.setBounds(10, 200, 180, 30);
		registro.add(edad2);
		
		JRadioButton edad3= new JRadioButton ("18 a 30");
		edad3.setBounds(10, 220, 180, 30);
		registro.add(edad3);
		
		JRadioButton edad4= new JRadioButton ("Mas de 30");
		edad4.setBounds(10, 240, 180, 30);
		registro.add(edad4);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(edad1);
		grupo.add(edad2);
		grupo.add(edad3);
		grupo.add(edad4);
		
		JLabel genero = new JLabel("Genero: ");
		genero.setFont(new Font("Agency FB", Font.BOLD,20));
		genero.setBackground(Color.white);
		genero.setLocation(10,280);
		genero.setSize(60,30);
		genero.setOpaque(false);
		registro.add(genero);
		
		JCheckBox masculino= new JCheckBox ("Masculino");
		masculino.setBounds(10, 320, 90,20);
		masculino.setBackground(Color.cyan);
		registro.add(masculino);
		
		JCheckBox femenino= new JCheckBox ("Femenino");
		femenino.setBounds(100, 315, 90, 30);
		femenino.setBackground(Color.cyan);
		registro.add(femenino);
		
		JCheckBox otro= new JCheckBox ("No decir");
		otro.setBounds(190, 315, 90, 30);
		otro.setBackground(Color.cyan);
		registro.add(otro);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(masculino);
		grupo1.add(femenino);
		grupo1.add(otro);
		
		JLabel dedica = new JLabel ("¿A que se dedica?");
		dedica.setFont(new Font("Agency FB", Font.BOLD,20));
		dedica.setBackground(Color.white);
		dedica.setLocation(10,345);
		dedica.setSize(120,30);
		dedica.setOpaque(false);
		registro.add(dedica);
		
		String ocupaciones[]= {"Estudiante", "Trabajo tiempo completo", "Ingeniero","Profesor","Policia","Cocinero"};
		
		JComboBox dedicaB = new JComboBox(ocupaciones);
		dedicaB.setBounds(10, 380, 90, 30);
		registro.add(dedicaB);
		
		JLabel correoR = new JLabel("Correo electronico: ");
		correoR.setFont(new Font("Agency FB", Font.BOLD,20));
		correoR.setBackground(Color.white);
		correoR.setLocation(10,460);
		correoR.setSize(120,30);
		correoR.setOpaque(false);
		registro.add(correoR);
		
		JTextField correo_registro = new JTextField();
		correo_registro.setBounds(10, 500, 180, 30);
		registro.add(correo_registro);
		
		JLabel contraseñaR = new JLabel("Contraseña: ");
		contraseñaR.setFont(new Font("Agency FB", Font.BOLD,20));
		contraseñaR.setBackground(Color.white);
		contraseñaR.setLocation(10,540);
		contraseñaR.setSize(120,30);
		contraseñaR.setOpaque(false);
		registro.add(contraseñaR);
		
		JPasswordField contrasena_registro = new JPasswordField();
		contrasena_registro.setBounds(10, 580, 180, 30);
		contrasena_registro.setBackground(Color.white);
		contrasena_registro.setOpaque(true);
		registro.add(contrasena_registro);
		
		JButton registrar = new JButton("Registrar");
		registrar.setBounds(160, 700, 180, 30);
		registro.add(registrar);

		
		
		this.add(registro);
		this.repaint();
		
	}
	
	
}