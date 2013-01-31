package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Bolsa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bolsa frame = new Bolsa();
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
	public Bolsa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 53, 37);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 50, 53, 37);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 89, 53, 37);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 128, 53, 37);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 167, 53, 37);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(10, 206, 53, 37);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(65, 206, 53, 37);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(65, 167, 53, 37);
		contentPane.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(65, 128, 53, 37);
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(65, 89, 53, 37);
		contentPane.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(65, 50, 53, 37);
		contentPane.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(65, 11, 53, 37);
		contentPane.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(120, 11, 53, 37);
		contentPane.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(120, 50, 53, 37);
		contentPane.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(175, 11, 53, 37);
		contentPane.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(175, 50, 53, 37);
		contentPane.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(175, 89, 53, 37);
		contentPane.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(120, 89, 53, 37);
		contentPane.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(120, 128, 53, 37);
		contentPane.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(175, 128, 53, 37);
		contentPane.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(175, 167, 53, 37);
		contentPane.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(120, 167, 53, 37);
		contentPane.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(120, 206, 53, 37);
		contentPane.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(175, 206, 53, 37);
		contentPane.add(panel_23);
		
		JButton button_1 = new JButton("Borrar");
		button_1.setBounds(277, 60, 91, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Espacios Disponibles");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EspaciosDisponibles Disponibles = new EspaciosDisponibles();
				Disponibles.setVisible(true);			}
		});
		button_2.setBounds(277, 99, 155, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Espacios Reservados");
		button_3.setBounds(277, 138, 155, 23);
		contentPane.add(button_3);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				
				JOptionPane.showMessageDialog(null, "Seleccione Los espacios que Desea Asignar");
			}
		});
		btnAgregar.setBounds(277, 25, 91, 23);
		contentPane.add(btnAgregar);
	}

}
