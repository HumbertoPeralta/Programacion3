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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class Ventana extends JFrame implements KeyListener{
	public Ventana() {
		this.setTitle("Ventanota");
		this.setVisible(true);
		this.setSize(650,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		//this.setLayout(null);
		
		this.teclado();
		
		this.addKeyListener(this);
		
	}
	
	public void teclado() {
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.lightGray);
		
		
		JPanel escribir= new JPanel();
		escribir.setBounds(0, 0, 520, 100);
		escribir.setBackground(Color.blue);
		panel.add(escribir);
		
		JLabel time = new JLabel("Tiempo    0:00",0);
		time.setBounds(530, 0, 80, 20);
		time.setBackground(Color.white);
		time.setOpaque(true);
		panel.add(time);
		JLabel q = new JLabel("Q",0);
		q.setBounds(0, 105, 50, 50);
		q.setBackground(Color.white);
		q.setOpaque(true);
		panel.add(q);
		
		JLabel w = new JLabel("W",0);
		w.setBounds(52, 105, 50, 50);
		w.setBackground(Color.white);
		w.setOpaque(true);
		panel.add(w);
		
		JLabel e = new JLabel("E",0);
		e.setBounds(104, 105, 50, 50);
		e.setBackground(Color.white);
		e.setOpaque(true);
		panel.add(e);

		JLabel r = new JLabel("R",0);
		r.setBounds(156, 105, 50, 50);
		r.setBackground(Color.white);
		r.setOpaque(true);
		panel.add(r);

		JLabel t = new JLabel("T",0);
		t.setBounds(208, 105, 50, 50);
		t.setBackground(Color.white);
		t.setOpaque(true);
		panel.add(t);
		
		JLabel y = new JLabel("Y",0);
		y.setBounds(260, 105, 50, 50);
		y.setBackground(Color.white);
		y.setOpaque(true);
		panel.add(y);
		
		JLabel u = new JLabel("U",0);
		u.setBounds(312, 105, 50, 50);
		u.setBackground(Color.white);
		u.setOpaque(true);
		panel.add(u);
		
		JLabel i = new JLabel("I",0);
		i.setBounds(364, 105, 50, 50);
		i.setBackground(Color.white);
		i.setOpaque(true);
		panel.add(i);
		
		JLabel o = new JLabel("O",0);
		o.setBounds(416, 105, 50, 50);
		o.setBackground(Color.white);
		o.setOpaque(true);
		panel.add(o);
		
		JLabel p = new JLabel("P",0);
		p.setBounds(468, 105, 50, 50);
		p.setBackground(Color.white);
		p.setOpaque(true);
		panel.add(p);
		
		JLabel a = new JLabel("A",0);
		a.setBounds(0, 160, 50, 50);
		a.setBackground(Color.white);
		a.setOpaque(true);
		panel.add(a);
		
		JLabel s = new JLabel("S",0);
		s.setBounds(52, 160, 50, 50);
		s.setBackground(Color.white);
		s.setOpaque(true);
		panel.add(s);
		
		JLabel d = new JLabel("D",0);
		d.setBounds(104, 160, 50, 50);
		d.setBackground(Color.white);
		d.setOpaque(true);
		panel.add(d);

		JLabel f = new JLabel("F",0);
		f.setBounds(156, 160, 50, 50);
		f.setBackground(Color.white);
		f.setOpaque(true);
		panel.add(f);

		JLabel g = new JLabel("G",0);
		g.setBounds(208, 160, 50, 50);
		g.setBackground(Color.white);
		g.setOpaque(true);
		panel.add(g);
		
		JLabel h = new JLabel("H",0);
		h.setBounds(260, 160, 50, 50);
		h.setBackground(Color.white);
		h.setOpaque(true);
		panel.add(h);
		
		JLabel j = new JLabel("J",0);
		j.setBounds(312, 160, 50, 50);
		j.setBackground(Color.white);
		j.setOpaque(true);
		panel.add(j);
		
		JLabel k = new JLabel("K",0);
		k.setBounds(364, 160, 50, 50);
		k.setBackground(Color.white);
		k.setOpaque(true);
		panel.add(k);
		
		JLabel l = new JLabel("L",0);
		l.setBounds(416, 160, 50, 50);
		l.setBackground(Color.white);
		l.setOpaque(true);
		panel.add(l);
		
		JLabel ñ = new JLabel("Ñ",0);
		ñ.setBounds(468, 160, 50, 50);
		ñ.setBackground(Color.white);
		ñ.setOpaque(true);
		panel.add(ñ);
		
		JLabel z = new JLabel("Z",0);
		z.setBounds(0, 215, 50, 50);
		z.setBackground(Color.white);
		z.setOpaque(true);
		panel.add(z);
		
		JLabel x = new JLabel("X",0);
		x.setBounds(52, 215, 50, 50);
		x.setBackground(Color.white);
		x.setOpaque(true);
		panel.add(x);
		
		JLabel c = new JLabel("C",0);
		c.setBounds(104, 215, 50, 50);
		c.setBackground(Color.white);
		c.setOpaque(true);
		panel.add(c);

		JLabel v = new JLabel("V",0);
		v.setBounds(156, 215, 50, 50);
		v.setBackground(Color.white);
		v.setOpaque(true);
		panel.add(v);

		JLabel b = new JLabel("B",0);
		b.setBounds(208, 215, 50, 50);
		b.setBackground(Color.white);
		b.setOpaque(true);
		panel.add(b);
		
		JLabel n = new JLabel("N",0);
		n.setBounds(260, 215, 50, 50);
		n.setBackground(Color.white);
		n.setOpaque(true);
		panel.add(n);
		
		JLabel m = new JLabel("M",0);
		m.setBounds(312, 215, 50, 50);
		m.setBackground(Color.white);
		m.setOpaque(true);
		panel.add(m);
		
		JLabel espacio = new JLabel("ESPACIO",0);
		espacio.setBounds(530, 160, 80, 50);
		espacio.setBackground(Color.white);
		espacio.setOpaque(true);
		panel.add(espacio);
		
		JLabel eliminar = new JLabel("DELETE",0);
		eliminar.setBounds(530, 105, 80, 50);
		eliminar.setBackground(Color.white);
		eliminar.setOpaque(true);
		panel.add(eliminar);
		
		this.add(panel);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
} 
