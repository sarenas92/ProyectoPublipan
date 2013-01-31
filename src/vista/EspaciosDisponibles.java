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
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


public class EspaciosDisponibles extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspaciosDisponibles frame = new EspaciosDisponibles();
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
	public EspaciosDisponibles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(10, 206, 53, 37);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(10, 167, 53, 37);
		contentPane.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBackground(new Color(34, 139, 34));
		panel_8.setBounds(10, 128, 53, 37);
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_9.setBackground(new Color(34, 139, 34));
		panel_9.setBounds(10, 89, 53, 37);
		contentPane.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(10, 50, 53, 37);
		contentPane.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_11.setBackground(new Color(34, 139, 34));
		panel_11.setBounds(10, 11, 53, 37);
		contentPane.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(65, 167, 53, 37);
		contentPane.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_13.setBackground(new Color(34, 139, 34));
		panel_13.setBounds(65, 206, 53, 37);
		contentPane.add(panel_13);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_16.setBackground(new Color(34, 139, 34));
		panel_16.setBounds(65, 128, 53, 37);
		contentPane.add(panel_16);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_19.setBackground(new Color(34, 139, 34));
		panel_19.setBounds(65, 89, 53, 37);
		contentPane.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(65, 50, 53, 37);
		contentPane.add(panel_20);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(65, 11, 53, 37);
		contentPane.add(panel_23);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(120, 206, 53, 37);
		contentPane.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(175, 206, 53, 37);
		contentPane.add(panel_15);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(175, 167, 53, 37);
		contentPane.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(120, 167, 53, 37);
		contentPane.add(panel_18);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(120, 128, 53, 37);
		contentPane.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(175, 128, 53, 37);
		contentPane.add(panel_22);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(120, 89, 53, 37);
		contentPane.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(175, 89, 53, 37);
		contentPane.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(120, 50, 53, 37);
		contentPane.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_27.setBackground(new Color(34, 139, 34));
		panel_27.setBounds(175, 50, 53, 37);
		contentPane.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(120, 11, 53, 37);
		contentPane.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(175, 11, 53, 37);
		contentPane.add(panel_29);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				formu miformulario = new formu();
				miformulario.setVisible(true);
				miformulario.setDefaultCloseOperation(1);
			}
		});
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setBounds(277, 25, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(277, 64, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnEspaciosDisponibles = new JButton("Espacios Disponibles");
		btnEspaciosDisponibles.setBounds(277, 103, 155, 23);
		contentPane.add(btnEspaciosDisponibles);
		
		JButton btnNewButton_2 = new JButton("Espacios Reservados");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(277, 142, 155, 23);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(277, 206, 10, 10);
		contentPane.add(panel);
		
		JLabel lblEspeciosDisponibles = new JLabel("Espacios Disponibles");
		lblEspeciosDisponibles.setBounds(293, 202, 97, 14);
		contentPane.add(lblEspeciosDisponibles);
	}
}
