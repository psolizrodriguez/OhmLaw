package com.ohmlaw.simulator.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Simulador_de_Ohm extends JFrame {
	private static final long serialVersionUID = 1L;
	ImageIcon[] imagenes;
	boolean cambia;
	Ley_de_ohm lo;
	private JPanel jPanel1 = new JPanel();
	private JPanel jPanel2 = new JPanel();
	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel2 = new JLabel();
	private JLabel jLabel3 = new JLabel();
	private JLabel jLabel5 = new JLabel();
	private JLabel jLabel7 = new JLabel();
	private JLabel jLabel8 = new JLabel();
	private JSlider jSlider1 = new JSlider();
	private JLabel jLabel9 = new JLabel();
	private JLabel jLabel10 = new JLabel();
	private JLabel jLabel11 = new JLabel();
	private JComboBox<ImageIcon> jComboBox1;
	private JLabel jLabel12 = new JLabel();
	private JSlider jSlider2 = new JSlider();
	private JLabel jLabel13 = new JLabel();
	private JLabel jLabel4 = new JLabel();
	private JLabel jLabel6 = new JLabel();
	private JLabel jLabel14 = new JLabel();
	private JLabel jLabel15 = new JLabel();
	private JPanel jPanel3 = new JPanel();
	private JPanel jPanel4 = new JPanel();

	public Simulador_de_Ohm() {
		cambia = false;
		lo = new Ley_de_ohm();
		imagenes = new ImageIcon[4];
		imagenes[0] = new ImageIcon(Simulador_de_Ohm.class.getResource("/images/rojo.JPG"));
		imagenes[1] = new ImageIcon(Simulador_de_Ohm.class.getResource("/images/amarillo.JPG"));
		imagenes[2] = new ImageIcon(Simulador_de_Ohm.class.getResource("/images/verde.JPG"));
		imagenes[3] = new ImageIcon(Simulador_de_Ohm.class.getResource("/images/azul.JPG"));
		jComboBox1 = new JComboBox<ImageIcon>(imagenes);

		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void jbInit() throws Exception {

		jSlider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				jSlider2_stateChanged(e);
			}
		});
		jSlider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				jSlider1_stateChanged(e);
			}
		});

		this.getContentPane().setLayout(null);
		this.setSize(new Dimension(480, 424));
		this.setDefaultCloseOperation(3);
		this.setTitle("Ley de Ohm");
		jPanel1.setBounds(new Rectangle(40, 10, 390, 270));
		jPanel1.setBackground(Color.white);
		jPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jPanel1.setLayout(null);
		jPanel2.setBounds(new Rectangle(50, 285, 370, 105));
		jPanel2.setBackground(Color.white);
		jPanel2.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jPanel2.setLayout(null);
		jLabel1.setText("Voltaje Recomendado");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Tahoma", 3, 14));
		jLabel1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel1.setBackground(Color.lightGray);
		jLabel1.setBounds(new Rectangle(0, 0, 165, 25));
		jLabel2.setText("Resistencia Recomendada");
		jLabel2.setBounds(new Rectangle(165, 0, 185, 25));
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setFont(new Font("Tahoma", 3, 14));
		jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel3.setText("0 V");
		jLabel3.setBounds(new Rectangle(10, 40, 165, 40));
		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setFont(new Font("Tahoma", 0, 20));
		jLabel3.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel5.setText("0");
		jLabel5.setBounds(new Rectangle(175, 40, 145, 40));
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setFont(new Font("Tahoma", 0, 20));
		jLabel5.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel7.setBounds(new Rectangle(120, 95, 140, 145));
		jLabel7.setSize(new Dimension(140, 145));
		jLabel7.setIcon(new ImageIcon(Simulador_de_Ohm.class.getResource("/images/circuito.JPG")));
		jLabel8.setText("0 V");
		jLabel8.setBounds(new Rectangle(65, 155, 60, 35));
		jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel8.setFont(new Font("Tahoma", 1, 15));
		jSlider1.setBounds(new Rectangle(15, 90, 50, 175));
		jSlider1.setMaximum(11);
		jSlider1.setModel(new DefaultBoundedRangeModel(0, 0, 0, 13));
		jSlider1.setOrientation(JSlider.VERTICAL);
		jSlider1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jSlider1.setPaintTicks(true);
		jSlider1.setPaintLabels(true);
		jSlider1.setValue(0);

		jSlider1.setMajorTickSpacing(1);
		jSlider1.setVerifyInputWhenFocusTarget(false);
		jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				jSlider1_mouseDragged(e);
			}
		});
		jLabel9.setText("VOLTIOS");
		jLabel9.setBounds(new Rectangle(5, 65, 70, 25));
		jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel9.setFont(new Font("Tahoma", 1, 15));
		jLabel10.setText("0");
		jLabel10.setBounds(new Rectangle(170, 65, 50, 35));
		jLabel10.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel10.setFont(new Font("Tahoma", 1, 15));
		jLabel11.setBounds(new Rectangle(260, 95, 70, 145));
		jLabel11.setSize(new Dimension(70, 145));
		jLabel11.setIcon(new ImageIcon(Simulador_de_Ohm.class.getResource("/images/rojo1.JPG")));
		jComboBox1.setBounds(new Rectangle(285, 85, 68, 34));
		jLabel12.setText("OHMIOS");
		jLabel12.setBounds(new Rectangle(145, 0, 80, 25));
		jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel12.setFont(new Font("Tahoma", 1, 15));
		jSlider2.setBounds(new Rectangle(10, 20, 360, 45));
		jSlider2.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jSlider2.setModel(new DefaultBoundedRangeModel(50, 0, 0, 200));
		jSlider2.setMajorTickSpacing(20);
		jSlider2.setPaintTicks(true);
		jSlider2.setPaintLabels(true);
		jSlider2.setValue(0);

		jSlider2.addInputMethodListener(new InputMethodListener() {
			public void inputMethodTextChanged(InputMethodEvent e) {
			}

			public void caretPositionChanged(InputMethodEvent e) {
				jSlider2_caretPositionChanged(e);
			}
		});
		jSlider2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				jSlider2_mouseMoved(e);
			}

			public void mouseDragged(MouseEvent e) {
				jSlider2_mouseDragged(e);
			}
		});
		jSlider2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				jSlider2_keyReleased(e);
			}
		});
		jSlider2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				jSlider2_mousePressed(e);
			}

			public void mouseReleased(MouseEvent e) {
				jSlider2_mouseReleased(e);
			}
		});
		jLabel13.setText("DIODO");
		jLabel13.setBounds(new Rectangle(275, 65, 80, 25));
		jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel13.setFont(new Font("Tahoma", 1, 15));
		jLabel4.setText("10 V");
		jLabel4.setBounds(new Rectangle(220, 240, 170, 25));
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setFont(new Font("Tahoma", 0, 20));
		jLabel4.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel4.setText("Indeterminado");
		jLabel6.setText("Intensidad(A)");
		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel6.setFont(new Font("Tahoma", 3, 14));
		jLabel6.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel6.setBounds(new Rectangle(0, 0, 115, 25));
		jLabel14.setBounds(new Rectangle(320, 40, 40, 40));
		jLabel14.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		jLabel14.setIcon(new ImageIcon(Simulador_de_Ohm.class.getResource("/images/omt.JPG")));
		jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel15.setBounds(new Rectangle(225, 70, 20, 20));
		jLabel15.setSize(new Dimension(20, 20));
		jLabel15.setIcon(new ImageIcon(Simulador_de_Ohm.class.getResource("/images/omt.JPG")));
		jPanel3.setBounds(new Rectangle(10, 15, 350, 25));
		jPanel3.setLayout(null);
		jPanel4.setBounds(new Rectangle(110, 240, 115, 25));
		jPanel4.setLayout(null);
		jComboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jComboBox1_actionPerformed(e);
			}
		});
		jPanel3.add(jLabel1, null);
		jPanel3.add(jLabel2, null);
		jPanel2.add(jPanel3, null);
		jPanel2.add(jLabel14, null);
		jPanel2.add(jLabel5, null);
		jPanel2.add(jLabel3, null);
		this.getContentPane().add(jPanel2, null);
		this.getContentPane().add(jPanel1, null);
		jPanel4.add(jLabel6, null);
		jPanel1.add(jPanel4, null);
		jPanel1.add(jLabel15, null);
		jPanel1.add(jLabel4, null);
		jPanel1.add(jLabel13, null);
		jPanel1.add(jSlider2, null);
		jPanel1.add(jLabel12, null);
		jPanel1.add(jComboBox1, null);
		jPanel1.add(jLabel11, null);
		jPanel1.add(jLabel10, null);
		jPanel1.add(jLabel9, null);
		jPanel1.add(jSlider1, null);
		jPanel1.add(jLabel8, null);
		jPanel1.add(jLabel7, null);

	}

	public static void main(String arg[]) {
		Simulador_de_Ohm o1 = new Simulador_de_Ohm();
		o1.setBounds(300, 150, o1.getWidth(), o1.getHeight());
		o1.setVisible(true);
	}

	private void jComboBox1_actionPerformed(ActionEvent e) {
		int aux = jComboBox1.getSelectedIndex();
		lo.setTipo_de_led(aux);
		Cambiar_luz();
	}

	public void Cambiar_luz() {
		int aux = lo.getTipo_de_led();
		String color = "rojo";
		int luz = lo.Luz();
		if (aux == 1) {
			color = "amarillo";
		}
		if (aux == 2) {
			color = "verde";
		}
		if (aux == 3) {
			color = "azul";
		}
		if (luz == 11) {
			jLabel11.setIcon(new ImageIcon(Simulador_de_Ohm.class.getResource("/images/roto.JPG")));
		} else {
			jLabel11.setIcon(new ImageIcon(Simulador_de_Ohm.class.getResource("/images/" + color + luz + ".JPG")));
		}

		try {
			String inten = "" + lo.getIntensidad();
			if (inten.length() >= 8) {
				jLabel4.setText(inten.substring(0, 8));
			} else {
				jLabel4.setText(inten);
			}
		} catch (ArithmeticException ex) {
			jLabel4.setText("Indeterminado");
			ex.printStackTrace();
		}
		jLabel3.setText("" + lo.Voltaje());
		jLabel5.setText("" + lo.Resis());
	}

	private void jSlider2_mousePressed(MouseEvent e) {

	}

	private void jSlider2_keyReleased(KeyEvent e) {
	}

	private void jSlider2_mouseReleased(MouseEvent e) {
	}

	private void jSlider2_mouseMoved(MouseEvent e) {
	}

	private void jSlider2_mouseDragged(MouseEvent e) {

	}

	private void jSlider1_mouseDragged(MouseEvent e) {

	}

	private void jSlider2_caretPositionChanged(InputMethodEvent e) {

	}

	boolean vlot = true;

	private void jSlider2_stateChanged(ChangeEvent e) {
		int resistencia = jSlider2.getValue();
		jLabel10.setText("" + resistencia);
		lo.setResistencia(resistencia);
		Cambiar_luz();
	}

	private void jSlider1_stateChanged(ChangeEvent e) {
		if (vlot) {
			vlot = false;
		} else {
			int voltaje = jSlider1.getValue();
			jLabel8.setText(voltaje + " V");
			lo.setVoltaje(voltaje);
			Cambiar_luz();
		}
	}
}