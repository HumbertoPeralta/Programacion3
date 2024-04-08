package ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Teclado extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel[] labels;
	private char[] letras= {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
	private String[] palabras = {"CASA", "PERRO", "GATO", "MESA", "SILLA", "AMOR", "FELICIDAD", "TRISTEZA", "ALEGRIA", "CORAZON",
            "FLOR", "ARBOL", "AGUA", "FUEGO", "AIRE", "TIERRA", "SOL", "LUNA", "ESTRELLA", "CIELO",
            "MAR", "MONTAÑA", "RIO", "LAGO", "PLAYA", "ARENA", "ORO", "PLATA", "DIAMANTE", "ESMERALDA",
            "RUBY", "AMISTAD", "FAMILIA", "PADRE", "MADRE", "HERMANO", "HERMANA", "HIJO", "HIJA", "ABUELO",
            "ABUELA", "NIETO", "NIETA", "TIO", "TIA", "PRIMO", "PRIMA", "VECINO", "CIUDAD", "PUEBLO",
            "PAIS", "CONTINENTE", "PLANETA", "UNIVERSO", "VIAJE", "AVENTURA", "EXPLORACION", "DESCUBRIMIENTO",
            "MISTERIO", "SECRETO", "PASION", "ROMANCE", "BESO", "ABRAZO", "CARIÑO", "TERNURA", "SUEÑO",
            "ESPERANZA", "DESEO", "INSPIRACION", "CREATIVIDAD", "IMAGINACION", "ARTE", "MUSICA", "PINTURA",
            "ESCULTURA", "LITERATURA", "POESIA", "TEATRO", "CINE", "FOTOGRAFIA", "DANZA", "DEPORTE",
            "AVENTURA", "RIESGO", "EMOCION", "ADRENALINA", "NATURALEZA", "ANIMAL", "PLANTAS", "BOSQUE",
            "SELVA", "DESIERTO", "OCEANO", "ACUARIO", "ZOOLOGICO", "PARQUE", "JARDIN", "CAMPO", "GRANJA"
        };
	private String palabraAdivinar;
	private JLabel palabraLabel;
	private JLabel palabraEscritaLabel;
	private JLabel tiempoLabel;
	private JLabel espacio;
	private JLabel eliminar;
	private char letraActual;
	private int segundos = 0;
	private int minutos = 0;
	private Timer timer;
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
		setBounds(100, 100, 494, 330);
		setBackground(Color.LIGHT_GRAY);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
		
        tiempoLabel = new JLabel("Tiempo: 0:00");
        tiempoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        tiempoLabel.setBounds(180, 0, 110, 24);
        tiempoLabel.setBackground(Color.white);
        tiempoLabel.setOpaque(true);
        contentPane.add(tiempoLabel);
		
        espacio = new JLabel("ESPACIO",0);
		espacio.setBounds(81, 256, 244, 24);
		espacio.setBackground(Color.lightGray);
		espacio.setOpaque(true);
		contentPane.add(espacio);

		eliminar = new JLabel("DELETE",0);
		eliminar.setBounds(364, 256, 99, 24);
		eliminar.setBackground(Color.lightGray);
		eliminar.setOpaque(true);
		contentPane.add(eliminar);
		
		
		palabraEscritaLabel = new JLabel();
		palabraEscritaLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		palabraEscritaLabel.setBounds(10, 24, 278, 36);
        contentPane.add(palabraEscritaLabel);
        
		palabraLabel = new JLabel();
        palabraLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
        palabraLabel.setBounds(10, 59, 278, 36);
        contentPane.add(palabraLabel);
		
		 labels = new JLabel[27];
		 int x = 10;
	     int y = 101;
	     for (int i = 0; i < labels.length; i++) {
	           labels[i] = new JLabel(String.valueOf(letras[i]), 0);
	           labels[i].setBounds(x, y, 40, 39);
	           labels[i].setBackground(Color.lightGray);
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
		
		iniciarTimer();
		addKeyListener(this);
	}
	
	private void seleccionarPalabraAdivinar() {
        Random random = new Random();
        palabraAdivinar = palabras[random.nextInt(palabras.length)];
        palabraLabel.setText("Escribir: "+palabraAdivinar);
    }
	
	private void iniciarTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }
                actualizarTiempoLabel();
            }
        });
        timer.start();
    }
	
	private void actualizarTiempoLabel() {
        String tiempo = String.format("%01d:%02d", minutos, segundos);
        tiempoLabel.setText("Tiempo: " + tiempo);
    }
	
	private void reiniciarTiempo() {
	    segundos = 0;
	    minutos = 0;
	    actualizarTiempoLabel(); 
	    
	    if (timer != null) {
	        timer.stop();
	        iniciarTimer();
	    }
	}
	
	private boolean verificarPalabra(String palabraEscrita) {
	    return palabraEscrita.equalsIgnoreCase(palabraAdivinar);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Random r = new Random();
        Color randomColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256) );
        
        
		char keyPressed = e.getKeyChar();
		if (keyPressed == KeyEvent.VK_SPACE) {
	        espacio.setBackground(randomColor);
	        letraActual = keyPressed;
            palabraEscritaLabel.setText(palabraEscritaLabel.getText() + letraActual);
	    }
		if (keyPressed == KeyEvent.VK_DELETE) {
			eliminar.setBackground(randomColor);
			palabraEscritaLabel.setText(palabraEscritaLabel.getText().substring(0, palabraEscritaLabel.getText().length() - 1));	    }
	
        for (JLabel label : labels) {
            if (label.getText().charAt(0) == Character.toUpperCase(keyPressed)) {
                label.setBackground(randomColor);
                letraActual = keyPressed;
                palabraEscritaLabel.setText(palabraEscritaLabel.getText() + letraActual);
            }
            
        }
        System.out.println("Se presionó la tecla: " + keyPressed);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char keyReleased = e.getKeyChar();
		      
		if (keyReleased == KeyEvent.VK_SPACE) {
	        espacio.setBackground(Color.lightGray);
	    }
		
		if (keyReleased == KeyEvent.VK_DELETE) {
			eliminar.setBackground(Color.lightGray);
	    }
		
        for (JLabel label : labels) {
            if (label.getText().charAt(0) == Character.toUpperCase(keyReleased)) {
                label.setBackground(Color.lightGray);
            }
        }
        
        if (verificarPalabra(palabraEscritaLabel.getText())) {
        	JOptionPane.showMessageDialog(this, "¡Correcto! Palabra escrita en "+ tiempoLabel.getText());
        	seleccionarPalabraAdivinar();
        	palabraEscritaLabel.setText("");
        	reiniciarTiempo();
        }
        
        System.out.println("Se soltó la tecla: " + keyReleased);
	}
}
