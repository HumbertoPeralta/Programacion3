package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		this.setTitle("Ventanota");
		this.setVisible(true);
		this.setSize(700,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//fondo
		g2d.setColor(new Color(162,240,255));
		g2d.fillRect(0, 0, 700, 500);
		
		//suelo
		
		g2d.setColor(new Color(255,151,102));
		g2d.fillRect(0, 450, 700, 50);
		
		g2d.setColor(Color.black);
		g2d.drawLine(0, 450, 700, 450);
		
		g2d.setColor(new Color(255,201,189));
		g2d.fillRect(0, 430, 700, 20);
		
		g2d.setColor(Color.black);
		g2d.drawLine(0, 430, 700, 430);
		
		//cuadro negro
		g2d.setColor(Color.black);
		g2d.fillRoundRect(320,280,30,150 ,5,5);
				
		//fondo cuadro azul
		g2d.setColor(Color.black);
		g2d.fillRoundRect(228, 258, 103, 168, 5,5);
		//cuadro azul
		g2d.setColor(new Color(132,192,255));
		g2d.fillRoundRect(230, 260, 100, 170, 6,6);
		//cuadro negro
		g2d.setColor(Color.black);
		g2d.fillRoundRect(240,350,30,80 ,5,5);
		//fondo cuadro rosa
		g2d.setColor(Color.black);
		g2d.fillRoundRect(148, 328, 103, 103, 5,5);
		//cuadro rosa
		g2d.setColor(new Color(255,195,184));
		g2d.fillRoundRect(150, 330, 100, 100, 6,6);
		g2d.setColor(new Color(0,0,0,30));
		g2d.fillRect(150, 424, 200, 6);
		g2d.fillRect(244, 330, 6, 100);
		g2d.fillRect(324, 260, 6, 130);
		//fondo esquinas rosa
		g2d.setColor(Color.black);
		g2d.fillOval(155, 335, 15, 15);
		g2d.fillOval(155, 410, 15, 15);
		g2d.fillOval(230, 335, 15, 15);
		g2d.fillOval(230, 410, 15, 15);
		//fondo esquinas azul
		g2d.fillOval(235, 265, 15, 15);
		g2d.fillOval(310, 265, 15, 15);
		//esquinas cuadro rosa
		g2d.setColor(Color.lightGray);
		g2d.fillOval(157, 337, 10, 10);
		g2d.fillOval(157, 412, 10, 10);
		g2d.fillOval(232, 337, 10, 10);
		g2d.fillOval(232, 412, 10, 10);
		//esquinas cuadro azul
		g2d.fillOval(237, 267, 10, 10);
		g2d.fillOval(312, 267, 10, 10);
		//fondo cuadro verde
		g2d.setColor(Color.black);
		g2d.fillRoundRect(598, 328, 103, 103, 5,5);
		//cuadro verde
		g2d.setColor(new Color(81,217,109));
		g2d.fillRoundRect(600, 330, 100, 100, 5,5);
		//fondo esquinas verdes
		g2d.setColor(Color.black);
		g2d.fillOval(605, 335, 15, 15);
		g2d.fillOval(605, 410, 15, 15);
		
		g2d.setColor(Color.lightGray);
		g2d.fillOval(607, 337, 10, 10);
		g2d.fillOval(607, 412, 10, 10);
		
		//fondo cuadrado
		g2d.setColor(Color.black);
		g2d.fillRect(28, 278, 44, 44);
		g2d.fillRect(98, 168, 89, 44);
		g2d.fillRect(628, 208, 44, 44);
		
		//cuadrado
		g2d.setColor(new Color(255,144,99));
		g2d.fillRect(30, 280, 40, 40);
		
		g2d.fillRect(100, 170, 40, 40);
		g2d.fillRect(145, 170, 40, 40);
		g2d.fillRect(630, 210, 40, 40);
		g2d.setColor(Color.black);
		g2d.fillOval(32, 282, 5, 5);
		g2d.fillOval(65, 282, 5, 5);
		g2d.fillOval(32, 315, 5, 5);
		g2d.fillOval(65, 315, 5, 5);
		g2d.fillOval(102, 172, 5, 5);
		g2d.fillOval(135, 172, 5, 5);
		g2d.fillOval(102, 205, 5, 5);
		g2d.fillOval(135, 205, 5, 5);
		g2d.fillOval(147, 172, 5, 5);
		g2d.fillOval(180, 172, 5, 5);
		g2d.fillOval(147, 205, 5, 5);
		g2d.fillOval(180, 205, 5, 5);
	
		g2d.fillOval(632, 212, 5, 5);
		g2d.fillOval(632, 242, 5, 5);
		g2d.fillOval(665, 212, 5, 5);
		g2d.fillOval(665, 242, 5, 5);

		//borde tubo verde
		g2d.setColor(Color.black);
		g2d.fillRect(430, 350, 70, 80);
		g2d.fillRect(425, 315, 80, 35);
		
		//tubo
		g2d.setColor(new Color(0,139,0));
		g2d.fillRect(433, 353, 65, 76);
		g2d.fillRect(428, 318, 75, 30);
		
		//reflejo
		g2d.setColor(new Color(84,213,104));
		g2d.fillRect(436, 353, 2, 76);
		g2d.fillRect(433, 318, 2, 30);
		
		g2d.fillRect(442, 353, 5, 76);
		g2d.fillRect(439, 318, 5, 30);
		
		g2d.fillRect(454, 353, 2, 76);
		g2d.fillRect(451, 318, 2, 30);
		
		g2d.fillRect(480, 353, 3, 76);
		g2d.fillRect(477, 318, 3, 30);
		
		g2d.setColor(Color.black);
		g2d.fillRect(483, 353, 3, 76);
		g2d.fillRect(480, 318, 4, 30);
		
		g2d.fillRect(489, 353, 7, 76);
		g2d.fillRect(486, 318, 7, 30);
		
		g2d.fillRect(496, 318, 6, 30);
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("mario.png"));
		g2d.drawImage(imagen.getImage(), 286, 365, 80, 70,this);
		
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("arbusto.png"));
		g2d.drawImage(imagen2.getImage(), 30, 380, 50, 50,this);
		
		ImageIcon imagen3 = new ImageIcon(getClass().getResource("fuego.png"));
		g2d.drawImage(imagen3.getImage(), 360, 325, 20, 20,this);
		
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("planta.png"));
		g2d.drawImage(imagen4.getImage(), 440, 246, 50, 70,this);
	}
}
