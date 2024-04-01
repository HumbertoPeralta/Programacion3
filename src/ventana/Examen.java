package ventana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Examen extends JFrame {

	public Examen() {
		this.setTitle("Examen");
		this.setVisible(true);
		this.setSize(600,650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.componentes();
	}
	
	public void componentes() {
		
		JPanel fondo= new JPanel();
		fondo.setSize(this.getWidth(),this.getHeight());
		fondo.setBackground(Color.white);
		fondo.setLayout(null);

		JLabel titulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		titulo.setFont(new Font("Arial", Font.BOLD, 16));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(24, 11, 391, 21);
		fondo.add(titulo);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 574, 55);
		panel.setBackground(new Color(0, 102, 153));
		panel.setLayout(null);
		fondo.add(panel);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 59, 574, 519);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		fondo.add(panel_1);
		
		JLabel titulo_panel2 = new JLabel("Datos del cliente");
		titulo_panel2.setBackground(Color.WHITE);
		titulo_panel2.setBounds(30, 28, 107, 14);
		titulo_panel2.setOpaque(true);
		panel_1.add(titulo_panel2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBounds(25, 32, 522, 86);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_1.add(panel_2);
		
		JLabel documento = new JLabel("Documento: ");
		documento.setBounds(10, 24, 84, 14);
		documento.setBackground(Color.WHITE);
		panel_2.add(documento);
		
		JLabel direccion = new JLabel("Dirección: ");
		direccion.setBackground(Color.WHITE);
		direccion.setBounds(10, 61, 61, 14);
		panel_2.add(direccion);
		
		
		JTextField documento_text= new JTextField();
		documento_text.setBounds(81, 24, 106, 14);
		documento_text.setColumns(10);
		panel_2.add(documento_text);
		
		JTextField direccion_text = new JTextField();
		direccion_text.setColumns(10);
		direccion_text.setBounds(81, 61, 106, 14);
		panel_2.add(direccion_text);
		
		JLabel nombres = new JLabel("Nombres: ");
		nombres.setBackground(Color.WHITE);
		nombres.setBounds(262, 24, 61, 14);
		panel_2.add(nombres);
		
		JLabel telefono = new JLabel("Teléfono: ");
		telefono.setBackground(Color.WHITE);
		telefono.setBounds(262, 61, 61, 14);
		panel_2.add(telefono);
		
		JTextField nombres_text = new JTextField();
		nombres_text.setColumns(10);
		nombres_text.setBounds(322, 24, 106, 14);
		panel_2.add(nombres_text);
		
		JTextField telefono_text = new JTextField();
		telefono_text.setColumns(10);
		telefono_text.setBounds(322, 61, 106, 14);
		panel_2.add(telefono_text);
		
		JLabel factura_text = new JLabel("Datos de factura");
		factura_text.setBackground(Color.WHITE);
		factura_text.setBounds(30, 122, 85, 14);
		factura_text.setOpaque(true);
		panel_1.add(factura_text);
		
		JPanel panel_factura = new JPanel();
		panel_factura.setLayout(null);
		panel_factura.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_factura.setBackground(Color.WHITE);
		panel_factura.setBounds(25, 129, 522, 68);
		panel_1.add(panel_factura);
		
		JLabel num_factura = new JLabel("N° Factura: ");
		num_factura.setBackground(Color.WHITE);
		num_factura.setBounds(10, 26, 91, 14);
		panel_factura.add(num_factura);
		
		JLabel num = new JLabel("1");
		num.setFont(new Font("Arial Black", Font.BOLD, 11));
		num.setBackground(Color.WHITE);
		num.setBounds(85, 25, 61, 14);
		panel_factura.add(num);
		
		JLabel fecha = new JLabel("Fecha:");
		fecha.setBackground(Color.WHITE);
		fecha.setBounds(264, 26, 61, 14);
		panel_factura.add(fecha);
		
		JLabel fecha_text = new JLabel("2021/50/21");
		fecha_text.setFont(new Font("Arial Black", Font.BOLD, 11));
		fecha_text.setBackground(Color.WHITE);
		fecha_text.setBounds(328, 25, 91, 14);
		panel_factura.add(fecha_text);
		
		
		JPanel panel_lista = new JPanel();
		panel_lista.setLayout(null);
		panel_lista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_lista.setBackground(Color.WHITE);
		panel_lista.setBounds(25, 208, 522, 38);
		panel_1.add(panel_lista);
		
		JLabel listado = new JLabel("Ver listado de facturas");
		listado.setIcon(new ImageIcon(Prueba.class.getResource("/ventana/lista.png")));
		listado.setBounds(10, 11, 179, 20);
		panel_lista.add(listado);
		
		JLabel eliminar = new JLabel("Eliminar");
		eliminar.setIcon(new ImageIcon(Prueba.class.getResource("/ventana/eliminar.png")));
		eliminar.setBounds(454, 11, 79, 20);
		panel_lista.add(eliminar);
		
		JLabel añadir = new JLabel("Añadir");
		añadir.setIcon(new ImageIcon(Prueba.class.getResource("/ventana/anadir.png")));
		añadir.setBounds(386, 11, 58, 20);
		panel_lista.add(añadir);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Valor", "Sub Total"},
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		table.setBorder(new LineBorder(Color.BLACK));
		table.setColumnSelectionAllowed(true);
		table.setBounds(25, 257, 522, 91);
		panel_1.add(table);
		
		JLabel subtotal = new JLabel("SubTotal:");
		subtotal.setBounds(30, 378, 70, 14);
		panel_1.add(subtotal);
		
		JLabel subtotal_num = new JLabel("6600.0");
		subtotal_num.setFont(new Font("Arial Black", Font.BOLD, 11));
		subtotal_num.setBounds(110, 377, 46, 14);
		panel_1.add(subtotal_num);
		
		JLabel descuento = new JLabel("% Descuento:");
		descuento.setBounds(29, 399, 86, 14);
		panel_1.add(descuento);
		
		JTextField descuento_num = new JTextField();
		descuento_num.setBounds(110, 399, 46, 14);
		descuento_num.setColumns(10);
		panel_1.add(descuento_num);
		
		JCheckBox verificar = new JCheckBox("");
		verificar.setBounds(162, 395, 21, 23);
		panel_1.add(verificar);
		
		JLabel iva = new JLabel("IVA 19%:");
		iva.setBounds(30, 424, 69, 14);
		panel_1.add(iva);
		
		JLabel total = new JLabel("Total factura:");
		total.setBounds(30, 449, 85, 14);
		panel_1.add(total);
		
		JLabel iva_num = new JLabel("1254.0");
		iva_num.setFont(new Font("Arial Black", Font.BOLD, 11));
		iva_num.setBounds(110, 424, 46, 14);
		panel_1.add(iva_num);
		
		JLabel total_num = new JLabel("7524.0");
		total_num.setFont(new Font("Arial Black", Font.BOLD, 11));
		total_num.setBounds(110, 449, 46, 14);
		panel_1.add(total_num);
		
		JLabel valor = new JLabel("Valor descontado:");
		valor.setBounds(275, 399, 136, 14);
		panel_1.add(valor);
		
		JLabel valor_num = new JLabel("330.0");
		valor_num.setFont(new Font("Arial Black", Font.BOLD, 11));
		valor_num.setBounds(379, 398, 46, 14);
		panel_1.add(valor_num);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.setBounds(458, 485, 89, 23);
		panel_1.add(limpiar);
		
		JButton btnFinalizarFactura = new JButton("Finalizar Factura");
		btnFinalizarFactura.setBounds(304, 485, 136, 23);
		panel_1.add(btnFinalizarFactura);
		
		
		JPanel fondoabajo = new JPanel();
		fondoabajo.setLayout(null);
		fondoabajo.setBackground(new Color(0, 102, 153));
		fondoabajo.setBounds(5, 571, 574, 29);
		fondo.add(fondoabajo);
		
		fondo.repaint();
		this.add(fondo);
	}
}
