package calculadora;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Calculadora extends JFrame {

	public Calculadora() {
		
		this.setTitle("Calculadora");
		this.setVisible(true);
		this.setSize(370,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true);
		
		this.setLayout(null);
		
		this.componentes();
	}
	
	public void componentes() {
		
		JPanel pantalla = new JPanel();
		pantalla.setSize(this.getWidth(), this.getHeight());
		pantalla.setLocation(0,0);
		pantalla.setLayout(null);
		pantalla.setBackground(Color.black);
		
		JLabel num7 = new JLabel("7",0);
		num7.setFont(new Font("Arial", Font.BOLD,30));
		num7.setBackground(Color.gray);
		num7.setForeground(Color.white);
		num7.setBounds(10, 210, 70,70 );
		num7.setOpaque(true);
		pantalla.add(num7);
		
		JLabel num8 = new JLabel("8",0);
		num8.setFont(new Font("Arial", Font.BOLD,30));
		num8.setBackground(Color.gray);
		num8.setForeground(Color.white);
		num8.setBounds(95, 210, 70,70 );
		num8.setOpaque(true);
		pantalla.add(num8);
		
		JLabel num9 = new JLabel("9",0);
		num9.setFont(new Font("Arial", Font.BOLD,30));
		num9.setBackground(Color.gray);
		num9.setForeground(Color.white);
		num9.setBounds(180, 210, 70,70 );
		num9.setOpaque(true);
		pantalla.add(num9);
		
		JLabel num4 = new JLabel("4",0);
		num4.setFont(new Font("Arial", Font.BOLD,30));
		num4.setBackground(Color.gray);
		num4.setForeground(Color.white);
		num4.setBounds(10, 290, 70,70 );
		num4.setOpaque(true);
		pantalla.add(num4);
		
		JLabel num5 = new JLabel("5",0);
		num5.setFont(new Font("Arial", Font.BOLD,30));
		num5.setBackground(Color.gray);
		num5.setForeground(Color.white);
		num5.setBounds(95, 290, 70,70 );
		num5.setOpaque(true);
		pantalla.add(num5);
		
		JLabel num6 = new JLabel("6",0);
		num6.setFont(new Font("Arial", Font.BOLD,30));
		num6.setBackground(Color.gray);
		num6.setForeground(Color.white);
		num6.setBounds(180, 290, 70,70 );
		num6.setOpaque(true);
		pantalla.add(num6);
		
		JLabel num1 = new JLabel("1",0);
		num1.setFont(new Font("Arial", Font.BOLD,30));
		num1.setBackground(Color.gray);
		num1.setForeground(Color.white);
		num1.setBounds(10, 370, 70,70);
		num1.setOpaque(true);
		pantalla.add(num1);
		
		JLabel num2 = new JLabel("2",0);
		num2.setFont(new Font("Arial", Font.BOLD,30));
		num2.setBackground(Color.gray);
		num2.setForeground(Color.white);
		num2.setBounds(95, 370, 70,70 );
		num2.setOpaque(true);
		pantalla.add(num2);
		
		JLabel num3 = new JLabel("3",0);
		num3.setFont(new Font("Arial", Font.BOLD,30));
		num3.setBackground(Color.gray);
		num3.setForeground(Color.white);
		num3.setBounds(180, 370, 70,70);
		num3.setOpaque(true);
		pantalla.add(num3);
		
		JLabel num0 = new JLabel("   0");
		num0.setFont(new Font("Arial", Font.BOLD,30));
		num0.setBackground(Color.gray);
		num0.setForeground(Color.white);
		num0.setBounds(10, 450, 155,70 );
		num0.setOpaque(true);
		pantalla.add(num0);
		
		JLabel punto = new JLabel(".",0);
		punto.setFont(new Font("Arial", Font.BOLD,30));
		punto.setBackground(Color.gray);
		punto.setForeground(Color.white);
		punto.setBounds(180, 450, 70,70 );
		punto.setOpaque(true);
		pantalla.add(punto);
		
		JLabel igual = new JLabel("=",0);
		igual.setFont(new Font("Arial", Font.BOLD,30));
		igual.setBackground(Color.orange);
		igual.setForeground(Color.white);
		igual.setBounds(265, 450, 70,70 );
		igual.setOpaque(true);
		pantalla.add(igual);
		
		JLabel mas = new JLabel("+",0);
		mas.setFont(new Font("Arial", Font.BOLD,30));
		mas.setBackground(Color.orange);
		mas.setForeground(Color.white);
		mas.setBounds(265, 370, 70,70 );
		mas.setOpaque(true);
		pantalla.add(mas);
		
		JLabel menos = new JLabel("-",0);
		menos.setFont(new Font("Arial", Font.BOLD,30));
		menos.setBackground(Color.orange);
		menos.setForeground(Color.white);
		menos.setBounds(265, 290, 70,70 );
		menos.setOpaque(true);
		pantalla.add(menos);
		
		JLabel por = new JLabel("x",0);
		por.setFont(new Font("Arial", Font.BOLD,30));
		por.setBackground(Color.orange);
		por.setForeground(Color.white);
		por.setBounds(265, 210, 70,70 );
		por.setOpaque(true);
		pantalla.add(por);
		
		JLabel division = new JLabel("÷",0);
		division.setFont(new Font("Arial", Font.BOLD,30));
		division.setBackground(Color.orange);
		division.setForeground(Color.white);
		division.setBounds(265, 130, 70,70 );
		division.setOpaque(true);
		pantalla.add(division);
		
		JLabel porcentaje = new JLabel("%",0);
		porcentaje.setFont(new Font("Agency FB", Font.BOLD,30));
		porcentaje.setBackground(Color.lightGray);
		porcentaje.setForeground(Color.black);
		porcentaje.setBounds(180, 130, 70,70 );
		porcentaje.setOpaque(true);
		pantalla.add(porcentaje);
		
		JLabel masMenos = new JLabel("+/-",0);
		masMenos.setFont(new Font("Agency FB", Font.BOLD,30));
		masMenos.setBackground(Color.lightGray);
		masMenos.setForeground(Color.black);
		masMenos.setBounds(95, 130, 70,70 );
		masMenos.setOpaque(true);
		pantalla.add(masMenos);
		
		JLabel borrar = new JLabel("AC",0);
		borrar.setFont(new Font("Arial", Font.BOLD,30));
		borrar.setBackground(Color.lightGray);
		borrar.setForeground(Color.black);
		borrar.setBounds(10, 130, 70,70 );
		borrar.setOpaque(true);
		pantalla.add(borrar);
		
		JLabel resultado = new JLabel("0",0);
		resultado.setFont(new Font("Arial", Font.BOLD,30));
		resultado.setBackground(Color.black);
		resultado.setForeground(Color.white);
		resultado.setBounds(265, 60, 70,70 );
		resultado.setOpaque(true);
		pantalla.add(resultado);
		
		this.add(pantalla);
		this.repaint();
	}
}
