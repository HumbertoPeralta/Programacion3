package ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Teclado extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel[] labels;
	private char[] letras= {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
	private String[] palabras = {"BUSCAR","PALABRA","ENCONTRAR","NUMEROS","ADIVINA","LLAVES","PESO","TROMPO","PADRE","RELOJ", "NARANJA", "BICICLETA", "ELEFANTE", "COCODRILO", "UNIVERSO", "GALAXIA", "TELESCOPIO", "MICROSCOPIO", "CARTERA", "COMPUTADORA", "LAPIZ", "CUADERNO", "ESCUELA", "MANZANA", "CASA", "PERRO", "GATO", "MESA", "SILLA", "PUERTA", "VENTANA", "ARBOL"};
	private String palabraAdivinar;
	private JLabel palabraLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado frame = new Teclado();
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
	public Teclado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 330);
		setBackground(Color.LIGHT_GRAY);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
        

		JLabel time = new JLabel("Tiempo    0:00",0);
		time.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 18));
		time.setBounds(166, 0, 133, 24);
		time.setBackground(Color.white);
		time.setOpaque(true);
		contentPane.add(time);
		
		JLabel espacio = new JLabel("ESPACIO",0);
		espacio.setBounds(128, 249, 229, 14);
		espacio.setBackground(Color.white);
		espacio.setOpaque(true);
		contentPane.add(espacio);

		JLabel eliminar = new JLabel("DELETE",0);
		eliminar.setBounds(393, 249, 92, 14);
		eliminar.setBackground(Color.white);
		eliminar.setOpaque(true);
		contentPane.add(eliminar);
		
		/*
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 32, 514, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		*/
		
		palabraLabel = new JLabel();
        palabraLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
        palabraLabel.setBounds(10, 11, 278, 36);
        contentPane.add(palabraLabel);
		
		 labels = new JLabel[27];
		 int x = 10;
	     int y = 101;
	     for (int i = 0; i < labels.length; i++) {
	           labels[i] = new JLabel(String.valueOf(letras[i]), 0);
	           labels[i].setBounds(x, y, 40, 39);
	           labels[i].setBackground(Color.WHITE);
	           labels[i].setOpaque(true);
	           labels[i].setFont(new Font("Arial", Font.BOLD, 16));
	           contentPane.add(labels[i]);
	           
	           x += 46; 
	           if ((i + 1) % 10 == 0) { 
	        	   x = 10; 
	        	   y += 50; 
	            }
	            labels[i].addKeyListener(this);
	            labels[i].setFocusable(true); 
	        }
	     
	    seleccionarPalabraAdivinar();
	    
		JOptionPane.showMessageDialog(this,"Bienvenido al juego"
				+ "              \nInstrucciones:"
				+ "\nEscribe la palabra mostrada en la pantalla lo mas rapido que puedas"
				+ "\nMucha Suerte!!");
		
		
	}
	
	private void seleccionarPalabraAdivinar() {
        Random random = new Random();
        palabraAdivinar = palabras[random.nextInt(palabras.length)];
        palabraLabel.setText(palabraAdivinar);
    }
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Random r = new Random();
        Color randomColor = new Color( r.nextInt(256), r.nextInt(256), r.nextInt(256) );
        
		char keyPressed = e.getKeyChar();
        for (JLabel label : labels) {
            if (label.getText().charAt(0) == Character.toUpperCase(keyPressed)) {
                label.setBackground(randomColor);
            }
            
        }
        System.out.println("Se presionó la tecla: " + keyPressed);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char keyReleased = e.getKeyChar();
        for (JLabel label : labels) {
            if (label.getText().charAt(0) == Character.toUpperCase(keyReleased)) {
                label.setBackground(Color.WHITE);
            }
        }
        System.out.println("Se soltó la tecla: " + keyReleased);
	}
}
