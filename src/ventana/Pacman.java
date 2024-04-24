package ventana;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Pacman extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman frame = new Pacman();
					frame.setVisible(true);
					frame.setFocusable(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private ArrayList<Point> bolitasBlancas = new ArrayList<>();
	private int contadorBolitasComidas = 0;
	private JLabel contador;
	Player[] obstaculos = new Player[28];
	Player jugador= new Player(200,200,30,30,"");
	
	Player izquierda= new Player(0,230,30,50,"");
	Player derecha= new Player(490,230,30,50,"");
	
	public Pacman() {
		for (int i = 55; i <= 455; i += 30) {
		    for (int j = 55; j <= 455; j += 30) {
		        bolitasBlancas.add(new Point(i, j));
		    }
		}
		
		obstaculos[0] = new Player(30,30,450,10,"");
		obstaculos[1] = new Player(30,30,10,200,"");
		obstaculos[2] = new Player(480,30,10,200,"");
		obstaculos[3] = new Player(30,280,10,200,"");
		obstaculos[4] = new Player(480,280,10,200,"");
		obstaculos[5] = new Player(30,480,460,10,"");
		obstaculos[6] = new Player(30,220,40,10,"");
		obstaculos[7] = new Player(30,280,40,10,"");
		obstaculos[8] = new Player(440,280,40,10,"");
		obstaculos[9] = new Player(440,220,50,10,"");
		obstaculos[10] = new Player(30,420,40,10,"");
		obstaculos[11] = new Player(440,355,40,10,"");
		obstaculos[12] = new Player(265,30,5,70,"");
		obstaculos[13] = new Player(90,90,40,80,"");
		obstaculos[14] = new Player(180,90,40,40,"");
		obstaculos[15] = new Player(395,90,40,80,"");
		obstaculos[16] = new Player(314,90,40,40,"");
		obstaculos[17] = new Player(130,230,10,80,"");
		obstaculos[18] = new Player(90,355,80,10,"");
		obstaculos[19] = new Player(120,420,140,10,"");
		obstaculos[20] = new Player(220,360,10,60,"");
		obstaculos[21] = new Player(310,420,120,10,"");
		obstaculos[22] = new Player(190,180,150,10,"");
		obstaculos[23] = new Player(210,240,10,60,"");
		obstaculos[24] = new Player(210,300,100,10,"");
		obstaculos[25] = new Player(300,240,10,60,"");
		obstaculos[26] = new Player(290,355,100,10,"");
		obstaculos[27] = new Player(370,230,10,80,"");
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				Graphics2D g2d = (Graphics2D) g;
				
				g2d.setColor(Color.white);
				for (Point bolita : bolitasBlancas) {
				    g2d.fillOval(bolita.x, bolita.y, 10, 10);
				}
				
				g2d.setColor(Color.yellow);
				g2d.fillOval(jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH());
				
				g2d.setColor(Color.blue);
				 for (Player obstaculo : obstaculos) {
		                g2d.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getW(), obstaculo.getH());
		            }
				
				g2d.setColor(Color.black);
				g2d.fillRect(izquierda.getX(), izquierda.getY(), izquierda.getW(), izquierda.getH());
				g2d.fillRect(derecha.getX(), derecha.getY(), derecha.getW(), derecha.getH());
				
				/*
				g2d.fillOval(55, 55, 10, 10);
				g2d.fillOval(55, 85, 10, 10);
				g2d.fillOval(55, 115, 10, 10);
				g2d.fillOval(55, 145, 10, 10);
				g2d.fillOval(55, 175, 10, 10);
				g2d.fillOval(55, 205, 10, 10);
				g2d.fillOval(55, 305, 10, 10);
				g2d.fillOval(55, 335, 10, 10);
				g2d.fillOval(55, 365, 10, 10);
				g2d.fillOval(55, 395, 10, 10);
				g2d.fillOval(55, 455, 10, 10);
				
				g2d.fillOval(85, 55, 10, 10);
				g2d.fillOval(115, 55, 10, 10);
				g2d.fillOval(145, 55, 10, 10);
				g2d.fillOval(175, 55, 10, 10);
				g2d.fillOval(205, 55, 10, 10);
				g2d.fillOval(235, 55, 10, 10);
				g2d.fillOval(280, 55, 10, 10);
				g2d.fillOval(305, 55, 10, 10);
				g2d.fillOval(335, 55, 10, 10);
				g2d.fillOval(365, 55, 10, 10);
				g2d.fillOval(395, 55, 10, 10);
				g2d.fillOval(425, 55, 10, 10);
				g2d.fillOval(455, 55, 10, 10);
				
				g2d.fillOval(455, 55, 10, 10);
				g2d.fillOval(455, 85, 10, 10);
				g2d.fillOval(455, 115, 10, 10);
				g2d.fillOval(455, 145, 10, 10);
				g2d.fillOval(455, 175, 10, 10);
				g2d.fillOval(455, 205, 10, 10);
				g2d.fillOval(455, 305, 10, 10);
				g2d.fillOval(455, 335, 10, 10);
				g2d.fillOval(455, 395, 10, 10);
				g2d.fillOval(455, 425, 10, 10);
				g2d.fillOval(455, 455, 10, 10);
				
				g2d.fillOval(85, 455, 10, 10);
				g2d.fillOval(115, 455, 10, 10);
				g2d.fillOval(145, 455, 10, 10);
				g2d.fillOval(175, 455, 10, 10);
				g2d.fillOval(205, 455, 10, 10);
				g2d.fillOval(235, 455, 10, 10);
				g2d.fillOval(280, 455, 10, 10);
				g2d.fillOval(305, 455, 10, 10);
				g2d.fillOval(335, 455, 10, 10);
				g2d.fillOval(365, 455, 10, 10);
				g2d.fillOval(395, 455, 10, 10);
				g2d.fillOval(425, 455, 10, 10);
				g2d.fillOval(455, 455, 10, 10);
				
				g2d.fillOval(85, 205, 10, 10);
				g2d.fillOval(115, 205, 10, 10);
				g2d.fillOval(145, 205, 10, 10);
				g2d.fillOval(175, 205, 10, 10);
				g2d.fillOval(205, 205, 10, 10);
				g2d.fillOval(235, 205, 10, 10);
				g2d.fillOval(280, 205, 10, 10);
				g2d.fillOval(305, 205, 10, 10);
				g2d.fillOval(335, 205, 10, 10);
				g2d.fillOval(365, 205, 10, 10);
				g2d.fillOval(395, 205, 10, 10);
				g2d.fillOval(425, 205, 10, 10);
				g2d.fillOval(455, 205, 10, 10);
				
				g2d.fillOval(85, 335, 10, 10);
				g2d.fillOval(115, 335, 10, 10);
				g2d.fillOval(145, 335, 10, 10);
				g2d.fillOval(175, 335, 10, 10);
				g2d.fillOval(205, 335, 10, 10);
				g2d.fillOval(235, 335, 10, 10);
				g2d.fillOval(280, 335, 10, 10);
				g2d.fillOval(305, 335, 10, 10);
				g2d.fillOval(335, 335, 10, 10);
				g2d.fillOval(365, 335, 10, 10);
				g2d.fillOval(395, 335, 10, 10);
				g2d.fillOval(425, 335, 10, 10);
				g2d.fillOval(455, 335, 10, 10);
				
				g2d.fillOval(85, 395, 10, 10);
				g2d.fillOval(115, 395, 10, 10);
				g2d.fillOval(145, 395, 10, 10);
				g2d.fillOval(175, 395, 10, 10);
				g2d.fillOval(205, 395, 10, 10);
				g2d.fillOval(235, 395, 10, 10);
				g2d.fillOval(280, 395, 10, 10);
				g2d.fillOval(305, 395, 10, 10);
				g2d.fillOval(335, 395, 10, 10);
				g2d.fillOval(365, 395, 10, 10);
				g2d.fillOval(395, 395, 10, 10);
				g2d.fillOval(425, 395, 10, 10);
				g2d.fillOval(455, 395, 10, 10);
				
				g2d.fillOval(85, 245, 10, 10);
				g2d.fillOval(85, 275, 10, 10);
				g2d.fillOval(85, 305, 10, 10);
				
				g2d.fillOval(175, 245, 10, 10);
				g2d.fillOval(175, 275, 10, 10);
				g2d.fillOval(175, 305, 10, 10);
				
				g2d.fillOval(335, 245, 10, 10);
				g2d.fillOval(335, 275, 10, 10);
				g2d.fillOval(335, 305, 10, 10);
				
				g2d.fillOval(395, 245, 10, 10);
				g2d.fillOval(395, 275, 10, 10);
				g2d.fillOval(395, 305, 10, 10);
				
				g2d.fillOval(145, 85, 10, 10);
				g2d.fillOval(145, 115, 10, 10);
				g2d.fillOval(145, 145, 10, 10);
				g2d.fillOval(145, 175, 10, 10);
				
				g2d.fillOval(235, 85, 10, 10);
				g2d.fillOval(235, 115, 10, 10);
				g2d.fillOval(235, 145, 10, 10);

				g2d.fillOval(280, 85, 10, 10);
				g2d.fillOval(280, 115, 10, 10);
				g2d.fillOval(280, 145, 10, 10);
				
				g2d.fillOval(365, 85, 10, 10);
				g2d.fillOval(365, 115, 10, 10);
				g2d.fillOval(365, 145, 10, 10);
				g2d.fillOval(365, 175, 10, 10);
				
				g2d.fillOval(175, 145, 10, 10);
				g2d.fillOval(205, 145, 10, 10);
				g2d.fillOval(235, 145, 10, 10);
				g2d.fillOval(280, 145, 10, 10);
				g2d.fillOval(305, 145, 10, 10);
				g2d.fillOval(335, 145, 10, 10);
				g2d.fillOval(365, 145, 10, 10);
				
				g2d.fillOval(175, 365, 10, 10);
				g2d.fillOval(235, 365, 10, 10);
				g2d.fillOval(395, 365, 10, 10);
				
				g2d.fillOval(280, 425, 10, 10);
				g2d.fillOval(85, 425, 10, 10);
				
				g2d.fillOval(55, 245, 10, 10);
				g2d.fillOval(425, 245, 10, 10);
				g2d.fillOval(425, 275, 10, 10);
				g2d.fillOval(455, 245, 10, 10);
				
				g2d.fillOval(425, 305, 10, 10);
				g2d.fillOval(425, 365, 10, 10);
				*/
				repaint();
				revalidate();
			}
		};
	
		
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reinicio");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });
		panel_1.add(btnNewButton);
		
		contador = new JLabel("Contador: " + contadorBolitasComidas);
		contador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(contador);
		
		addKeyListener(this);
		
	}
	
	 private void reiniciarJuego() {
	        bolitasBlancas.clear();
	        for (int i = 55; i <= 455; i += 30) {
	            for (int j = 55; j <= 455; j += 30) {
	                bolitasBlancas.add(new Point(i, j));
	            }
	        }
	        jugador.setX(200);
	        jugador.setY(200);
	        contadorBolitasComidas = 0;
	        actualizarContador();
	        repaint();
	        revalidate();
	    }
	 
	private void actualizarContador() {
		contador.setText("Contador: " + contadorBolitasComidas);
    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyPressed = e.getKeyCode();
		
		
		if(keyPressed==KeyEvent.VK_W) {
			System.out.println("Tecla W Presionada");
			int y=jugador.y-10;
			jugador.setY(y);
		}
		
		if(keyPressed==KeyEvent.VK_A) {
			System.out.println("Tecla A Presionada");
			int x=jugador.x-10;
			jugador.setX(x);
		}
		
		if(keyPressed==KeyEvent.VK_S) {
			System.out.println("Tecla S Presionada");
			int y=jugador.y+10;
			jugador.setY(y);
		}
		
		if(keyPressed==KeyEvent.VK_D) {
			System.out.println("Tecla D Presionada");
			int x=jugador.x+10;
			jugador.setX(x);
			
		}
		
		for (Player obstaculo : obstaculos) {
	        System.out.println(jugador.seTocan(obstaculo));
	    }
		
		Point posicionCentralJugador = new Point(jugador.getX() + jugador.getW() / 2, jugador.getY() + jugador.getH() / 2);
		for (int i = 0; i < bolitasBlancas.size(); i++) {
		    Point bolita = bolitasBlancas.get(i);
		    if (posicionCentralJugador.distance(bolita) <= 10) { 
		    	contadorBolitasComidas++;
		        bolitasBlancas.remove(i);
		        actualizarContador();
		        break; 
		    }
		}
		
		jugador.extremos(izquierda, derecha);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
