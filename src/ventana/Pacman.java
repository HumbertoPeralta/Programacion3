package ventana;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Pacman extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int x=200;
	private int y=200;
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
	 
	public Pacman() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 457);
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
				
				g2d.setColor(Color.yellow);
				g2d.fillOval(x, y, 30, 30);
				repaint();
				revalidate();
			}
		};
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reinicio");
		panel_1.add(btnNewButton);
		
		addKeyListener(this);
		
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
			y--;
		}
		
		if(keyPressed==KeyEvent.VK_A) {
			System.out.println("Tecla A Presionada");
			x--;
		}
		
		if(keyPressed==KeyEvent.VK_S) {
			System.out.println("Tecla S Presionada");
			y++;
		}
		
		if(keyPressed==KeyEvent.VK_D) {
			System.out.println("Tecla D Presionada");
			x++;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
