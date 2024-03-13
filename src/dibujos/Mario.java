package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Mario extends JFrame{
	
	public Mario() {
		this.setTitle("Ventanota");
		this.setVisible(true);
		this.setSize(620,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//fondo
		g2d.setColor(new Color(6,101,192));
		g2d.fillRect(0, 0, 700, 500);
		
		//g2d.setColor(new Color(198,227,231));
		g2d.setColor(Color.white);
		g2d.fillRoundRect(90, 370, 160, 30, 50, 50);
		//pilares azul claro
		g2d.setColor(new Color(198,227,231));
		g2d.fillRect(20, 200, 130, 400);
		g2d.fillArc(20, 150, 130, 100, 0, 180);
		//circulos
		g2d.setColor(Color.white);
		g2d.fillOval(80, 230, 20, 28);
		g2d.fillRoundRect(-30, 260, 120, 30, 50, 50);
		g2d.fillRoundRect(180, 340, 130, 30, 50, 50);
		g2d.fillRoundRect(180, 400, 130, 30, 50, 50);
		g2d.fillRoundRect(480, 190, 110, 30, 50, 50);
		g2d.fillRoundRect(450, 220, 110, 30, 50, 50);
		g2d.fillOval(80, 300, 20, 28);
		g2d.fillOval(30, 310, 20, 28);

		g2d.setColor(new Color(198,227,231));
		g2d.fillRect(250, 200, 130, 400);
		g2d.fillArc(250, 150, 130, 100, 0, 180);
		
		g2d.setColor(new Color(198,227,231));
		g2d.fillRect(350, 150, 130, 400);
		g2d.fillArc(350, 100, 130, 100, 0, 180);
		
		g2d.setColor(Color.white);
		g2d.fillOval(268, 230, 20, 28);
		g2d.fillOval(320, 200, 20, 28);
		g2d.fillOval(370, 200, 20, 28);
		g2d.fillOval(400, 150, 20, 28);
		g2d.fillRoundRect(152, 280, 130, 30, 50, 50);
		g2d.fillOval(268, 320, 20, 28);
		//pilares azul
		g2d.setColor(new Color(118,178,215));
		g2d.fillRect(250, 400, 150, 150);
		g2d.fillArc(250, 350, 150, 100, 0, 180);
		
		g2d.fillRect(-40, 400, 150, 150);
		g2d.fillArc(-40, 350, 150, 100, 0, 180);
		
		g2d.fillRect(400, 300, 150, 150);
		g2d.fillArc(400, 250, 150, 100, 0, 180);
		
		g2d.setColor(new Color(198,227,230));
		g2d.fillOval(430, 300, 20, 28);
		g2d.fillOval(470, 370, 20, 28);
		//cuadrados
		g2d.setColor(Color.black);
		g2d.fillRoundRect(518, 318, 40, 40, 6, 6);
		g2d.fillRoundRect(518, 358, 40, 40, 6, 6);
		g2d.fillRoundRect(518, 398, 40, 40, 6, 6);
		
		g2d.fillRoundRect(558, 318, 40, 40, 6, 6);
		g2d.fillRoundRect(598, 318, 40, 40, 6, 6);
		
		g2d.setColor(new Color(205,202,208));
		g2d.fillRoundRect(520, 320, 36, 36, 6, 6);
		g2d.fillRoundRect(520, 360, 36, 36, 6, 6);
		g2d.fillRoundRect(520, 400, 36, 36, 6, 6);
		
		g2d.setColor(new Color(255,213,52));
		g2d.fillRoundRect(560, 320, 36, 36, 6, 6);
		g2d.fillRoundRect(600, 320, 36, 36, 6, 6);
		
		g2d.setColor(Color.black);
		g2d.fillRect(288, 368, 60, 60);
		g2d.fillRect(286, 348, 65, 20);
		
		g2d.fillRect(565, 398, 56, 58);
		g2d.fillRect(563, 378, 56, 20);
		
		g2d.setColor(new Color(135,131,204));
		g2d.fillRect(290, 370, 56, 58);
		g2d.fillRect(288, 350, 61, 18);
		
		g2d.fillRect(567, 400, 53, 48);
		g2d.fillRect(565, 380, 56, 17);
		
		//suelo
		g2d.setColor(new Color(207,157,99));
		g2d.fillRect(0, 450, 700, 50);
		//pasto
		g2d.setColor(new Color(10,198,18));
		g2d.fillRect(0, 430, 700, 20);
		//
		
		
	}
}
