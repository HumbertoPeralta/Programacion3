package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{

	public Ventana() {

		this.setTitle("Ventanota");
		this.setVisible(true);
		this.setSize(600,650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(true);

		//this.setLayout(null);

		//this.componentes();
		//this.componentes();
		//this.admin();
		//this.login();
		//this.calculadora();
		//this.interes();
		this.botones();
		
	}

	public void componentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setLocation(0,0);
		login.setLayout(null);
		login.setBackground(Color.magenta);
		

		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(null);
		setJMenuBar(menuBar);
		

		JMenu opciones = new JMenu("Opciones");
		menuBar.add(opciones);
		

		JMenu editar = new JMenu("Editar");
		menuBar.add(editar);
		

		JMenu ayuda = new JMenu("Ayuda");
		menuBar.add(ayuda);
		

		JMenuItem guardar = new JMenuItem("Guardar");
		opciones.add(guardar);
		

		JMenuItem borrar = new JMenuItem("Borrar");
		opciones.add(borrar);
		

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

		JLabel img = new JLabel();
		img.setIcon(new ImageIcon(getClass().getResource(".png")));

	}


	public void admin() {

		JPanel admin_panel = new JPanel();
		admin_panel.setSize(this.getWidth(), this.getHeight());
		admin_panel.setLocation(0,0);
		admin_panel.setLayout(null);
		admin_panel.setBackground(Color.yellow);

		JLabel titulo = new JLabel("Datos",0);
		titulo.setFont(new Font("Bell MT", Font.BOLD,30));
		titulo.setBackground(Color.gray);
		titulo.setLocation(250,10);
		titulo.setSize(200,40);
		titulo.setOpaque(false);
		admin_panel.add(titulo);

		JButton agregar = new JButton("Agregar");
		agregar.setBounds(650,270,100,30);
		admin_panel.add(agregar);

		JButton eliminar = new JButton("Eliminar");
		eliminar.setBounds(530,270,100,30);
		admin_panel.add(eliminar);

		String titulos[]= {"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"};
		String datos[][]= {
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				{"No Control","Nombre","Apellidos","Edad","Sexo","Correo Electronico"},
				};

		JTable tabla=new JTable(datos,titulos);
		JScrollPane scrollpane = new JScrollPane(tabla);
		scrollpane.setBounds(100, 340, 600, 350);
		admin_panel.add(scrollpane);

		this.add(admin_panel);
	}

	public void login() {

		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(new Color(53,85,150));

		JLabel text_account = new JLabel ("My Account",0);
		text_account.setBounds(300, 100, 200, 60);
		text_account.setFont(new Font("Arial Black", Font.ITALIC,30));
		text_account.setForeground(new Color(220,202,138));
		panel.add(text_account);

		JLabel text_user = new JLabel ("Enter your username",0);
		text_user.setBounds(210, 150, 250, 60);
		text_user.setFont(new Font("Arial Black", Font.ITALIC,15));
		text_user.setForeground(Color.white);
		panel.add(text_user);

		JLabel img_user = new JLabel();
		img_user.setBounds(210, 210, 32, 32);
		//img_user.setIcon(new ImageIcon(getClass().getResource("user.png")));
		img_user.setBackground(new Color(220,202,138));
		img_user.setOpaque(true);
		panel.add(img_user);

		JLabel img_password = new JLabel();
		img_password.setBounds(210, 310, 38, 38);
		//img_password.setIcon(new ImageIcon(getClass().getResource("cerrar.png")));
		img_password.setBackground(new Color(220,202,138));
		img_password.setOpaque(true);
		panel.add(img_password);


		JTextField username = new JTextField();
		username.setBounds(250, 200, 300, 50);
		username.setFont(new Font("Arial", Font.BOLD,20));
		panel.add(username);

		JLabel text_password = new JLabel ("Enter your password",0);
		text_password.setBounds(210, 250, 250, 60);
		text_password.setFont(new Font("Arial Black", Font.ITALIC,15));
		text_password.setForeground(Color.white);
		panel.add(text_password);

		JPasswordField password = new JPasswordField();
		password.setBounds(250, 300, 300, 50);
		username.setFont(new Font("Arial", Font.BOLD,25));
		password.setBackground(Color.white);
		password.setOpaque(true);
		panel.add(password);

		JLabel btn_login= new JLabel("Login",0);
		btn_login.setBounds(340, 400,100,50);
		btn_login.setBackground(new Color(236,213,129));
		btn_login.setFont(new Font("Arial Black", Font.ITALIC,25));
		btn_login.setForeground(Color.black);
		btn_login.setOpaque(true);
		panel.add(btn_login);

		JLabel btn_singup= new JLabel("Sing Up",0);
		btn_singup.setBounds(350, 540,80,40);
		btn_singup.setBackground(new Color(235,210,120));
		btn_singup.setFont(new Font("Arial Black", Font.ITALIC,15));
		btn_singup.setForeground(Color.black);
		btn_singup.setOpaque(true);
		panel.add(btn_singup);

		JLabel text_signup = new JLabel ("Don´t have a account?",0);
		text_signup.setBounds(320, 500, 150, 60);
		text_signup.setFont(new Font("Arial Black", Font.ITALIC,12));
		text_signup.setForeground(Color.white);
		panel.add(text_signup);

		JLabel login = new JLabel();
		login.setBounds(100, 80, 600, 400);
		login.setLayout(null);
		login.setBackground(new Color(49,78,146));
		login.setOpaque(true);
		panel.add(login);

		JLabel text_login = new JLabel ("User Login",0);
		text_login.setBounds(300, 10, 200, 60);
		text_login.setFont(new Font("Arial Black", Font.ITALIC,30));
		text_login.setForeground(Color.white);
		text_login.setLayout(null);
		panel.add(text_login);


		this.add(panel);
		panel.repaint();
	}
	
	public void calculadora() {
		
		this.setTitle("Calculadora");

		JPanel calculadora = new JPanel();
		calculadora.setSize(this.getWidth(), this.getHeight());
		calculadora.setLocation(0,0);
		calculadora.setLayout(new BorderLayout());
		
		JLabel resultado= new JLabel("20.00",4);
		resultado.setFont(new Font("Arial Black", Font.BOLD,40));
		resultado.setBackground(Color.white);
		calculadora.add(resultado,BorderLayout.NORTH);
		
		JPanel numeros = new JPanel();
		numeros.setLayout(new GridLayout(4,3));
		numeros.setBackground(Color.LIGHT_GRAY);
		calculadora.add(numeros,BorderLayout.CENTER);
		
		String btn_numeros []= {"9","8","7","6","5","4","3","2","1","0","."};
		
		for (int i = 0; i < btn_numeros.length; i++) {
			numeros.add(new JButton(btn_numeros[i]));
		}
		
		JPanel operaciones = new JPanel();
		operaciones.setLayout(new GridLayout(6,1,10,10));
		operaciones.setBackground(Color.green);
		operaciones.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
		calculadora.add(operaciones,BorderLayout.EAST);
		
		String btn_operaciones []= {"+","-","*","/","=","CE"};
		
		for (int i = 0; i < btn_operaciones.length; i++) {
			operaciones.add(new JButton(btn_operaciones[i]));
		}
		
		this.add(calculadora);
		
	}
	
	public void interes() {
		
		this.setTitle("Calculando el interes");
		
		JPanel fondo = new JPanel();
		fondo.setSize(this.getWidth(), this.getHeight());
		fondo.setLocation(0,0);
		fondo.setLayout(new BorderLayout());
		
		JLabel txt_interes= new JLabel(" Interés");
		txt_interes.setFont(new Font("Arial", Font.BOLD,30));
		txt_interes.setForeground(Color.red);
		txt_interes.setBackground(Color.white);
		fondo.add(txt_interes,BorderLayout.NORTH);
		
		JPanel calcular = new JPanel();
		calcular.setBackground(new Color(153,255,153));
		calcular.setLayout(null);
		calcular.setBounds(40, 50, 500, 300);
		
		JLabel txt_calcular= new JLabel("Calcular Interés");
		txt_calcular.setFont(new Font("Arial", Font.BOLD,15));
		txt_calcular.setBounds(10, 10, 200, 20);
		txt_calcular.setForeground(Color.black);
		calcular.add(txt_calcular);
		
		JLabel txt_capital= new JLabel("Capital:");
		txt_capital.setFont(new Font("Arial", Font.BOLD,12));
		txt_capital.setBounds(60, 50,80 ,40 );
		calcular.add(txt_capital);
		
		JLabel txt_tiempo = new JLabel("Tiempo: "); 
		txt_tiempo.setFont(new Font("Arial", Font.BOLD,12));
		txt_tiempo.setBounds(60, 120,80 ,40 );
		calcular.add(txt_tiempo);
		
		JLabel txt_tasa = new JLabel("Tasa Interés: "); 
		txt_tasa.setFont(new Font("Arial", Font.BOLD,12));
		txt_tasa.setBounds(60, 190,100 ,40 );
		calcular.add(txt_tasa);
		
		JLabel capital_resultado = new JLabel("1500");
		capital_resultado.setOpaque(true);
		capital_resultado.setBounds(250, 60, 120, 20);
		capital_resultado.setBackground(Color.white);
		calcular.add(capital_resultado);
		
		JLabel tiempo_resultado = new JLabel("2");
		tiempo_resultado.setOpaque(true);
		tiempo_resultado.setBounds(250, 130, 120, 20);
		tiempo_resultado.setBackground(Color.white);
		calcular.add(tiempo_resultado);
		
		JLabel tasa_resultado = new JLabel("0.1");
		tasa_resultado.setOpaque(true);
		tasa_resultado.setBounds(250, 200, 120, 20);
		tasa_resultado.setBackground(Color.white);
		calcular.add(tasa_resultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setIcon(new ImageIcon(getClass().getResource("disco-flexible.png")));
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBackground(SystemColor.desktop);
		btnCalcular.setBounds(60, 250, 105, 23);
		calcular.add(btnCalcular);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("boton-x.png")));
		btnNewButton.setBounds(250, 250, 105, 23);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setForeground(Color.WHITE);
		calcular.add(btnNewButton);
		
		JPanel resultados = new JPanel();
		resultados.setLayout(null);
		resultados.setBackground(new Color(255,153,153));
		resultados.setBounds(40, 380, 500, 200);
		fondo.add(resultados);
		
		JLabel resultado_interes = new JLabel("Interes: ");
		resultado_interes.setBounds(60,20, 60, 60);
		resultados.add(resultado_interes);
		
		JLabel resultado_monto = new JLabel("Monto: ");
		resultado_monto.setBounds(60, 95, 50, 50);
		resultados.add(resultado_monto);
		
		JLabel interes_resultado = new JLabel("315.00000000002");
		interes_resultado.setOpaque(true);
		interes_resultado.setBounds(200, 40, 120, 20);
		interes_resultado.setBackground(Color.white);
		resultados.add(interes_resultado);
		
		JLabel monto_resultado = new JLabel("1815.00000000002");
		monto_resultado.setOpaque(true);
		monto_resultado.setBounds(200, 110, 120, 20);
		monto_resultado.setBackground(Color.white);
		resultados.add(monto_resultado);
		
		this.add(resultados);
		this.add(calcular);
		this.add(fondo);
		
	}
	
	public void botones() {
		
		
		Random random= new Random();
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth()/2, this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.white);
		panel.addMouseListener(new MouseListener() {
        	@Override
        	public void mouseClicked(MouseEvent me) {
        		int numero1=random.nextInt(400);
				int numero2=random.nextInt(300);
				int numero3=random.nextInt(200);
				int numero4=random.nextInt(200);
				
				int rojo=random.nextInt(256);
				int verde=random.nextInt(256);
				int azul=random.nextInt(256);
				
				String colorHex = String.format("#%02x%02x%02x", rojo, verde, azul);
        		JButton boton1 = new JButton(colorHex);
				boton1.setSize(numero3,numero4);
				boton1.setLayout(null);
	            boton1.setBackground(Color.decode(colorHex));
	            boton1.setLocation(me.getX(),me.getY());
	            panel.add(boton1);
	            
	            boton1.addActionListener(new ActionListener(){
	            	public void actionPerformed(ActionEvent e) {
	            		JOptionPane.showMessageDialog(panel,boton1.getText());
	            	}
	            });
        	}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
		JButton boton = new JButton("presioname!");
		boton.setBounds(150, 500, 300, 50);
		boton.setLayout(null);
		boton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int numero1=random.nextInt(400);
				int numero2=random.nextInt(300);
				int numero3=random.nextInt(200);
				int numero4=random.nextInt(200);
				
				int rojo=random.nextInt(256);
				int verde=random.nextInt(256);
				int azul=random.nextInt(256);
				
				String colorHex = String.format("#%02x%02x%02x", rojo, verde, azul);
	            
				
				JButton boton1 = new JButton(colorHex);
				boton1.setBounds(numero1,numero2,numero3,numero4);
				boton1.setLayout(null);
	            boton1.setBackground(Color.decode(colorHex));
	            
	            boton1.addActionListener(new ActionListener(){
	            	public void actionPerformed(ActionEvent e) {
	            		JOptionPane.showMessageDialog(panel,boton1.getText());
	            	}
	            });
                
	            panel.add(boton1);
	            panel.repaint();
			}
			
		});
		panel.add(boton);
		
		this.add(panel);
	}
	
	/*@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//Fondo
		g2d.setColor(new Color(1,190,254));
		g2d.fillRect(0, 0, 600, 650);
		//tierra
		g2d.setColor(new Color(99,76,22));
		g2d.fillRect(0, 580, 600, 80);
		//tierra
		g2d.setColor(new Color(209,184,104));
		g2d.fillRect(0, 550, 600, 30);
		//pasto
		g2d.setColor(new Color(114,149,45));
		g2d.fillRect(0, 520, 600, 35);
		//pasto
		g2d.setColor(new Color(58,76,17));
		g2d.fillRect(0, 500, 600, 20);
		
		//fondo cercas
		g2d.setColor(new Color(214,151,58));
		g2d.fillRect(0, 380, 600, 70);
		//cercas
		g2d.setColor(new Color(255,185,81));
		g2d.fillRect(110,330,40,170);
		g2d.fillRect(60,330,40,170);
		g2d.fillRect(10,330,40,170);
		g2d.fillRect(450,330,40,170);
		g2d.fillRect(500,330,40,170);
		g2d.fillRect(550,330,40,170);
		
		//triangulos
		int xS [] = {80, 60, 100} ;
		int yS [] = {300, 330, 330} ;
		g2d.fillPolygon(xS, yS, 3);
		
		int xS2[]= {130,110,150};
		g2d.fillPolygon(xS2, yS, 3);
		
		int xS3[]= {30,10,50};
		g2d.fillPolygon(xS3, yS, 3);
		
		int xS4[]= {470,450,490};
		g2d.fillPolygon(xS4, yS, 3);
		
		int xS5[]= {520,500,540};
		g2d.fillPolygon(xS5, yS, 3);
		
		int xS6[]= {570,550,590};
		g2d.fillPolygon(xS6, yS, 3);
		
		//suelo gris
		g2d.setColor(new Color(102,102,102));
		g2d.fillRect(125, 470, 350, 30);
		//fondo casa
		g2d.setColor(new Color(98,74,7));
		g2d.fillRect(150, 270, 300, 200);
		//casa
		g2d.setColor(new Color(255,215,117));
		g2d.fillRect(150, 448, 300, 21);
		g2d.fillRect(150, 422, 300, 21);
		g2d.fillRect(150, 395, 300, 21);
		g2d.fillRect(150, 370, 300, 21);
		g2d.fillRect(150, 345, 300, 21);
		g2d.fillRect(150, 320, 300, 21);
		g2d.fillRect(150, 295, 300, 21);
		g2d.fillRect(150, 270, 300, 21);
		
		//Chimenea
		g2d.setColor(new Color(128,128,128));
		g2d.fillRect(380, 160, 60, 100);
		//chimenea techo
		g2d.setColor(new Color(102,102,102));
		g2d.fillRect(370, 130, 80, 30);
		//sombra chimenea
		int xS8[]= {380,440,440};
		int yS3[]= {160,160,190};
		g2d.setColor(new Color(77,77,77));
		g2d.fillPolygon(xS8, yS3, 3);
		//techo casa
		int xS7[]= {220,90,500};
		int yS2[]= {70,270,270};
		g2d.setColor(new Color(162,36,37));
		g2d.fillPolygon(xS7, yS2, 3);
		
		//sombra
		int xS9[]= {150,450,450};
		int yS4[]= {270,270,335};
		g2d.setColor(new Color(0,0,0,100));
		g2d.fillPolygon(xS9, yS4, 3);
		
		//fondo puerta
		g2d.setColor(new Color(98,74,7));
		g2d.fillRect(170, 280, 100, 190);
		//puerta
		g2d.setColor(new Color(152,112,14));
		g2d.fillRect(175, 285, 90, 180);
		//manija
		g2d.setColor(Color.WHITE);
		g2d.fillOval(245, 380, 15, 15);
		//fondo barda
		int xS10[]= {310,430,450,450};
		int yS5[]= {400,385,390,425};
		g2d.setColor(new Color(0,0,0,100));
		g2d.fillPolygon(xS10, yS5, 4);
		//barda
		g2d.setColor(new Color(77,77,77));
		g2d.fillRect(310, 385, 120, 15);
		//ventana fondo
		g2d.setColor(new Color(159,37,37));
		g2d.fillRect(320, 285, 100, 100);
		//ventana
		g2d.setColor(Color.white);
		g2d.fillRect(325, 290, 40, 45);
		g2d.fillRect(375, 290, 40, 45);
		g2d.fillRect(325, 340, 40, 43);
		g2d.fillRect(375, 340, 40, 43);
	}*/
} 